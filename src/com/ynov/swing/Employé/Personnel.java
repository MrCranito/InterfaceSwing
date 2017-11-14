package com.ynov.swing.Employé;

import java.util.ArrayList;
import java.util.List;

public class Personnel {
    public ArrayList<Employé> staf = new ArrayList<Employé>();
    public void ajouteremploye(Employé g){
        staf.add(g);
    }
    /*public void salires(List p){
        for (int i = 0; i < p.size() ; i++ ) {
            if (p.get(i) instanceof Vendeur) {
                System.out.println("le salaire de "+((Vendeur) p.get(i)).getNom()+ " est "+((Vendeur) p.get(i)).Calculersalaire());
            }
            else if (p.get(i) instanceof Responsable) {
                System.out.println("le salaire de "+((Responsable) p.get(i)).getNom()+ " est "+((Responsable) p.get(i)).Calculersalaire());
            }
            else if (p.get(i) instanceof Producteur) {
                System.out.println("le salaire de "+((Producteur) p.get(i)).getNom()+ " est "+((Producteur) p.get(i)).Calculersalaire());
            }
            else if (p.get(i) instanceof Manutentionnaire) {
                System.out.println("le salaire de "+((Manutentionnaire) p.get(i)).getNom()+ " est "+((Manutentionnaire) p.get(i)).Calculersalaire());
            }
        }
    }*/
    public double salairemoyen(List p){
        double total_salaire = 0;
        for (int x = 0; x < p.size() ; x++ )
        {
            if (p.get(x) instanceof Vendeur)
            {
                total_salaire += ((Vendeur) p.get(x)).Calculersalaire();
            }
            else if (p.get(x) instanceof Responsable) {
                total_salaire += ((Responsable) p.get(x)).Calculersalaire();
            }
            else if (p.get(x) instanceof Producteur) {
                total_salaire += ((Producteur) p.get(x)).Calculersalaire();
            }
            else if (p.get(x) instanceof Manutentionnaire) {
                total_salaire += ((Manutentionnaire) p.get(x)).Calculersalaire();
            }

        }
        return (total_salaire / (p.size()));
    }
    public ArrayList<Employé> getEmployees() {
        return staf;
    }
    public void addObject(){

    }
}