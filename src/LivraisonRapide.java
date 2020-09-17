import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;

public class LivraisonRapide {

    private ArrayList<Vehicule> vehicules;
    private HashMap<String, Route> routes;
    private HashMap<String, Colis> colis;

    public LivraisonRapide() {
        this.vehicules = new ArrayList<>();
        this.routes = new HashMap<>();
        this.colis = new HashMap<>();
    }

    public void ajouterVehicule(Vehicule vehicule) {
        this.vehicules.add(vehicule);
    }

    public void ajouterRoute(Route route) {
        this.routes.put(route.getNomDeRoute(), route);
    }

    public void ajouterColis(Colis colis) {
        this.colis.put(colis.getTracking(), colis);
    }

    public Colis rechercherColisACharger(String tracking) {
        // Hashmap doesn't throw upon missing key, it returns null. So its okay to return directly
        return this.colis.get(tracking);
    }

    public Vehicule rechercherColisDansVehicule(String tracking) {
        return this.vehicules
                .stream()
                .filter(vehicule -> vehicule.rechercherColis(tracking) != null)
                .findFirst()
                .orElse(null);
    }

    public void chargerColis() {
        if(this.routes.values().size() <= this.vehicules.size()) {
            Iterator<Vehicule> iterateurVehicule = this.vehicules.iterator();
            this.routes.values().forEach(route -> iterateurVehicule.next().charger(this.colis, route));
        }
    }
}
