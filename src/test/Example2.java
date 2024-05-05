package test;

/**
 * Создать массив ,найти сумму всех элементов в массиве.
 */
public class Example2 {

    public static void main(String[] args) {
        int[] values = {1, 2, -22, 13, 76};
        int result = sumArray(values);
        System.out.println(result);
    }

    private static int sumArray(int[] values) {
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return sum;
    }
}
