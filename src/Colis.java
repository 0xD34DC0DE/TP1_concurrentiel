public class Colis {

    private String tracking;
    private String ville;
    private Double poids;

    public Colis(String tracking, String ville, Double poids) {
        this.tracking = tracking;
        this.ville = ville;
        this.poids = poids;
    }

    public String getTracking() {
        return tracking;
    }

    public void setTracking(String tracking) {
        this.tracking = tracking;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public Double getPoids() {
        return poids;
    }

    public void setPoids(Double poids) {
        this.poids = poids;
    }
}
