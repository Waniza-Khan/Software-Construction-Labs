public class ReportUtil {

    /** Works out the mean of the given scores. */
    public static double calculateAverage(int[] scores) {
        int total = 0;
        for (int s : scores) {
            total += s;
        }
        return (double) total / scores.length;
    }

    /** Prints the average line for a set of scores. */
    public static void printReport(int[] scores) {
        double avg = calculateAverage(scores);
        System.out.println("Average: " + avg);
    }

    public static void main(String[] args) {
        int[] studentScores = {78, 92, 55, 88};
        printReport(studentScores);
    }
}