import java.util.*;
import java.util.stream.Collectors;

public class Vehicule {

    private int id;
    private LinkedList<Colis> colis;
    private Route route;

    public Vehicule(int id) {
        this.id = id;
        this.colis = new LinkedList<>();
    }

    public void charger(HashMap<String, Colis> colisALivrer, Route route) {
        this.route = route;

        List<Colis> colisACharger = colisALivrer
                .values()
                .stream()
                .filter(v -> route.estSurRoute(v.getVille()))
                .collect(Collectors.toList());

        this.colis.addAll(colisACharger);

        colisACharger.forEach(colis -> colisALivrer.remove(colis.getTracking()));
    }

    public Colis rechercherColis(String tracking) {
        Optional<Colis> colisRecherche = this.colis.stream()
                .filter(colis -> colis.getTracking().equals(tracking))
                .findFirst();

        return colisRecherche.orElse(null);
    }
}
