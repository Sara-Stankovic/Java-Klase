package Sport;

public class Sportista {

    private String imePrezime;
    private String sport;
    private String klub;
    private int brojDresa;

    public Sportista(String imePrezime, String sport, String klub, int brojDresa) {
        this.imePrezime = imePrezime;
        this.sport = sport;
        this.klub = klub;
        this.brojDresa = brojDresa;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public String getSport() {
        return sport;
    }

    public String getKlub() {
        return klub;
    }

    public int getBrojDresa() {
        return brojDresa;
    }

    public void setKlub(String klub) {
        this.klub = klub;
    }

    public void setBrojDresa(int brojDresa) {
        this.brojDresa = brojDresa;
    }


}
