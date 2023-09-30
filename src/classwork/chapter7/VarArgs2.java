package classwork.chapter7;

public class VarArgs2 {
   static void vaTest(String msg, int ... v) {
       System.out.print(msg + v.length + " Cодержимое: ");
       for (int x:v)
           System.out.print(x + " ");
       System.out.println();
       }
    }

