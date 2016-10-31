package nl.hardwin.javalearning.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MyRekening {

    private String name;

    public MyRekening() {

    }

    public MyRekening(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
