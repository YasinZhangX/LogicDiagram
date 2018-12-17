package logic;

/**
 * @author Yasin Zhang
 * @version 1.0
 */
public enum Types {
    MAMMAL, BIRD, FISH, REPTILE;
    
    public String toString() {
        String id = name();
        String lower = id.toLowerCase();
        return "This animal is " + lower + ".";
    }
}
