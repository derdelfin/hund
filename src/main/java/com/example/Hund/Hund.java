package main.java.com.example.Hund;

import java.util.Date;

/**
 * Fragenmaschine v1
 * Created by tdolfen on 05.07.2017.
 */

class Hund
{

    //Eigenschaften
    String farbe;
    String augenfarbe;
    String rasse;

    Double groesse;
    Double gewicht;
    Double alter;

    Boolean gefahr;
    Boolean ohren;

    Date geburtstag;








    //Konstruktor
    Hund(String color, String eyecolor, String race, Double height, Double weight, Double age, Boolean danger, Boolean ears, Date birth)
    {
        this.farbe = color ;
        this.augenfarbe = eyecolor ;
        this.rasse = race;
        this.groesse = height;
        this.gewicht = weight;
        this.alter = age;
        this.gefahr = danger;
        this.ohren = ears;
        this.geburtstag = birth;
    }

    //Objekt
    Hund hund = new Hund();

    public Hund()
    {
    }


}
