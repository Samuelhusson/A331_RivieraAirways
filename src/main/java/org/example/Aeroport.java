package org.example;

/**
 * @author Damien Munoz
 *
 *
 */

public class Aeroport {
    private String codelata;
    private String nom;
    private String ville;
    private String pays;

    public Aeroport(String codelata, String nom, String ville, String pays) {
        if (codelata.length() == 3) {
            this.codelata = codelata;
            this.nom = nom;
            this.ville = ville;
            this.pays = pays;
        } else {
            System.out.println("Erreur d'initialisation pour le code de l'aéroport, 3 caractères requis");
        }

    }

    public String getCodelata() {
        return codelata;
    }

    public void setCodelata(String codelata) {
        this.codelata = codelata;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }
}
