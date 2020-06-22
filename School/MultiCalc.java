package com.company;

public class MultiCalc {
    private String expresie;
    private int rs = 0;
    public void executare(String expresieTrimisa){
        expresie = expresieTrimisa;
        expresie += "+1";
        int start = 0;
        int count = 0;
        char[] op = new char[expresie.length()/2];
        int[] number = new int[expresie.length()];
        for (int i = 0; i < expresie.length(); i++) {
            if (expresie.charAt(i) == '+'){
                number[count] = Integer.parseInt(expresie.substring(start, i));
                op[count] = '+';
                count++;
                start = i+1;
            } else if (expresie.charAt(i)=='-'){
                number[count] = Integer.parseInt(expresie.substring(start, i));
                op[count] = '-';
                count++;
                start = i+1;
            } else if (expresie.charAt(i)=='*'){
                number[count] = Integer.parseInt(expresie.substring(start, i));
                op[count] = '*';
                count++;
                start = i+1;
            } else if (expresie.charAt(i)=='/'){
                number[count] = Integer.parseInt(expresie.substring(start, i));
                op[count] = '/';
                count++;
                start = i+1;
            }
        }
        int s = 0;
        for (int i = 0; i < count; i++) {
            if (i==0) {
                if (op[s] == '+') {
                    rs = operatia(number[i], number[i + 1], '+');
                } else if (op[s] == '-'){
                    rs = operatia(number[i], number[i + 1], '-');
                } else if (op[s] == '*'){
                    rs = operatia(number[i], number[i + 1], '*');
                } else if (op[s] == '/'){
                    rs = operatia(number[i], number[i + 1], '/');
                }
            }else {
                if (op[s] == '+'){
                    rs = operatia(rs,number[i+1], '+');
                } else if (op[s] == '-') {
                    rs = operatia(rs,number[i+1], '-');
                } else if (op[s] == '*') {
                    rs = operatia(rs,number[i+1], '*');
                } else if (op[s] == '/') {
                    rs = operatia(rs,number[i+1], '/');
                }
            }
            s++;
        }
    }
    public int operatia(int a, int b, char op){
        if(op == '+')return a+b;
        else if (op == '-')return a-b;
        else if (op == '*')return a*b;
        else return a/b;
    }
    public void show(){
        System.out.println(expresie.substring(0, expresie.length()-2) + " = " + rs);
    }
}
