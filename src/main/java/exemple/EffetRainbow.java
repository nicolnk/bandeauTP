package exemple;

import bandeau.Bandeau;

import java.awt.*;

public class EffetRainbow extends Effet {
    public void jouerSur(Bandeau bandeau) {
        Color[] couleurs = {
                Color.RED, Color.ORANGE, Color.YELLOW,
                Color.GREEN, Color.CYAN, Color.BLUE, Color.MAGENTA
        };
        String texteAffichage = bandeau.getMessage();
        bandeau.setMessage("");

        for (int i = 0; i < texteAffichage.length(); i++) {
            bandeau.setForeground(couleurs[i % couleurs.length]);
            bandeau.setMessage(texteAffichage.substring(0, i + 1));
            bandeau.sleep(100);
        }
    }
}
