import java.util.HashMap;
import java.util.LinkedList;

public class Vehicule {

    private int id;
    private LinkedList<Colis> colis;

    public Vehicule(int id) {
        this.id = id;
    }

    public void charger(HashMap<String, Colis> colisALivrer, Route route) {

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
