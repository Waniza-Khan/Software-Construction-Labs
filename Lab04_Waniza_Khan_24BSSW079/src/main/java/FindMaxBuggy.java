public class FindMaxBuggy {

    public static int findMax(int[] numbers) {
        int maxValue = 0;
        for (int n : numbers) {
            if (n > maxValue) {
                maxValue = n;
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        int[] data = {-5, -2, -9};
        System.out.println("Largest: " + findMax(data));
    }
}
