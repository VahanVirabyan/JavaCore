package homework1.bracechecker;

public class Stack {
    private int stck[] = new int[10];
    private int tos;

    Stack() {

        tos = -1;
    }

    private void extend() {
        int[] temp = new int[stck.length + 10];
        if (tos >= 0) System.arraycopy(stck, 0, temp, 0, tos);
        stck = temp;
    }

    void push(int item) {
        if (tos == stck.length ){
            extend();
        }
        stck[++tos] = item;
    }

    int pop() {
        if (tos < 0) {
            return 0;
        } else
            return stck[tos--];

    }
    public int getSize(){
        return tos;
    }
}
