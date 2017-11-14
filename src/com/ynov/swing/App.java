package com.ynov.swing;

import java.awt.*;

public class App {

    public static void main (String[] args){
        SwingView my_menu = new SwingView();
        ViewController viewManager = new ViewController(my_menu);

        viewManager.afficherMenu();
    }
}
