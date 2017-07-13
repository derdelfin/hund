import lejos.nxt.Motor;

/**
 * Created by Administrator on 10.07.2017.
 */


public class Roboter
{
    public static void fahreVorwaerts(int geschwindigkeit)
    {
        Motor.B.backward();
        Motor.C.backward();
        Motor.B.setSpeed(geschwindigkeit);
        Motor.C.setSpeed(geschwindigkeit);
    }
    public static void fahreRueckwaerts(int geschwindigkeit)
    {
        Motor.B.forward();
        Motor.C.forward();
        Motor.B.setSpeed(geschwindigkeit);
        Motor.C.setSpeed(geschwindigkeit);
    }
}
