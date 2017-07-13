import lejos.nxt.*;
import lejos.nxt.Button;
import lejos.nxt.addon.*;
import lejos.nxt.addon.OpticalDistanceSensor;

import java.io.File;


public abstract class TestBewegung
{

    /**public static void draw(String str, int x , int y)
    {
        LCD.drawString( str, x, y);

    }
*/

    public static void main (String[] args) throws InterruptedException
    {
        //draw("Hello World", 4 , 4);

        //Motor A Abschussvorrichtung
        //Motor B Rechts
        //Motor C Links

        //Button.waitForAnyPress();
        //Motor.A.forward();
        //Motor.A.setSpeed(40);
        //TouchSensor touchSensor = new TouchSensor(SensorPort.S1);
        //Boolean isPressed = touchSensor.isPressed();
        //Button.waitForAnyPress();
        //Motor.A.flt();
        //Motor.B.backward();
        //Motor.C.backward();
        //Motor.B.setSpeed(200);
        //Motor.C.setSpeed(200);
        //Button.waitForAnyPress();


        UltrasonicSensor ultrasonicSensor = new UltrasonicSensor(SensorPort.S1);
        LCD.drawString("Distance : "+ ultrasonicSensor.getDistance(), 0, 0);
        Button.waitForAnyPress();


       /** Sound.playSample(new File("tanz.wav"), 100 );
        while (! Button.ESCAPE.isPressed())
        {
            Motor.B.backward();
            Motor.C.backward();
            Motor.B.setSpeed(200);
            Motor.C.setSpeed(200);

            if (Button.RIGHT.isPressed()) ;
            {
                Motor.B.setSpeed(300);
                Motor.C.setSpeed(200);
            }


            if (Button.LEFT.isPressed()) ;
            {
                Motor.B.setSpeed(200);
                Motor.C.setSpeed(300);
            }

            if (Button.ENTER.isPressed()) ;
            {
                Motor.B.setSpeed(200);
                Motor.C.setSpeed(200);
            }

            if (Button.ESCAPE.isPressed()) ;
            {
                Motor.B.flt();
                Motor.C.flt();
                LCD.drawString("Bye", 0, 0);
                Thread.sleep(2000);
                System.exit(0);
            }
        } */
    }
}
