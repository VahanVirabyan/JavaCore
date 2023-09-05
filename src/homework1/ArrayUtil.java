package homework1;

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
        System.out.println(numbers[8]);


        System.out.println("\"Number 4\")");
        System.out.println(numbers.length);


        System.out.println("\"Number 5\")");
        int min_num = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (min_num > numbers[i]) {
                min_num = numbers[i];
            }
        }
        System.out.println(min_num);


        System.out.println("\"Number 8\")");
        int kent = 0;
        for (int i = 0; i < numbers.length; i++) {
           if(numbers[i]%2!=0){
               kent++;
           }
        }
        System.out.println(kent);


        System.out.println("\"Number 9\")");
        int summa = 0;
        for (int i = 0; i < numbers.length; i++) {
            summa = numbers[i] + summa;
        }
        System.out.println(summa);

        System.out.println("\"Number 10\")");
        int result = 0;
        for (int i = 0; i < numbers.length; i++)
            result = result + numbers[i];
        System.out.println(result / 9);
    }
}