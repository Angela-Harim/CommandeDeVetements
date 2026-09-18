package school.hei;

public class Haut extends Vetement {
    private TypeManche typeManche;


    public Haut(String nom, Taille taille, double prix, Materiel materiel, TypeManche typeManche) {
        super(nom, taille, prix, materiel);
        this.typeManche = typeManche;
    }

    public TypeManche getTypeManche() {
        return typeManche;
    }

    public void setTypeManche(TypeManche typeManche) {
        this.typeManche = typeManche;
    }
}
