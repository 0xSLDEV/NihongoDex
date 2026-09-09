package nihongodex.engine;

import java.io.*;
import java.util.ArrayList;

public class SaveFlashcards {
    public static void save(){
        File f = new File("./src/main/java/nihongodex/saves/Flashcards.ngd");

                    ArrayList<Flashcard> a = FlashcardBuilder.getListe();
                    a.add(new Flashcard("test", "test", "test", 0));
                    FlashcardBuilder.setListe(a);
        f.delete();
        try{
            f.createNewFile();
        } catch(Exception e)
        {
            e.printStackTrace();
        }

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f))){


            oos.writeObject(FlashcardBuilder.getListe());
            if(f.exists()){
                System.out.println("Fichier sauvegardé!");
            } else {
                System.out.println("Problème rencontré.");
            }
        } catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void load(){
        File f = new File("../saves/Flashcards.ngd");
        if(!f.exists()){
            System.out.println("Pas de sauvegarde trouvée.");
            return;
        }
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))){
            ArrayList<Flashcard> tempListe = (ArrayList<Flashcard>) ois.readObject();
            FlashcardBuilder.setListe(tempListe);
            System.out.println("Sauvegarde chargée!");
        } catch(IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }

}
