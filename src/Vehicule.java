import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Vehicule {

    private int id;
    private LinkedList<Colis> colis;
    private Route route;

    public Vehicule(int id) {
        this.id = id;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
