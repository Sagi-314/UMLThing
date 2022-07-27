package uml.models.movements;

import uml.models.directions.MoveBackAndForth;
import uml.models.directions.Rotatable;
import uml.models.rects.RotatableRect;

public class VehicleMovement implements MoveBackAndForth, Rotatable
{
    private static final int FORWARD = -1;
    private static final int BACKWARD = 1;

    @Override
    public void moveForward(RotatableRect rect, double speed)
    {
        move(rect, speed, FORWARD);
    }

    @Override
    public void moveBackward(RotatableRect rect, double speed)
    {
        move(rect, speed, BACKWARD);
    }

    private void move(RotatableRect rect, double speed, int multiplier)
    {
        double rotationInRadians = Math.toRadians(rect.getRotation() + 90);
        rect.increaseX(speed * multiplier * Math.cos(rotationInRadians)); //Cos of radians gives us the X of the incline (number between 0-1)
        rect.increaseY(speed * multiplier * Math.sin(rotationInRadians)); //Sin of radians gives us the Y of the incline (number between 0-1)
    }

    @Override
    public void rotateClockwise(RotatableRect rect, double byDegrees)
    {
        rect.rotateClockwise(byDegrees);
    }

    @Override
    public void rotateCounterclockwise(RotatableRect rect, double byDegrees)
    {
        rect.rotateCounterclockwise(byDegrees);
    }
}
