import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class QuizProgram {
    public static void main(String[] args) {
        XmlBeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("QuizMaster.xml"));
        QuizMaster quizMaster = beanFactory.getBean(QuizMaster.class);
        System.out.println(quizMaster.popQuestion());
    }
}
