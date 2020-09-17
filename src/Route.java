import java.util.ArrayList;
import java.util.List;

public class Route {

    private List<String> villes;

    public Route() {
        this.villes = new ArrayList<>();
    }

    public void ajouterVilles(List<String> villes) {
        this.villes.addAll(villes);
    }

    public boolean estSurRoute(String ville) {
        return this.villes.stream().anyMatch(currentVile -> currentVile.equals(ville));
    }
}
