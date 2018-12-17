package logic;

/**
 * @author Yasin Zhang
 * @version 1.0
 */
public enum Questions {
    // left is yes branch; right is no branch
    Q1("Is this animal warm-blooded?", 2, 3),
    Q2("Is this animal nurse their young using milk?", Types.MAMMAL, Types.BIRD),
    Q3("Is this animal breath under water using gills?", Types.FISH, Types.REPTILE);
    
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
