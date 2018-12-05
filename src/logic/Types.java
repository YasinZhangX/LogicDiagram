package logic;

public enum Types {
    EXCELLENT, GOOD, BAD;
    
    public String toString() {
        String id = name();
        String lower = id.substring(1).toLowerCase();
        return id.charAt(0) + lower;
    }
}
