package nihongodex.engine;

import java.awt.*;
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
        sc.nextLine();

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
            case (4) -> {
                if(!FlashcardBuilder.addFlashcard(Flashcard.createFlashcard(sc))){
                    IO.println("Flashcard déjà existante, veuillez en ajouter une différente.");
                    yield true;
                }
                IO.println("Flashcard créée!");
                yield true;
            }
            case (5) -> false;
            default -> {
                System.out.println("Option inconnue, veuillez entrer le numéro d'une action valide.");
                yield true;
            }
        };
    }
}
