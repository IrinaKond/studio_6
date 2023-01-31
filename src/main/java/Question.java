public abstract class Question {
    protected String questionText;



    public Question(String questionText) {
        this.questionText = questionText;

    }

    public String getQuestionText() {
        return questionText;
    }

    public abstract boolean checkAnswers(String[] answers);

    public abstract String[] getAnswers();
}
