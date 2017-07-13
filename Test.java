
import lejos.nxt.LCD;

public class Button {
    public Button() {
    }

    public static void main(String[] var0) throws Exception
    {

        public static final Button ENTER;

        while(true)
        {
            LCD.clear();
            if(Button.ENTER.isPressed()) {
                LCD.drawString("ENTER", 0, 0);
            }

            if(Button.ESCAPE.isPressed()) {
                LCD.drawString("ESCAPE", 0, 0);
            }

            if(Button.LEFT.isPressed()) {
                LCD.drawString("LEFT", 0, 0);
            }

            if(Button.RIGHT.isPressed()) {
                LCD.drawString("RIGHT", 0, 0);
            }

}
