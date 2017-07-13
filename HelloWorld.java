import com.sun.org.apache.bcel.internal.generic.NEW;
import lejos.nxt.Button;
import lejos.nxt.LCD;
import lejos.nxt.Motor;
import lejos.nxt.Sound;
import java.io.File;
public abstract class HelloWorld
{

    public static void draw(String str, int x , int y)
    {
        LCD.drawString( str, x, y);

    }



    public static void main (String[] args) throws InterruptedException
    {
        draw("Hello World", 4 , 4);

        //Motor A Abschussvorrichtung
        //Motor B Rechts
        //Motor C Links

        Button.waitForAnyPress();
        Motor.A.forward();
        Motor.A.setSpeed(40);
        //TouchSensor touchSensor = new TouchSensor(SensorPort.S1);
        //Boolean isPressed = touchSensor.isPressed();
        Button.waitForAnyPress();
        Motor.A.flt();
        Motor.B.forward();
        Motor.C.forward();
        Motor.B.setSpeed(30);
        Motor.C.setSpeed(30);

        while (Motor.B.isMoving() && Motor.C.isMoving())
        Sound.playSample(new File("DANCE.wav"), 100);

        if (Button.RIGHT.isPressed())
        {
            Motor.B.setSpeed(40);
            Motor.C.setSpeed(30);
        }
        else if (Button.LEFT.isPressed())
        {
            Motor.B.setSpeed(30);
            Motor.C.setSpeed(40);
        }
        else if (Button.ENTER.isPressed())
        {
            Motor.B.setSpeed(30);
            Motor.C.setSpeed(30);
        }
        else if (Button.ESCAPE.isPressed())
        {
            Motor.B.flt();
            Motor.C.flt();
            LCD.drawString("Bye" , 0 , 0);
            Thread.sleep(2000);
            System.exit(0);

        }
    }
}




