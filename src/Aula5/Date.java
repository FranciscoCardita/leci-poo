package Aula5;

public class Date {

    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }

    public static boolean validMonth(int month) {
        if (month < 1 || month > 12) return false;
        else return true;
    }

    public static int monthDays(int month, int year) {
        int days;
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            case 2:
                if (leapYear(year)) {
                    days = 29;
                } else days = 28;
                break;
            default:
                days = 31;
                break;
        }
        return days;
    }

    public static boolean leapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean valid(int day, int month, int year) {
        int days = monthDays(month, year);
        boolean isValid = validMonth(month);
        if (day < 1 || day > days || year < 1) {
            isValid = false;
        }
        return isValid;
    }

    public void set(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void increment() {
        int days = monthDays(month, year);
        day = day + 1;
        if(day > days) {
            if(month == 12) {
                month = 1;
                year++;
            } else {
                month = month + 1;
            }
            day = 1;
        }
    }

    public void decrement() {
        int days = monthDays(month-1, year);
        day = day - 1;
        if(day < 1) {
            if(month == 1) {
                day = 31;
                month = 12;
                year--;
            } else {
                day = days;
                month = month - 1;
            }
        }
    }

    public String toString() {
        return year + "-" + month + "-" + day;
    }
}
