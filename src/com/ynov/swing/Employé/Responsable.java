package com.ynov.swing.Employé;

public class Responsable extends Employé {
    private int chiffre ;
    public Responsable(String nom, String prenom, int age, String date_entree, int chiffre) {
        super(nom, prenom, age, date_entree);
        this.chiffre = chiffre;
    }
    double Calculersalaire( ) {
        return chiffre*0.2+800;
    }

    @Override
    public double calculerSalaire() {
        return chiffre*0.2+800;
    }

    @Override
    public String getPosition() {
        return "Responsable";
    }
}