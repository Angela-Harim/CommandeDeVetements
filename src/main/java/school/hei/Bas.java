package school.hei;

public class Bas extends Vetement{
    private int tourTaille;

    public Bas(String nom, Taille taille, double prix, Materiel materiel, int tourTaille) {
        super(nom, taille, prix, materiel);
        this.tourTaille = tourTaille;
    }

    public int getTourTaille() {
        return tourTaille;
    }

    public void setTourTaille(int tourTaille) {
        this.tourTaille = tourTaille;
    }
}
