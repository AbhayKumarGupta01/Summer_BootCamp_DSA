public class DailyPractice {

    public static void main(String[] args) {

        int[] numbers = {12, 7, 25, 18, 4, 30};

        int max = numbers[0];
        int min = numbers[0];

        for (int num : numbers) {
            if (num > max) {
                max = num;
            }

            if (num < min) {
                min = num;
            }
        }

        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        System.out.println("Difference: " + (max - min));
    }
}