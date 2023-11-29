package homework1.util;

public class ArrayUtil {
    public static void main(String[] args) {
        System.out.println("\"Number 1)\"");
        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        System.out.println("\"Number 2)\"");
        System.out.println(numbers[0]);


        System.out.println("\"Number 3\")");
        for (int i = 0; i < numbers.length - 1; i++) {
        }
        System.out.println(numbers[8]);


        System.out.println("\"Number 4\")");
        System.out.println(numbers.length);


        System.out.println("\"Number 5\")");
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        System.out.println(min);

        System.out.println("\"Number 6\")");
        if (numbers.length > 2) {
            if (numbers.length % 2 == 0) {
                System.out.println(+numbers[numbers.length / 2 - 1] + " " + numbers[numbers.length / 2]);

            } else {
                System.out.println(+numbers[numbers.length / 2]);

            }
        } else {
            System.out.println("Can't print middle value");
        }

        System.out.println("\"Number 7\")");
        int evenCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenCount++;
            }
        }
        System.out.println(evenCount);


        System.out.println("\"Number 8\")");
        int oddCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                oddCount++;
            }
        }
        System.out.println(oddCount);


        System.out.println("\"Number 9\")");
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.println(sum);


        System.out.println("\"Number 10\")");
        int avg = 0;
        for (int i = 0; i < numbers.length; i++) {
            avg += numbers[i];
        }
        System.out.println(avg / numbers.length);

    }
}


