package com.ynov.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.ynov.swing.Employé.*;

import static javax.swing.SwingUtilities.invokeLater;

public class ViewController {

    public AjouterEmploye AjoutEmp;
    public JPanel panel;
    public Personnel personnel;
    private SwingView view;
    private Menu menu;
    public Afficher_salarie salarie_list;



    public ViewController(SwingView swingview){

        this.view = swingview;
        this.personnel = new Personnel();


    }

    public void afficherMenu(){
        this.menu = new Menu(this);
        this.view.getContentPane().removeAll();
        this.view.setContentPane(this.panel);
        this.view.revalidate();
        this.view.repaint();
    }

    public void afficherList(){

        this.view.getContentPane().removeAll();
        this.salarie_list = new Afficher_salarie(this);
        this.view.setContentPane(this.panel);
        this.view.revalidate();
        this.view.repaint();
    }

    public void afficherFormulaire(){
        this.AjoutEmp = new AjouterEmploye(this);
        this.view.getContentPane().setLayout(new FlowLayout());
        this.view.getContentPane().add(new JScrollPane());
        this.view.setContentPane(this.panel);
        this.view.setVisible(true);
    }


}

