public class TrueFalseQuestion extends Question {

    private boolean correctAnswer;
    public TrueFalseQuestion(String questionText, boolean correctAnswer) {
        super(questionText);
        this.correctAnswer = correctAnswer;
    }


    @Override
    public boolean checkAnswers(String[] answers) {
        return answers[0].equals(String.valueOf(correctAnswer));
    }

    public String[] getAnswers() {
        return new String[] {"true", "false"};
    }
}
