import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QuizProgramConfig {
    @Bean
    public QuizMaster quizMaster() {
        return new SpringQuizMaster();
    }
}
