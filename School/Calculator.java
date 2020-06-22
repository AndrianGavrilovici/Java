package com.company;

public class Calculator {

    public float Calculate(float n1, float n2, char op){
        switch (op){
            case '+':
                return n1 + n2;

            case '-':
                return n1 - n2;

            case '*':
                return n1 * n2;

            case '/':
                try {
                    return n1 / n2;
                } catch (Exception e){
                    System.out.println(e.toString());
                }
                break;
        }
        return 0;
    }
}
