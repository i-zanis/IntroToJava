import java.util.Scanner;

public class E5_29 {
    public static void main(String[] args) {

        String sMonth, sDay;

        Scanner input = new Scanner(System.in);
        // Enter loan amount
        System.out.print("Enter year:");
        int year = input.nextInt();
        System.out.print("Enter day (0 for Sunday, 1 for Monday and so on):");
        int day = input.nextInt();
        // Going through each month
        for (int month = 1; month <= 12; month++) {

            // Processing month

            switch (month) {
                case 1:
                    sMonth = "January";
                    break;
                case 2:
                    sMonth = "February";
                    break;
                case 3:
                    sMonth = "March";
                    break;
                case 4:
                    sMonth = "April";
                    break;
                case 5:
                    sMonth = "May";
                    break;
                case 6:
                    sMonth = "June";
                    break;
                case 7:
                    sMonth = "July";
                    break;
                case 8:
                    sMonth = "August";
                    break;
                case 9:
                    sMonth = "September";
                    break;
                case 10:
                    sMonth = "October";
                    break;
                case 11:
                    sMonth = "November";
                    break;
                case 12:
                    sMonth = "December";
                    break;
                default:
                    sMonth = "";
            }

            // Printing month and day heading
            // Spaces calculated form length of the month string to make it
            // center. 34 is the line length.
            System.out.printf("%" + (34 + sMonth.length()) / 2 + "s %s\n",
                    sMonth, year);
            System.out.println(String.format("%39S", "").replace(' ', '-'));
            System.out.printf("%-6s%-6s%-6s%-6s%-6s%-6s%-6s\n", "Sun", "Mon",
                    "Tue", "Wed", "Thu", "Fri", "Sat");

            // calculating number of days
            int length = 30 + ((month + (int) (month / 8.0)) % 2);
            if (month == 2) {
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    length = 29;
                } else {
                    length = 28;
                }
            }
            day = (day) % 7;

            switch (day) {
                case 0:
                    sDay = "Sunday";
                    break;
                case 1:
                    sDay = "Monday";
                    break;
                case 2:
                    sDay = "Tuesday";
                    break;
                case 3:
                    sDay = "Wednesday";
                    break;
                case 4:
                    sDay = "Thursday";
                    break;
                case 5:
                    sDay = "Friday";
                    break;
                case 6:
                    sDay = "Saturday";
                    break;
                default:
                    sDay = "";
            }
            // Calculating day

            // Print spaces before the 1st of each month
            if (day != 0) {
                System.out.print(String.format("%" + 6 * day + "s", ""));
            }

            // Loop to print date

            for (int i = 1; i <= length; i++) {
                System.out.printf("%-6d", i);

                // print new line after Saturday
                if (day % 7 == 6) {
                    System.out.println("");
                }
                day += 1;
            }
            // print new line at the end of each month
            System.out.println("");

        }
    }
}