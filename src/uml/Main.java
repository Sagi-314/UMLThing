package uml;

import uml.models.Player;
import uml.models.factories.player_factories.TankFactory;

public class Main
{
    public static void main(String[] args)
    {
        Player tank = new Player(new TankFactory());

        System.out.println(tank);

        for (int i=0; i<45; i++)
        {
            tank.rotateClockwise();
        }

        for (int i=0; i<100; i++)
        {
            tank.moveForward();

            System.out.println(tank);
        }
    }
}