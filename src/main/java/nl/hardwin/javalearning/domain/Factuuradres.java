package nl.hardwin.javalearning.domain;


public class Factuuradres extends Adres {

    private String Postbus;

    @Override
    public String toString(){
        String adres = super.toString();
        return "Postbus" + this.Postbus + " " + adres;
    }

    public void setPostbus(String Postbus){
        this.Postbus = Postbus;
    }

    public String getPostbus(){
        return this.Postbus;
    }

}
