package de.gothaer.paintclone;

import java.awt.*;

public class MyMenuBar extends MenuBar {

    public MyMenuBar(){
        Menu menu;
        MenuItem menuItem;

        menu = new Menu("Datei");

        menuItem = new MenuItem("beenden");
        menu.add(menuItem);

        add(menu);

        menu = new Menu("Form");

        menuItem = new MenuItem("Linie");
        menu.add(menuItem);

        menuItem = new MenuItem("Rechteck");
        menu.add(menuItem);

        // Oval, Löschen
        add(menu);

        // Menü "Farben" schwarz, weiss, grün, rot, blau, gelb und pink
    }
}
