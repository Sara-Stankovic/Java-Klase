package Ucenici;

import java.util.ArrayList;

public class Ucenik {

    private String ime;
    private String prezime;
    private ArrayList<Integer> ocene;

    public Ucenik(String ime, String prezime, ArrayList<Integer> ocene) {
        this.ime = ime;
        this.prezime = prezime;
        this.ocene = ocene;
    }

    public Ucenik(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
        this.ocene = new ArrayList<>();
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public ArrayList<Integer> getOcene() {
        return ocene;
    }

    public void setOcene(ArrayList<Integer> ocene) {
        this.ocene = ocene;
    }


    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append(ime);
        sb.append(" ");
        sb.append(prezime);
        sb.append(" ima ocene: ");
        sb.append("\n");
        sb.append(ocene);
        sb.append("\n");

        return sb.toString();
    }


    public double prosek(ArrayList<Integer> o){
        double zbir = 0;
        double brojOcena = o.size();
        for(int x : ocene){
            zbir += x;
        }
        return zbir / brojOcena;
    }


}
