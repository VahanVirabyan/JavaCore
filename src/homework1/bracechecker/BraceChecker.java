package homework1.bracechecker;

public class BraceChecker {
    private String text;
    private int i;
    private Stack stack = new Stack();

    public BraceChecker(String text) {
        this.text = text;
    }
    public void check() {
        for (i = 0; i < text.length(); i++) {
            switch (text.charAt(i)) {
                case '(':
                case '{':
                case '[':
                    stack.push(text.charAt(i));
                    break;
                case ')':
                case '}':
                case ']':
                    if (stack.getSize() == -1) {
                        System.err.println("error: closed " + text.charAt(i) + " but didn't open");
                    } else {
                        int pop = stack.pop();
                        if (pop != '(' && text.charAt(i) == ')' || pop != '[' && text.charAt(i) == ']' || pop != '{' && text.charAt(i) == '}') {
                            System.err.println("error: opened " + (char) pop + " but closed " + text.charAt(i));
                        }
                    }
            }
        }

        int size = stack.getSize();
        for (int j = 0; j <= size; j++) {
            System.err.println("error: " + " opened " + (char) stack.pop() + " but don't closed");
        }
    }
}
