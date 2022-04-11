package Aula5;

public class Calendar {

    private int firstWeekday;
    private int year;

    public Calendar(int firstWeekday, int year) {
        this.firstWeekday = firstWeekday;
        this.year = year;
    }

    public int firstWeekdayOfYear() { return firstWeekday; }

    public int getYear() { return year; }

    public int firstWeekdayOfMonth(int month) {
        int weekday = firstWeekday;
        for (int i = 1; i < month; i++) {
			weekday += Date.monthDays(i, year);
		}
		return weekday % 7 == 0 ? 7 : weekday % 7;
    }

    public void printMonth(int month) {
        int weekday = firstWeekdayOfMonth(month);
        int monthDays = Date.monthDays(month, year);
        String monthName = monthName(month);

        System.out.printf("%10s %s%n", monthName, year);
        System.out.println("Su Mo Tu We Th Fr Sa");
        System.out.print(("   ").repeat(weekday - 1));

        for (int i = 1; i <= monthDays; i++) {
            System.out.printf("%2d ", i);
            if((i + weekday - 1) % 7 == 0 || i == monthDays) System.out.println();
        }
    }

    public String monthName(int month) {
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        return months[month-1];
    }

    public String toString() {
        System.out.printf("   %d Calendar%n%n", year);
        
        for (int i = 1; i <= 12; i++) {
            printMonth(i);
            System.out.println();
        }
        return "";
    }
}
