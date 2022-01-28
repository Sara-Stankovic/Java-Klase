package Vozilo;

public class Voznja {

    public static void main(String[] args) {

        Osoba o1 = new Osoba("Marko","Markovic",1985);
        Osoba o2 = new Osoba("Janko", "Jankovic",1990);

        Automobil auto1 = new Automobil("Opel", "Astra",14780, o1);
        Automobil auto2 = new Automobil("Fiat","500L",25820);

        System.out.println("Serijski broj vozila " + auto1.getMarka() + " " + auto1.getModel() + " je " + auto1.getSerijskiBroj());

        System.out.println("Vlasnik vozila " + auto1.getMarka() + " " + auto1.getModel() + " je " + auto1.getVlasnik().getIme() + " " + auto1.getVlasnik().getPrezime());

        auto1.setVlasnik(o2);

        System.out.println("Novi vlasnik vozila je " + auto1.getVlasnik().getIme() + " " + auto1.getVlasnik().getPrezime());

        System.out.println("Vozila u ponudi: " + "\n" + auto1.getMarka() + " " + auto1.getModel() + "\n" + auto2.getMarka() + " " + auto2.getModel());

    }


}
