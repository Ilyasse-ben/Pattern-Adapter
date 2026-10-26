package net.ilyasse;

import net.ilyasse.computer.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        UniteCentrale uniteCentrale=new UniteCentrale();
        uniteCentrale.setVga(new VP());
        uniteCentrale.afficher("Bonjour");
        uniteCentrale.setVga(new Ecran());
        uniteCentrale.afficher("Bonjour");
        HdmiVgaAdabtateur hdmiVgaAdabtateur=new HdmiVgaAdabtateur();
        hdmiVgaAdabtateur.setHdmi(new TV());
        uniteCentrale.setVga(hdmiVgaAdabtateur);
        uniteCentrale.afficher("very good implémentation of pattern adbter");

    }
}