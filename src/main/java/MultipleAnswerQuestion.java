public class MultipleAnswerQuestion extends Question{
    private String[] answers;
    private String[] correctAnswers;
    public MultipleAnswerQuestion(String questionText, String[] answers, String[] correctAnswers) {
        super(questionText);
        this.answers = answers;
        this.correctAnswers = correctAnswers;
    }

    public String[] getAnswers() {
        return answers;
    }

    public boolean checkAnswers(String[] answers) {
        return true;
    }
}
