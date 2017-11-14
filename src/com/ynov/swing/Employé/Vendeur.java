package com.ynov.swing.Employé;


public class Vendeur extends Employé {
    private int chiffre ;
    private String type = "vendeur" ;
    public Vendeur(String nom, String prenom, int age, String date_entree, int chiffre) {
        super(nom, prenom, age, date_entree);
        this.chiffre = chiffre;
        this.type = type;
    }
    double Calculersalaire( ) {
        return (chiffre)*0.2+400;
    }


    @Override
    public double calculerSalaire() {
        return (chiffre)*0.2+400;
    }

    @Override
    public String getPosition() {
        return "Vendeur";
    }
}