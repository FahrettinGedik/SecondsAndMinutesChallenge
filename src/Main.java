public class Main {

    public static void main(String[] args) {
        System.out.println(getDurationString(3945));  // Example call for seconds-only method
        System.out.println(getDurationString(65, 45)); // Example call for minutes and seconds method
        System.out.println(getDurationString( -3945));
        System.out.println(getDurationString(-65, 45));
        System.out.println(getDurationString(65, 145));
    }

    // Method for seconds-only input; delegates to the second method
    public static String getDurationString(int seconds) {

        if (seconds < 0) {
            return "Invalid value: seconds(" + seconds + "), must be non-negative.";
        }

        // Two steps approach to get hours
        int minutes = seconds / 60;
        return getDurationString(minutes, seconds % 60);

    }

    // Method for handling input in minutes and seconds
    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds >= 60) {
            return "Invalid value: minutes must be non-negative and seconds must be between 0 and 59.";
        }

        // Two steps approach to get hours
        int hours = minutes / 60;
        // System.out.println("hours = " + hours);

        int remainingMinutes = minutes % 60;
        // System.out.println("minutes = " + minutes);
        // System.out.println("remainingMinutes = " + remainingMinutes);

        int remainingSeconds = seconds % 60;
        // System.out.println("remainingSeconds = " + remainingSeconds);

        // Format and return the result
        return  hours + "h " + remainingMinutes + "m " + remainingSeconds + "s";
        // return String.format("%d:%02d:%02d", hours, minutes, seconds);
    }
}