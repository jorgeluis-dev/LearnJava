public class TheSwitch {
    public static void main(String[] args) {
        // Define the day of the week
        String day = "Saturday";

        // Use the switch statement to categorize the day
        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                // This block executes for weekdays
                System.out.println(day + " is a weekday.");
                break;
            case "Saturday":
            case "Sunday":
                // This block executes for weekends
                System.out.println(day + " is a weekend.");
                break;
            default:
                // This block executes if none of the above cases match
                System.out.println(day + " is not a valid day.");
                break;
        }
    }
}
