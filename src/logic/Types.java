package logic;

public enum Types {
    EXCELLENT, GOOD, OK, BAD;
    
    public String toString() {
        String id = name();
        String lower = id.toLowerCase();
        return "The Grade is " + lower + ".";
    }
}
