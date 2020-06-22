package com.company;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class AgeCalculation {
    private int year;
    private int month;
    private int day;
    public AgeCalculation(int birthDay, int birthMonth, int birthYear){
        year = 0;
        month = 0;
        day = 0;
        LocalDate today = LocalDate.now();
        int currentDay = today.getDayOfMonth();
        int currentMonth = today.getMonthValue();
        int currentYear = today.getYear();
        this.year = currentYear - birthYear;
        if (currentMonth > birthMonth) {
            this.month = currentMonth - birthMonth;
            verifyDay(currentDay, birthDay);
        } else if (currentMonth < birthMonth) {
            int tempMonth = birthMonth - currentMonth;
            this.month = 12 - tempMonth;
            this.year--;
            verifyDay(currentDay, birthDay);
        } else if (currentDay < birthDay) {
            int tempDay = birthDay - currentDay;
            this.day = 31 - tempDay;
            this.month = 11;
            this.year--;
        } else verifyDay(currentDay, birthDay);
    }
    private void verifyDay(int currentDay, int birthDay){
        if(currentDay > birthDay){
            this.day = currentDay - birthDay;
        }else if(currentDay < birthDay){
            int tempDay = birthDay - currentDay;
            this.day = 31 - tempDay;
            this.month--;
        }
    }
    public void show(){
        System.out.println("Current Date: " + getCurrentDate());
        System.out.println(getYear() + " Years " + getMonth() + " Month " + getDay() + " Day");
    }
    public String getCurrentDate(){ return new SimpleDateFormat("dd/MM/yyyy").format(new Date()); }
    public int getYear(){ return year; }
    public int getMonth(){ return month; }
    public int getDay(){ return day; }
}

