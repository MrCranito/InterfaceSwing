package com.ynov.swing;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu implements ActionListener {
    private ViewController viewManager;

    private JButton listButton;
    private JButton addEmploye;

    public Menu(ViewController viewManager){

        this.viewManager = viewManager;

        this.viewManager.panel = new JPanel();


        this.addEmploye = new JButton("Ajouter un employé");
        this.addEmploye.addActionListener(this);
        this.listButton = new JButton("Lister les employés");
        this.listButton.addActionListener(this);


        this.viewManager.panel.setLayout(new GridLayout());
        this.viewManager.panel.add(this.addEmploye);
        this.viewManager.panel.add(this.listButton);




    }

    public void actionPerformed(ActionEvent event) {
        if(event.getSource() == this.listButton){
            System.out.println("list");
            this.viewManager.afficherList();
        }

        else if(event.getSource() == this.addEmploye){
            System.out.println("add");
            this.viewManager.afficherFormulaire();
        }
    }


}
