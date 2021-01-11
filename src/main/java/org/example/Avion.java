package org.example;

/**
 * @author Siana Martinez
 *
 *
 */

public class Avion {

    private String matricule;
    private String constructeur;
    private String modele;
    private int capacite;

    public Avion(String matricule, String constructeur, String modele, int capacite) {
        this.matricule = matricule;
        this.constructeur = constructeur;
        this.modele = modele;
        this.capacite = capacite;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getConstructeur() {
        return constructeur;
    }

    public void setConstructeur(String constructeur) {
        this.constructeur = constructeur;
    }


    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

}