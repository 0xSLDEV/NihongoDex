package nihongodex.engine;

public class Display {
    public static void afficherActions(){
        IO.println("""
                ########################################
                ##### NihongoDex v0.1 Closed Alpha #####
                ########################################
                
                Choisissez votre action parmi celles proposées ci-dessous.
                
                1) Afficher les Flashcard disponibles
                2) Enregistrer les Flashcard
                3) Charger les Flashcard
                4) Créer une nouvelle Flashcard
                5) Quitter
                """);
    }
}
