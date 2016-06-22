package nl.aalten.javalearning;

public class Adres {

    private String straatNaam;
    private int huisnummer;
    private String huisnummerToevoeging;
    private String postcode;
    private String woonplaats;

    @Override
    public String toString() {
        return "Adres{" +
                "straatNaam='" + straatNaam + '\'' +
                ", huisnummer=" + huisnummer +
                ", huisnummerToevoeging='" + huisnummerToevoeging + '\'' +
                ", postcode='" + postcode + '\'' +
                ", woonplaats='" + woonplaats + '\'' +
                '}';
    }

    public String getStraatNaam() {
        return straatNaam;
    }

    public void setStraatNaam(String straatNaam) {
        this.straatNaam = straatNaam;
    }

    public int getHuisnummer() {
        return huisnummer;
    }

    public void setHuisnummer(int huisnummer) {
        this.huisnummer = huisnummer;
    }

    public String getHuisnummerToevoeging() {
        return huisnummerToevoeging;
    }

    public void setHuisnummerToevoeging(String huisnummerToevoeging) {
        this.huisnummerToevoeging = huisnummerToevoeging;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getWoonplaats() {
        return woonplaats;
    }

    public void setWoonplaats(String woonplaats) {
        this.woonplaats = woonplaats;
    }
}
