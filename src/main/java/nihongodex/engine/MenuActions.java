package nihongodex.engine;

import java.util.Scanner;

public class MenuActions {
    public static boolean demanderAction(Scanner sc) {
        Display.afficherActions();

        if(!sc.hasNextInt()){
            System.out.println("Veuillez insérer un nombre valide.");
            sc.next();
            return true;
        }

        int option = sc.nextInt();

        return switch (option) {
            case (1) -> {
                IO.println(FlashcardBuilder.getListe());
                yield true;
            }
            case (2) -> {
                SaveFlashcards.save();
                yield true;
            }
            case (3) -> {
                SaveFlashcards.load();
                yield true;
            }
            case (4) -> false;
            default -> {
                System.out.println("Option inconnue, veuillez entrer le numéro d'une action valide.");
                yield true;
            }
        };
    }
}
