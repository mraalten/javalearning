package nl.aalten.javalearning;

public class Person {

    private String naam;
    private Adres correspondentieAdres;
    private BerekenGeboortedatum berekenGeboorte;

    @Override
    public String toString() {
        return naam;
    }

    public void setNaam(String naam)
    {
        this.naam = naam;
    }

    public String getNaam() {
        return this.naam;
    }


    public Adres getCorrespondentieAdres(){
        return this.correspondentieAdres;
    }

    public Adres setCorrespondentieAdres(Adres correspondentieAdres){
        return this.correspondentieAdres = correspondentieAdres;
    }

    public BerekenGeboortedatum getberekenGeboorte(){
        return this.berekenGeboorte;
    }

    public BerekenGeboortedatum setberekenGeboorte(BerekenGeboortedatum berekenGeboorte){
        return this.berekenGeboorte = berekenGeboorte;
    }


}
