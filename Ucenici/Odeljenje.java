package Ucenici;


import java.util.ArrayList;

public class Odeljenje {

    private String oznaka;
    private ArrayList<Ucenik> dnevnik;

    public Odeljenje(String oznaka, ArrayList<Ucenik> dnevnik) {
        this.oznaka = oznaka;
        this.dnevnik = dnevnik;
    }

    public Odeljenje(String oznaka) {
        this.oznaka = oznaka;
        this.dnevnik = new ArrayList<>();
    }

    public String getOznaka() {
        return oznaka;
    }

    public void setOznaka(String oznaka) {
        this.oznaka = oznaka;
    }

    public ArrayList<Ucenik> getDnevnik() {
        return dnevnik;
    }

    public void setDnevnik(ArrayList<Ucenik> dnevnik) {
        this.dnevnik = dnevnik;
    }

    public void upisiUcenika(Ucenik u) {
        dnevnik.add(u);
    }


    public void upisiUcenika(Ucenik u, int redniBroj) {
        dnevnik.add(redniBroj, u);
    }


    public void ispisiUcenika(Ucenik u) {
        dnevnik.remove(u);
    }

    public void ispisiUcenika(int i) {
        dnevnik.remove(i);
    }


    public void pogledajOcene(Ucenik u) {
        System.out.println(u.getOcene());
    }

    public void pogledajOcene(int i) {

        for (Ucenik redniBroj : dnevnik) {
            redniBroj = dnevnik.get(i);
            System.out.println(redniBroj.getOcene());
            break;
        }

    }

    public void prosecnaOcena(Ucenik u) {
        double zbir = 0;
        int brojOcena = u.getOcene().size();
        for (int o : u.getOcene()) {
            zbir += o;
        }
        System.out.println(zbir / brojOcena);
    }


    public void prosecnaOcena(int i) {
        for (Ucenik u : dnevnik) {
            u = dnevnik.get(i);
            System.out.println(u.prosek(u.getOcene()));
            break;
        }

    }

    public double prosecnaOcenaOdeljenja() {
        double prosek = 0;
        double sum = 0;
        for (Ucenik u : dnevnik) {
            u.prosek(u.getOcene());
            sum += u.prosek(u.getOcene());
            if (dnevnik.isEmpty()) {
                prosek = 0.0;
           } else {
                prosek = sum / dnevnik.size();
            }
        }
            return prosek;
    }

    public void opisnaOcena(Ucenik u){
        double prosek = u.prosek(u.getOcene());
        if (prosek == 1)
            System.out.println("Nedovoljan");
        else if (prosek >= 4.5)
            System.out.println("Odlican");
        else if (prosek >= 3.5)
            System.out.println("Vrlo dobar");
        else if (prosek >= 2.5)
            System.out.println("Dobar");
        else
            System.out.println("Dovoljan");
    }


    public String izlistajDnevnik(){
        StringBuilder sb = new StringBuilder();
        for(Ucenik u : dnevnik){
            sb.append(u.getIme()).append(" ima ocene:\n");
            sb.append(u.getOcene());
        }
        return sb.toString();
    }


    public String velicinaOdeljenja(){
        String s = "";
        if(dnevnik.size() > 25){
            System.out.println("Veliko odeljenje");
        }else if(dnevnik.size() > 15){
            System.out.println("Srednje odeljenje");
        } else if(dnevnik.size() > 0){
            System.out.println("Malo odeljenje");
        }
        return s;
    }



    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append(oznaka);
        sb.append(" ima djake: ");
        sb.append("\n");
        for(Ucenik u : dnevnik){
            sb.append(u.getIme());
            sb.append(" ");
            sb.append(u.getPrezime());
            sb.append("\n");
        }
        return sb.toString();
    }



}