public class Main {

    public static void main(String[] args) {
        System.out.println(getDurationString(125));  // Example call for seconds-only method
        System.out.println(getDurationString(8250)); // Example call for seconds-only method

        System.out.println(getDurationString(2, 5)); // Example call for minutes and seconds method
    }

    // Method for seconds-only input; delegates to the second method
    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid value: seconds must be non-negative.";
        }

        int minutes = seconds / 60;         // Calculate total minutes
        int leftoverSeconds = seconds % 60; // Calculate remaining seconds

        // Delegate to the second method
        return getDurationString(minutes, leftoverSeconds);
    }

    // Method for handling input in minutes and seconds
    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds >= 60) {
            return "Invalid value: minutes must be non-negative and seconds must be between 0 and 59.";
        }

        // Convert total minutes into hours and remaining minutes
        int hours = minutes / 60;
        minutes = minutes % 60;

        // Format and return the result
        return String.format("%d:%02d:%02d", hours, minutes, seconds);
    }
}