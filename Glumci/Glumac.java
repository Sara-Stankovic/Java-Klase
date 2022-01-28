package Glumci;

public class Glumac {

    private String ime;
    private String prezime;
    private char pol;
    private int godine;
    private double ocena;
    private boolean izSrbije;

    public Glumac(String ime, String prezime, char pol, int godine, double ocena, boolean izSrbije) {
        this.ime = ime;
        this.prezime = prezime;
        this.pol = pol;
        this.godine = godine;
        this.ocena = ocena;
        this.izSrbije = izSrbije;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public char getPol() {
        return pol;
    }

    public int getGodine() {
        return godine;
    }

    public double getOcena() {
        return ocena;
    }

    public boolean isIzSrbije() {
        return izSrbije;
    }

    public String toString(){

        StringBuilder sb = new StringBuilder();

        sb.append("Ime, prezime i pol glumca: ");
        sb.append(ime);
        sb.append(" ");
        sb.append(prezime);
        sb.append(", ");
        sb.append(pol);
        sb.append("\n");


        sb.append("Moja ocena: ");
        sb.append(ocena);
        sb.append("\n");

        sb.append("Da li je glumac iz Srbije? ");
        if(!izSrbije){
            sb.append("Ne");
        }else {
            sb.append("Da");
        }

        return sb.toString();

    }


}
