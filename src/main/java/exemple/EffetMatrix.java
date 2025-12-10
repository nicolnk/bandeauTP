package exemple;

import bandeau.Bandeau;
import java.awt.*;
import java.util.Random;

public class EffetMatrix extends Effet {

    @Override
    public void jouerSur(Bandeau bandeau){
        String messageFinal = bandeau.getMessage();
        bandeau.setMessage("");

        int longueur = messageFinal.length();
        Random rand = new Random();

        for (int i = 0; i < longueur; i++){
            for (int k = 0; k < 5; k++){

                String messageEnCours = "";
                messageEnCours = messageFinal.substring(0, i);

                for (int j = i; j < longueur; j++) {
                    char lettreHasard = (char) ('A' + rand.nextInt(26));
                    messageEnCours += lettreHasard;
                }

                bandeau.setMessage(messageEnCours);
                bandeau.sleep(50);
            }
        }
        bandeau.setMessage(messageFinal);
    }
}