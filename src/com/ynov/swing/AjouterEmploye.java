package com.ynov.swing;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.ynov.swing.Employé.*;
import com.ynov.swing.ViewController;

import javax.swing.*;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.valueOf;

public class AjouterEmploye implements ActionListener{


    private ViewController controller;
    private JButton Add_salary;
    private JTextField firstname;
    private JTextField lastname;
    private JTextField age;
    private JTextField year;
    private JTextField unit;


    private String[] List_employe = {"Manutention", "Production", "Responsable" };

    private JComboBox <String> mycomboBox;

    private JButton retour_menu;

    public AjouterEmploye(ViewController controller){

        this.controller = controller;
        this.controller.panel = new JPanel();
        this.firstname = new JTextField();
        this.lastname = new JTextField();
        this.age = new JTextField();
        this.year = new JTextField();
        this.unit = new JTextField();
        this.mycomboBox = new JComboBox<>(this.List_employe);



        this.retour_menu = new JButton("Retour ");
        this.retour_menu.addActionListener(this);

        this.Add_salary = new JButton("Enregistrer un nouvel employé");
        this.Add_salary.addActionListener(this);

        // On ajoute tous les les labels et les Textfield correspondants
        this.controller.panel.setLayout(new BoxLayout(this.controller.panel, BoxLayout.Y_AXIS));
        this.controller.panel.add(new JLabel("Type"));
        this.controller.panel.add(this.mycomboBox);
        this.controller.panel.add(new JLabel("Prenom"),BorderLayout.NORTH);
        this.controller.panel.add(this.firstname,BorderLayout.NORTH);
        this.controller.panel.add(new JLabel("Nom"),BorderLayout.NORTH);
        this.controller.panel.add(this.lastname,BorderLayout.NORTH);
        this.controller.panel.add(new JLabel("Age"));
        this.controller.panel.add(this.age);
        this.controller.panel.add(new JLabel("Année d'arrivée dans l'entreprise"));
        this.controller.panel.add(this.year);
        this.controller.panel.add(new JLabel("Unité"));
        this.controller.panel.add(this.unit);

        // On ajoute les deux boutons
        this.controller.panel.add(this.Add_salary);
        this.controller.panel.add(this.retour_menu);


    }
        //On Check les buttons et ajoute un "personnel"
    public void actionPerformed(ActionEvent event) {
        if(event.getSource() == this.retour_menu){
            System.out.println("dashboard");
            this.controller.afficherMenu();
        }

        else if(event.getSource() == this.Add_salary){

            String type_list = String.valueOf(this.mycomboBox.getSelectedItem());
            String nom = this.firstname.getText();
            String prenom = this.lastname.getText();
            int age = parseInt(this.age.getText());
            String annee = String.valueOf(this.year.getText());
            int unite = parseInt(this.unit.getText());

            Employé employe;

           switch(type_list) {
               case ("Manutention"):
                   employe = new Manutentionnaire(prenom, nom, age, annee, unite);
               case ("Production"):
                   employe = new Producteur(prenom, nom, age, annee, unite);
                   break;
               case ("Responsable"):
                   employe = new Responsable(prenom, nom, age, annee, unite);
                   break;

               default:
                   employe = null;
                   break;

           }
            if (employe != null ){
                this.controller.personnel.ajouteremploye(employe);
                this.controller.afficherMenu();
            }




        }
    }


}