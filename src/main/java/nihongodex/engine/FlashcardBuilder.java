package nihongodex.engine;

import java.util.ArrayList;

public class FlashcardBuilder {
    private static ArrayList<Flashcard> liste;

    public static ArrayList<Flashcard> getListe() {
        return liste;
    }

    public static void setListe(ArrayList<Flashcard> liste){
        FlashcardBuilder.liste = liste;
    }

    public static void init(){
        liste = new ArrayList<>();
        FlashcardBuilder.liste.add(new Flashcard("車", "kuruma", "voiture", 0));
        FlashcardBuilder.liste.add(new Flashcard("電車", "densha", "train", 0));
        FlashcardBuilder.liste.add(new Flashcard("バス", "basu", "bus", 0));
        FlashcardBuilder.liste.add(new Flashcard("飛行機", "hikouki", "avion", 0));
    }
}
