package Sport;

public class SportistaTest {

    public static void main(String[] args) {

        Sportista s1 = new Sportista("Lionel Mesi","fudbal","Barselona",10);

        System.out.println("Sportista: " + s1.getImePrezime());
        System.out.println("Klub za koji igra: " + s1.getKlub());
        System.out.println("Broj dresa: " + s1.getBrojDresa());

        s1.setKlub("Paris Sen Zermen");
        System.out.println("Novi klub: " + s1.getKlub());
        s1.setBrojDresa(30);
        System.out.println("Novi broj dresa: " + s1.getBrojDresa());

    }

}
