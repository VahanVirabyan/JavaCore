package classwork.chapter12;

import static classwork.chapter12.AskMe.answer;

public class AnswersDemo {

    public static void main(String[] args) {
        Question q = new Question();
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
    }
}
