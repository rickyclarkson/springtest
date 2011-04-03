public class QuizMasterService {
    private QuizMaster quizMaster;

    public void setQuizMaster(QuizMaster quizMaster) {
        this.quizMaster = quizMaster;
    }
    
    public void askQuestion() {
        System.out.println(quizMaster.popQuestion());
    }
}