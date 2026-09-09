package nihongodex.engine;

import java.io.Serializable;

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
}
