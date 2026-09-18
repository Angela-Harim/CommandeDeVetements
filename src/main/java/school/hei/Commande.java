package school.hei;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**Une commande (Order en anglais) faite par un client doit avoir une date de
 commande, et une description, il doit aussi renseigner quels sont les
 vêtements (hauts et bas confondus) commandés et en quelle quantité;*/

public class Commande {
    private LocalDate dateCommande;
    private String description;
    private Vetement vetementCommande;
    private int quantite;

    public Commande(LocalDate dateCommande, String description, Vetement vetementCommande, int quantite) {
        this.dateCommande = dateCommande;
        this.description = description;
        this.vetementCommande = vetementCommande;
        this.quantite = quantite;
    }

    public LocalDate getDateCommande() {
        return dateCommande;
    }

    public void setDateCommande(LocalDate dateCommande) {
        this.dateCommande = dateCommande;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Vetement getVetement() {
        return vetementCommande;
    }

    public void setVetement(Vetement vetement) {
        this.vetementCommande = vetementCommande;
    }

    public double getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    @Override
    public String toString() {
        return "Commande{" +
                "dateCommande=" + dateCommande +
                ", description='" + description + '\'' +
                ", vetementCommande=" + vetementCommande +
                ", quantite=" + quantite +
                '}';
    }

    private List<Commande> commande;
    public Commande() {
        commande = new ArrayList<>();
    }
    public void ajout(Commande commande) {
        commande.ajout(commande);
    }


    public double coutTotal() {
        return vetementCommande
                .stream()
                .mapToDouble(Vetement::getPrix)
                .sum();
    }
}
