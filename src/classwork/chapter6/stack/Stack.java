package classwork.chapter6.stack;

public class Stack {
    int array[] = new int[10];
    int index;

    Stack() {
        index = -1;
    }

    void push(int item) {
        if (index == 9) {
            System.out.println("Стек заполнен.");
        } else {
            array[++index] = item;
        }
    }

    int pop() {
        if (index < 0) {
            System.out.println("Cтек не нагружен.");
            return 0;
        } else {
            return array[index--];
        }
    }
}
