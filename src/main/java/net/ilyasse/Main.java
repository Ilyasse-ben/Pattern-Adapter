package net.ilyasse;

import net.ilyasse.computer.Ecran;
import net.ilyasse.computer.UniteCentrale;
import net.ilyasse.computer.VP;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        UniteCentrale uniteCentrale=new UniteCentrale();
        uniteCentrale.setVga(new VP());
        uniteCentrale.print("Bonjour");
        uniteCentrale.setVga(new Ecran());
        uniteCentrale.print("Bonjour");

    }
}