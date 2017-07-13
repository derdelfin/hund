import lejos.nxt.Button;
import lejos.nxt.ColorSensor;
import lejos.nxt.SensorPort;

public class Farbe
{
    public static void main(String [] args) throws InterruptedException
    {
        ColorSensor colorSensor = new ColorSensor(SensorPort.S1);
        for (int i = 0; i < 10; i++)
        {
            ColorSensor.Color color = colorSensor.getColor();
            System.out.println("Color = " + colorSensor.getColorID() + " " + color.getColor() +
                    "(" + color.getRed() + "," + color.getGreen() + "," + color.getBlue()
                    + ") " + color.getColor());
        }
        Button.waitForAnyPress();
    }
}
