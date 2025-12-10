package exemple;

import bandeau.Bandeau;

import java.util.ArrayList;
import java.util.List;

public class Scenario {
    private class Etape {
        Effet effet;
        int nbRepetitions;

        Etape(Effet effet, int nbRepetitions) {
            this.effet = effet;
            this.nbRepetitions = nbRepetitions;
        }
    }

    private List<Etape> listeEtape = new ArrayList<>();

    public void ajouterEffet(Effet effet, int nbRepetitions) {
        listeEtape.add(new Etape(effet, nbRepetitions));
    }

    public void jouer(Bandeau bandeau) {
        for (Etape e : listeEtape) {
            for (int i = 0; i < e.nbRepetitions; i++) {
                e.effet.jouerSur(bandeau);
                bandeau.sleep(600);
            }
        }
    }
}
