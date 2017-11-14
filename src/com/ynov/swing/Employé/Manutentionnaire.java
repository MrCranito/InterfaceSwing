package com.ynov.swing.Employé;

public class Manutentionnaire extends Employé implements prime {
    private int heures ;
    public Manutentionnaire(String nom, String prenom, int age, String date_entree, int heures) {
        super(nom, prenom, age, date_entree);
        this.heures = heures;
    }
    double Calculersalaire( ) {
        return (heures*65) + ajout200();
    }

    @Override
    public int ajout200() {
        return 200;
    }

    @Override
    public double calculerSalaire() {
        return (heures*65) + ajout200();
    }

    @Override
    public String getPosition() {
        return "Manutentionnaire";
    }
}