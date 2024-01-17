package UnitP2;

//Ansi library version: author: obtained from: 

import static org.fusesource.jansi.Ansi.*;
import static org.fusesource.jansi.Ansi.Color.*;

public class Testing {
    public static void main(String[] args) {
        System.out.println( ansi().eraseScreen().fg(RED).a("Hello").fg(GREEN).a(" World").reset() );
    }
}
