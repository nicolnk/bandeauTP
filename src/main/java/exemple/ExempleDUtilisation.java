package exemple;

import bandeau.Bandeau;

public class ExempleDUtilisation {

    public static void main(String[] args) {
        new ExempleDUtilisation().exemple();
    }

    public void exemple() {
        Bandeau bandeau1 = new Bandeau();
        bandeau1.setMessage("HELLO WORLD !");
        Scenario scenario = new Scenario();

        scenario.ajouterEffet(new EffetTyping(), 2);
        scenario.ajouterEffet(new EffetMatrix(), 1);
        scenario.ajouterEffet(new EffetRainbow(), 3);

        scenario.jouer(bandeau1);

        bandeau1.close();

    }
}
