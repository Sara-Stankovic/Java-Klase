package Vozilo;

public class Osoba {

    private String ime;
    private String prezime;
    private int godinaRodjenja;
    private double visina;


    public Osoba(String ime, String prezime, int godinaRodjenja) {
        this.ime = ime;
        this.prezime = prezime;
        this.godinaRodjenja = godinaRodjenja;
    }


    public String getIme(){
        return ime;
    }
    public void setIme(String ime1){
        ime = ime1;
    }

    public String getPrezime(){
        return prezime;
    }
    public void setPrezime(String prezime1){
        prezime = prezime1;
    }

    public int getGodinaRodjenja(){
        return godinaRodjenja;
    }
    public void setGodinaRodjenja(int godinaRodjenja1){
        godinaRodjenja=godinaRodjenja1;
    }

    public double getVisina(){
        return visina;
    }
    public void setVisina(double visina1){
        visina = visina1;
    }



    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Ime: " + ime + "\n");
        sb.append("Prezime: " + prezime + "\n");
        sb.append("Godina rodjenja: " + godinaRodjenja + "\n");

        return sb.toString();
    }

}

