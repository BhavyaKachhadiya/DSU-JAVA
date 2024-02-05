public class p12 {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 4, 5};

        int product = 1;
        int i = 0;
        while (i < numbers.length) {
            product *= numbers[i];
            i++;
        }

        System.out.println("Product of all elements in the array: " + product);
    }
}
