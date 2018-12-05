package logic;

public enum Questions {
    // left is yes branch; right is no branch
    Q1("Is the score higher than 90?", Types.EXCELLENT, 2),
    Q2("Is the score higher than 80?", Types.GOOD, 3),
    Q3("Is the score higher than 60?", Types.OK, Types.BAD);
    
    private String question;
    private Object lBranch;
    private Object rBranch;
    
    private Questions(String question) {
        this.question = question;
        lBranch = null;
        rBranch = null;
    }
    
    private Questions(String question, Object left, Object right) {
        this.question = question;
        lBranch = left;
        rBranch = right;
    }
    
    public String toString() {
        return getquestion();
    }
    
    public String getquestion() {
        return question;
    }
    
    public Object getlBranch() {
        return lBranch;
    }
    
    public Object getrBranch() {
        return rBranch;
    }
}
