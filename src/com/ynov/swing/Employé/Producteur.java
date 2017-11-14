package com.ynov.swing.Employé;

public class Producteur extends Employé implements prime {
    private int unités ;
    public Producteur(String nom, String prenom, int age, String date_entree, int unités) {
        super(nom, prenom, age, date_entree);
        this.unités = unités;
    }
    double Calculersalaire( ) {
        return (unités*5)+ ajout200();
    }

    @Override
    public int ajout200() {
        return 200;
    }

    @Override
    public double calculerSalaire() {
        return (unités*5)+ ajout200();
    }

    @Override
    public String getPosition() {
        return "Producteur";
    }
}