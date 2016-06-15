package nl.aalten.javalearning;

public class Main {

    public static void main(String[] args) {

        Person edwin = new Person("Edwin", "Goudsmidstraat");

        //Date geboortejaarmaanddag = new Date("6/6/1984");
        geboortedatum geboortejaarmaanddag = new geboortedatum(6 ,6 ,1984);

        //SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        //System.out.println("Yes: " + sdf.format(poep));

        //geboortedatum test = new geboortedatum("06/06/1984");
        //Date geboorteDatum = new Date();

        System.out.println("Mijn naam is " + edwin.getNaam());
        System.out.println("Mijn adres is " + edwin.getAdres());
        System.out.println("Mijn geboortedatum is " + geboortejaarmaanddag.getDag() + "/" + geboortejaarmaanddag.getMaand() + "/" + geboortejaarmaanddag.getJaar());

    }

}
