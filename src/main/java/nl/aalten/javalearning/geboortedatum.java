package nl.aalten.javalearning;

public class geboortedatum {

    private int dag;
    private int maand;
    private int jaar;

    public geboortedatum(int dag, int maand, int jaar) {
        this.dag = dag;
        this.maand = maand;
        this.jaar = jaar;
    }

    // getters
    public int getDag() {
        return this.dag;
    }
    // getters
    public int getMaand() {
        return this.maand;
    }
    // getters
    public int getJaar() {
        return this.jaar;
    }


}