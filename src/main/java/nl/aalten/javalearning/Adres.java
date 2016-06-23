package nl.aalten.javalearning;

/**
 * Created by edwincox on 22-6-2016.
 */
public class Adres {


    private String Straatnaam;
    private String Huisnummer;
    private String HuisnummerToevoeging;
    private String Postcode;
    private String Woonplaats;


    public void setStraatnaam(String Straatnaam){
        this.Straatnaam = Straatnaam;
    }

    public String getStraatnaam() {
        return this.Straatnaam;
    }

    public void setHuisnummer(String Huisnummer)
    {
        this.Huisnummer = Huisnummer;
    }

    public String getHuisnummer() {
        return this.Huisnummer;
    }

    public void setHuisnummerToevoeging(String HuisnummerToevoeging)
    {
        this.HuisnummerToevoeging = HuisnummerToevoeging;
    }

    public String getHuisnummerToevoeging() {
        return this.HuisnummerToevoeging;
    }

    public void setPostcode(String Postcode)
    {
        this.Postcode = Postcode;
    }

    public String getPostcode() {
        return this.Postcode;
    }

    public void setWoonplaats(String Woonplaats)
    {
        this.Woonplaats = Woonplaats;
    }

    public String getWoonplaats() {
        return this.Woonplaats;
    }

}
