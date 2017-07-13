import lejos.nxt.*;
import lejos.nxt.addon.OpticalDistanceSensor;

import java.io.File;

public class Objects
{
    
    public static void main(String[] args) throws InterruptedException
    {
        Roboter roboter = new Roboter();
        UltrasonicSensor ultrasonicSensor = new UltrasonicSensor(SensorPort.S1);
        
        while (!Button.ESCAPE.isPressed())
        {
            roboter.fahreVorwaerts(150);
            ultrasonicSensor.getDistance();
            LCD.drawString(Distance );
        }
    }

}