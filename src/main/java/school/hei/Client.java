package school.hei;

import java.time.LocalDate;

/**Un client doit avoir un nom, un prénom, une date de naissance, une adresse,
 une adresse e-mail, et un numéro de téléphone;*/

public class Client {
    private String nom;
    private String prenom;
    private LocalDate dateNaissance;
    private String adresse;
    private String adresseEmail;
    private String telephone;

    public Client(String nom, String prenom, LocalDate dateNaissance, String adresse, String adresseEmail, String telephone) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.adresse = adresse;
        this.adresseEmail = adresseEmail;
        this.telephone = telephone;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getAdresseEmail() {
        return adresseEmail;
    }

    public void setAdresseEmail(String adresseEmail) {
        this.adresseEmail = adresseEmail;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
