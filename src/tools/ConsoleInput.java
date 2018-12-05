package tools;

import java.io.InputStream;
import java.util.Scanner;

public class ConsoleInput {
    Scanner sc;
    
    public ConsoleInput(InputStream source) {
        sc = new Scanner(source);
    }
    
    public Boolean getAnswer() {
        Boolean ret = false;
        
        String input = sc.nextLine();
        String str = input.toLowerCase().trim();
        if (str.equals("yes")) {
            ret = true;
        } else if (str.equals("no")) {
            ret = false;
        } else {
            System.err.println("Input Error!");
        }
        return ret;
    }
}
