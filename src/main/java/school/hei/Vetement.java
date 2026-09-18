package school.hei;

import java.io.Serializable;
import java.util.stream.IntStream;

/**Un vêtement dispose d’un nom, d’une taille qui peut être XS, S, M, L, XL ou
 XXL, d’un prix unitaire, d’un matériel à partir duquel il est fait: coton, nylon, ou
 autre*/

public class Vetement implements Serializable {
    private String nom;
    private Taille taille;
    private double prix;
    private Materiel materiel;

    public Vetement(String nom, Taille taille, double prix, Materiel materiel) {
        this.nom = nom;
        this.taille = taille;
        this.prix = prix;
        this.materiel = materiel;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Taille getTaille() {
        return taille;
    }

    public void setTaille(Taille taille) {
        this.taille = taille;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public Materiel getMateriel() {
        return materiel;
    }

    public void setMateriel(Materiel materiel) {
        this.materiel = materiel;
    }


}
