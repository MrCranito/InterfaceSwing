package com.ynov.swing.Employé;

public abstract class Employé {
    public String nom ;
    private String prenom;
    private int age ;
    private String date_entree ;
    private static String NAME_PATTERN = " %s %s";


    public Employé(String nom, String prenom, int age, String date_entree){
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.date_entree = date_entree;
    }
    String getNom(){
        return "l'employé "+prenom+" "+nom ;
    }


    public abstract double calculerSalaire();

    public abstract String getPosition();

    public String getName() {
        return String.format(NAME_PATTERN, prenom, nom);
    }

    public int getAge(){return this.age; }



    public String getEntryYear() {
        return date_entree;
    }
}



