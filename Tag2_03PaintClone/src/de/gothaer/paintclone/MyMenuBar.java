package de.gothaer.paintclone;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import static de.gothaer.paintclone.PaintClone.Form.*;
import static java.awt.Color.*;

public class MyMenuBar extends MenuBar {

    public MyMenuBar(final PaintClone paintClone){
        Menu menu;
        MenuItem menuItem;

        menu = new Menu("Datei");

        menuItem = new MenuItem("beenden");
        menuItem.addActionListener(e->paintClone.dispose());
        menu.add(menuItem);

        add(menu);

        menu = new Menu("Form");

        menuItem = new MenuItem("Linie");
        menuItem.addActionListener(e->paintClone.setForm(LINIE));
        menu.add(menuItem);

        menuItem = new MenuItem("Rechteck");
        menu.add(menuItem);

        menuItem = new MenuItem("Oval");
        menu.add(menuItem);

        menu.addSeparator();

        menuItem = new MenuItem("Löschen");
        menu.add(menuItem);


        add(menu);

        menu = new Menu("Farben");

        menuItem = new MenuItem("Schwarz");
        menuItem.addActionListener(e->paintClone.setFarbe(BLACK));
        menu.add(menuItem);

        menuItem = new MenuItem("Weiss");
        menu.add(menuItem);
        menuItem = new MenuItem("Rot");
        menu.add(menuItem);

        menuItem = new MenuItem("Grün");
        menu.add(menuItem);

        menuItem = new MenuItem("Blau");
        menu.add(menuItem);

        menuItem = new MenuItem("Gelb");
        menu.add(menuItem);

        menuItem = new MenuItem("Pink");
        menu.add(menuItem);

        add(menu);
    }
}
