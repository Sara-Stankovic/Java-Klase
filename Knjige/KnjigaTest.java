package Knjige;

import Knjige.Knjiga;
import Vozilo.Osoba;

public class KnjigaTest {

    //Napisati i test program, gde je potrebno napraviti 2-3 osobe, i 2-3 knjige.
    // Ispisati osobe, ispisati knjige. Ispisati koje su velicine knjiga

    public static void main(String[] args) {

        Osoba o1 = new Osoba("Petar","Petrovic",1990);
        Osoba o2 = new Osoba("Marko","Markovic",1985);

        Osoba a1 = new Osoba("Ivo","Andric",1892);


        Knjiga k1 = new Knjiga("Znakovi pored puta",a1,o1,-2,2020);
        Knjiga k2 = new Knjiga("Prokleta avlija",a1,117,1999);

        System.out.println(o1);
        System.out.println(k1);
        System.out.println(k1.velicinaKnjige());
        System.out.println("**********");
        System.out.println(o2);
        System.out.println(k2);
        System.out.println(k2.velicinaKnjige());


    }



}
