package homework1.sort;

public class ArraySortTest {
    public static void main(String[] args) {
        ArraySort as = new ArraySort();
        int[] numbers = {4, 7, 1, 3, 9, 0, 2};
        as.sort(numbers);
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
