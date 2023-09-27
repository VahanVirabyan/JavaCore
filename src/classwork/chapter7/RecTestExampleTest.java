package classwork.chapter7;

public class RecTestExampleTest {
    public static void main(String[] args) {
        RecTestExample ob = new RecTestExample(10);
        for (int i = 0; i < 10; i++)
        ob.values[i] = i;

        ob.printArray(10);
        }
    }
