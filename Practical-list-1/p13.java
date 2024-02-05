public class p13 {
    public static void main(String[] args) {
        int[] numbers = {10, 5, 20, 15, 25};

        int max = Integer.MIN_VALUE;
        int i = 0;
        do {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            i++;
        } while (i < numbers.length);

        System.out.println("Maximum value in the array: " + max);
    }
}
