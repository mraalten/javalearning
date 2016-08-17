package nl.hardwin.javalearning;

public class Adres {


    private String straatnaam;
    private String huisnummer;
    private String huisnummerToevoeging;
    private String postcode;
    private String woonplaats;

    @Override
    public String toString() {
        return "Adres " +
                "straatnaam='" + straatnaam + '\'' +
                ", huisnummer='" + huisnummer + '\'' +
                ", huisnummerToevoeging='" + huisnummerToevoeging + '\'' +
                ", postcode='" + postcode + '\'' +
                ", woonplaats='" + woonplaats + '\'';
    }

    public void setStraatnaam(String Straatnaam){
        this.straatnaam = Straatnaam;
    }

    public String getStraatnaam() {
        return this.straatnaam;
    }

    public void setHuisnummer(String Huisnummer)
    {
        this.huisnummer = Huisnummer;
    }

    public String getHuisnummer() {
        return this.huisnummer;
    }

    public void setHuisnummerToevoeging(String HuisnummerToevoeging)
    {
        this.huisnummerToevoeging = HuisnummerToevoeging;
    }

    public String getHuisnummerToevoeging() {
        return this.huisnummerToevoeging;
    }

    public void setPostcode(String Postcode)
    {
        this.postcode = Postcode;
    }

    public String getPostcode() {
        return this.postcode;
    }

    public void setWoonplaats(String Woonplaats)
    {
        this.woonplaats = Woonplaats;
    }

    public String getWoonplaats() {
        return this.woonplaats;
    }

}
