package homework1.bracechecker;

public class BraceCheckerTest {
    public static void main(String[] args) {
       BraceChecker bc = new BraceChecker("{] }[{}");
       bc.check();
    }
}
