package de.gothaer.paintclone;

import java.awt.*;



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
        menuItem.addActionListener(e->paintClone.setForm(RECHTECK));
        menu.add(menuItem);

        menuItem = new MenuItem("Oval");
        menuItem.addActionListener(e->paintClone.setForm(OVAL));
        menu.add(menuItem);

        menu.addSeparator();

        menuItem = new MenuItem("Löschen");
        menuItem.addActionListener(e->paintClone.setForm(LOESCHEN));
        menu.add(menuItem);


        add(menu);

        menu = new Menu("Farben");

        menuItem = new MenuItem("Schwarz");
        menuItem.addActionListener(e->paintClone.setFarbe(BLACK));
        menu.add(menuItem);

        menuItem = new MenuItem("Weiss");
        menuItem.addActionListener(e->paintClone.setFarbe(WHITE));
        menu.add(menuItem);

        menuItem = new MenuItem("Rot");
        menuItem.addActionListener(e->paintClone.setFarbe(RED));
        menu.add(menuItem);

        menuItem = new MenuItem("Grün");
        menuItem.addActionListener(e->paintClone.setFarbe(GREEN));
        menu.add(menuItem);

        menuItem = new MenuItem("Blau");
        menuItem.addActionListener(e->paintClone.setFarbe(BLUE));
        menu.add(menuItem);

        menuItem = new MenuItem("Gelb");
        menuItem.addActionListener(e->paintClone.setFarbe(YELLOW));
        menu.add(menuItem);

        menuItem = new MenuItem("Pink");
        menuItem.addActionListener(e->paintClone.setFarbe(PINK));
        menu.add(menuItem);

        add(menu);
    }
}
