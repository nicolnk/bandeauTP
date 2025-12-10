package exemple;

import bandeau.Bandeau;

public class EffetTyping extends Effet {
    public void jouerSur(Bandeau bandeau){
        String texteAJouer = bandeau.getMessage();
        bandeau.setMessage("");

        for (int i = 0; i < texteAJouer.length(); i++) {
            bandeau.setMessage(bandeau.getMessage() + texteAJouer.charAt(i));
            bandeau.sleep(200);
        }
    }
}
