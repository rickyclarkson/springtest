import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class QuizProgram {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(QuizProgramConfig.class);
        QuizMaster quizMaster = context.getBean(QuizMaster.class);
        System.out.println(quizMaster.popQuestion());
    }
}
