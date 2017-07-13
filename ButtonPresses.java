/**
 * Created by Administrator on 07.07.2017.
 */
import lejos.nxt.*;
public class ButtonPresses
{
    public static void main (String[] args)
            throws Exception
    {
        while (true) {
            LCD.clear();
            if (Button.ENTER.isPressed()) LCD.drawString("ENTER",0,0);
            if (Button.ESCAPE.isPressed()) System.exit(0);
            if (Button.LEFT.isPressed()) LCD.drawString("LEFT",0,0);
            if (Button.RIGHT.isPressed()) LCD.drawString("RIGHT",0,0);
        }
    }
}