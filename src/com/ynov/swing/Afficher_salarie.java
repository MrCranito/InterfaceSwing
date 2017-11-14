package com.ynov.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import com.ynov.swing.Employé.*;
public class Afficher_salarie implements ActionListener{

    private ViewController myview;

    private JButton returnButton;
    private JButton addEmploye;

    public Afficher_salarie(ViewController myview){
        this.myview = myview;
        this.myview.panel = new JPanel(new BorderLayout());

        ArrayList<Employé> listEmployee = this.myview.personnel.getEmployees();
        Object[][] data_user = new Object[listEmployee.size()+2][];

        int i = 0 ;
        int total =0;
        for (Employé e : listEmployee){
            data_user[i]= (new Object[]{
                    e.getPosition(),
                    e.getName(),
                    e.getAge(),
                    e.getEntryYear(),
                    e.calculerSalaire()
            }); i++;
            total += e.calculerSalaire();
        }

        data_user[i] = new Object[]{"Salaire moyen", "", "", "", this.myview.personnel.salairemoyen(listEmployee)};
        i++;

        data_user[i] = new Object[]{"Total salaires", "", "", "", total};
        String[] titres = {"Metiers", "Employe", "Age", "Année d'entrée", "Salaire"};


        JTable table = new JTable( data_user, titres);



        this.returnButton = new JButton("Retour ");
        this.returnButton.addActionListener(this);

        this.addEmploye = new JButton("Ajouter un employé");
        this.addEmploye.addActionListener(this);

        this.myview.panel.add(table.getTableHeader(),BorderLayout.NORTH);
        this.myview.panel.add(table, BorderLayout.CENTER);


        this.myview.panel.add(this.addEmploye, BorderLayout.SOUTH);
        this.myview.panel.add(this.returnButton, BorderLayout.SOUTH);





    }

    public void actionPerformed(ActionEvent event) {
        if(event.getSource() == this.returnButton){
            System.out.println("list");
            this.myview.afficherMenu();
        }

        else if(event.getSource() == this.addEmploye){
            System.out.println("add");
            this.myview.afficherFormulaire();
        }
    }


}
