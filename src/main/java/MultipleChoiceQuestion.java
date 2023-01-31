public class MultipleChoiceQuestion extends Question{

    protected String[] answers;
    protected String correctAnswer;
    public MultipleChoiceQuestion(String questionText, String[] answers, String correctAnswer) {
        super(questionText);
        this.answers = answers;
        this.correctAnswer = correctAnswer;
    }

    public boolean checkAnswers(String[] answers) {
        return answers[0] == correctAnswer;
    }

    public String[] getAnswers() {
        return answers;
    }
}
