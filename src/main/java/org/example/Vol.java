package org.example;

import java.util.Date;

/**
 * @author Mohamed Meziani
 *
 *
 */

public class Vol {

    private static int id = 0;
    private String numeroVol;
    private Date dateVol;
    private Aeroport origine;
    private Aeroport destination;
    private Avion equipement;
    private DateTime heureDepart;
    private DateTime heureArrivee;
    private int tempsDeVol;
    private Equipage equipage;

    public Vol(Date dateVol, Aeroport origine, Aeroport destination, Avion equipement, DateTime heureDepart, DateTime heureArrivee, Equipage equipage) {
        setId(id);
        id++;
        setNumeroVol(origine.getCodelata(), destination.getCodelata());
        setDateVol(dateVol);
        setOrigine(origine);
        setDestination(destination);
        setEquipement(equipement);
        setHeureDepart(heureDepart);
        setHeureArrivee(heureArrivee);
        setEquipage(equipage);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumeroVol() {
        return numeroVol;
    }

    public void setNumeroVol(String origineCode, String destinationCode) {
        this.numeroVol += origineCode + "-";

        for (int i = 0; i < 3 ; i++) {
            this.numeroVol += 5 + (int)(Math.random() * ((10 - 5) + 1));
        }

        this.numeroVol += "-" + destinationCode;
    }

    public Date getDateVol() {
        return dateVol;
    }

    public void setDateVol(Date dateVol) {
        this.dateVol = dateVol;
    }

    public Aeroport getOrigine() {
        return origine;
    }

    public void setOrigine(Aeroport origine) {
        this.origine = origine;
    }

    public Aeroport getDestination() {
        return destination;
    }

    public void setDestination(Aeroport destination) {
        this.destination = destination;
    }

    public Avion getEquipement() {
        return equipement;
    }

    public void setEquipement(Avion equipement) {
        this.equipement = equipement;
    }

    public DateTime getHeureDepart() {
        return heureDepart;
    }

    public void setHeureDepart(DateTime heureDepart) {
        this.heureDepart = heureDepart;
    }

    public DateTime getHeureArrivee() {
        return heureArrivee;
    }

    public void setHeureArrivee(DateTime heureArrivee) {
        this.heureArrivee = heureArrivee;
    }

    public int getTempsDeVol() {
        return tempsDeVol;
    }

    public void setTempsDeVol(int tempsDeVol) {
        this.tempsDeVol = tempsDeVol;
    }

    public Equipage getEquipage() {
        return equipage;
    }

    public void setEquipage(Equipage equipage) {
        this.equipage = equipage;
    }

}
