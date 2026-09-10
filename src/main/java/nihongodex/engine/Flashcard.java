package nihongodex.engine;

import java.io.Serializable;
import java.util.Objects;
import java.util.Scanner;

public class Flashcard implements Serializable {
    private final String japanese;
    private final String romaji;
    private final String french;
    private final int repetitions;

    public Flashcard(String japanese, String romaji, String french, int repetitions){
        this.japanese = japanese;
        this.romaji = romaji;
        this.french = french;
        this.repetitions = repetitions;
    }

    @Override
    public String toString() {
        return "Flashcard [ " + this.japanese + " -> " + this.romaji + " -> " + this.french + "; " + this.repetitions + " fois]\n";
    }

    public static Flashcard createFlashcard(Scanner sc){
        IO.print("Veuillez entrer le mot en kanji/kana: ");
        String japanese = sc.nextLine();
        IO.print("Veuillez entrer la transcription en romaji: ");
        String romaji = sc.nextLine();
        IO.print("Veuillez entrer la traduction en français: ");
        String french = sc.nextLine();
        return new Flashcard(japanese, romaji, french, 0);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Flashcard flashcard = (Flashcard) o;
        return repetitions == flashcard.repetitions && Objects.equals(japanese, flashcard.japanese) && Objects.equals(romaji, flashcard.romaji) && Objects.equals(french, flashcard.french);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(japanese);
        result = 31 * result + Objects.hashCode(romaji);
        result = 31 * result + Objects.hashCode(french);
        result = 31 * result + repetitions;
        return result;
    }
}
