package pzeller;

import java.util.Scanner;

/**
 * Version 0.01
 * @author alexcasviu
 */
public class PZeller {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Introduce the year that you want to check: ");
        int year_input = scan.nextInt();
        String name_day = day(check_programmers_day(year_input), 9, year_input);
        System.out.println("The programmers day for the year "+year_input+", fell on september the "+check_programmers_day(year_input)+", that was a "+name_day+".");
        System.out.println("Author: Àlex");
    }

    private static int check_programmers_day(int year) {
        int programmers_day;

        if (year % 4 == 0 && year % 100 != 0) {
            programmers_day = 12;
        } else {
            if (year % 100 == 0 && year % 400 == 0) {
                programmers_day = 12;
            } else {
                programmers_day = 13;
            }
        }
        
        return programmers_day;
    }

    private static String day(int day, int month, int year) {
        int a, y, m, d = 0;

        a = (14 - month) / 12;
        y = year - a;
        m = month + 12 * a - 2;
        d = (day + y + y / 4 - y / 100 + y / 400 + (31 * m) / 12) % 7;

        String days[] = {"Sunday", "Monday", "Tuesday", "Wensday", "Thursday", "Friday", "Saturday"};
        return days[d];
    }

}
