package nihongodex;

import nihongodex.engine.FlashcardBuilder;
import nihongodex.engine.MenuActions;

import java.util.Scanner;

public class Run {
    static void main(){
        FlashcardBuilder.init();

        try(Scanner sc = new Scanner(System.in)){
            boolean keepLoop;
            do{
                keepLoop = MenuActions.demanderAction(sc);
            } while(keepLoop);
        }
    }
}
