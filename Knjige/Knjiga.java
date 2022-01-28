package Knjige;

import Vozilo.Osoba;

public class Knjiga {

    private String nazivKnjige;
    private Osoba autor;
    private Osoba vlasnik;
    private int brojStrana;
    private int godinaIzdanja;


    public Knjiga(String nazivKnjige, Osoba autor, Osoba vlasnik, int brojStrana, int godinaIzdanja) {

        this.nazivKnjige = nazivKnjige;
        this.autor = autor;
        this.vlasnik = vlasnik;
        this.brojStrana = brojStrana;
        this.godinaIzdanja = godinaIzdanja;
        }

    public Knjiga(String nazivKnjige, Osoba autor, int brojStrana, int godinaIzdanja) {

        this.nazivKnjige = nazivKnjige;
        this.autor = autor;
        this.brojStrana = brojStrana;
        this.godinaIzdanja = godinaIzdanja;
    }


    public String getNazivKnjige(){
        return nazivKnjige;
    }
    public void setNazivKnjige(String nazivKnjige){
        this.nazivKnjige = nazivKnjige;
    }

    public Osoba getAutor() {
        return autor;
    }

    public void setAutor(Osoba autor) {
        this.autor = autor;
    }

    public Osoba getVlasnik() {
        return vlasnik;
    }

    public void setVlasnik(Osoba vlasnik) {
        this.vlasnik = vlasnik;
    }

    public int getBrojStrana() {
        return brojStrana;
     }

    public void setBrojStrana(int brojStrana) {
        this.brojStrana = brojStrana;
        }

    public int getGodinaIzdanja() {
        return godinaIzdanja;
    }

    public void setGodinaIzdanja(int godinaIzdanja) {
         this.godinaIzdanja = godinaIzdanja;
    }



    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Naziv knjige je: ");
        sb.append(nazivKnjige);
        sb.append("\n");
        sb.append("Autor knjige je: ");
        sb.append(autor.getIme());
        sb.append(" ");
        sb.append(autor.getPrezime());
        sb.append("\n");
        if(vlasnik == null){
            sb.append("Knjiga nema vlasnika.");
        } else {
            sb.append("Vlasnik knjige je: ");
            sb.append(vlasnik.getIme());
            sb.append(" ");
            sb.append(vlasnik.getPrezime());
        }
        sb.append("\n");
        sb.append("Broj strana: ");
        sb.append(brojStrana);
        sb.append("\n");
        sb.append("Godina izdanja: ");
        sb.append(godinaIzdanja);
        sb.append("\n");

        return sb.toString();

    }


    public String velicinaKnjige(){

        String velicina = "";
        if(brojStrana > 0 && brojStrana <= 100){
            return velicina = "mala knjiga";
        } else if(brojStrana > 100 && brojStrana <= 300){
            return velicina = "srednje velika knjiga";
        } else if(brojStrana > 300 && brojStrana <= 600){
            return velicina = "velika knjiga";
        } else if(brojStrana > 600) {
            return velicina = "bas velika knjiga";
        }

        return velicina;
    }


}
