package Ucenici;

import java.util.ArrayList;

public class UcenikTest {

    public static void main(String[] args) {

        ArrayList<Integer> ocene1 = new ArrayList<>();
        ocene1.add(1);
        ocene1.add(2);
        ocene1.add(2);
        Ucenik u1 = new Ucenik("Marko","Markovic",ocene1);

        ArrayList<Integer> ocene2 = new ArrayList<>();
        ocene2.add(4);
        ocene2.add(4);
        ocene2.add(4);
        Ucenik u2 = new Ucenik("Ivana","Ivanovic",ocene2);

        ArrayList<Integer> o3 = new ArrayList<>();
        o3.add(3);
        o3.add(1);
        o3.add(5);
        Ucenik u3 = new Ucenik("Jovana","Jovic",o3);


       /////////

    ArrayList<Ucenik> prvoDvaDnevnik = new ArrayList<>();
    Odeljenje prvoDva = new Odeljenje("1/2",prvoDvaDnevnik);
    prvoDva.upisiUcenika(u1);
    prvoDva.upisiUcenika(u2);
    prvoDva.upisiUcenika(u3,1);
        System.out.println(prvoDva);
        System.out.println("Markov prosek: ");
        System.out.println(u1.prosek(u1.getOcene()));
        System.out.println("Jovanine ocene: ");
        prvoDva.pogledajOcene(u3);
        System.out.println();
        System.out.println("Ivanina opisna ocena: ");
        prvoDva.opisnaOcena(u2);


    System.out.println("Velicina odeljenja: ");
    prvoDva.velicinaOdeljenja();

    }
}
