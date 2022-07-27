package uml.models.movements;

import uml.models.directions.TankDirection;
import uml.models.rects.RotatableRect;

public class TankMovement extends Movement<TankDirection>
{
    @Override
    public void move(RotatableRect rect, double speed, double rotationSpeed)
    {
        turnLeftIfNeeded(rect, rotationSpeed);
        turnRightIdNeeded(rect, rotationSpeed);
        moveForwardIfNeeded(rect, speed);
        moveBackwardIfNeeded(rect, speed);
    }

    public TankMovement()
    {
        super(TankDirection.NULL);
    }

    private void turnLeftIfNeeded(RotatableRect rect, double rotationSpeed)
    {
        if (isDirectionOn(TankDirection.LEFT_TURN))
        {
            rect.rotateClockwise(rotationSpeed);
        }
    }
    private void turnRightIdNeeded(RotatableRect rect, double rotationSpeed)
    {
        if (isDirectionOn(TankDirection.RIGHT_TURN))
        {
            rect.rotateCounterclockwise(rotationSpeed);
        }
    }
    private void moveForwardIfNeeded(RotatableRect rect, double speed)
    {
        if (isDirectionOn(TankDirection.FORWARD))
        {
            double rotationInRadians = Math.toRadians(rect.getRotation() + 90);
            rect.decreaseX(speed * Math.cos(rotationInRadians)); //Cos of radians gives us the X of the incline (number between 0-1)
            rect.decreaseY(speed * Math.sin(rotationInRadians)); //Sin of radians gives us the Y of the incline (number between 0-1)
        }
    }
    private void moveBackwardIfNeeded(RotatableRect rect, double speed)
    {
        if (isDirectionOn(TankDirection.BACKWARD))
        {
            double rotationInRadians = Math.toRadians(rect.getRotation() + 90);
            rect.increaseX(speed * Math.cos(rotationInRadians)); //Cos of radians gives us the X of the incline (number between 0-1)
            rect.increaseY(speed * Math.sin(rotationInRadians)); //Sin of radians gives us the Y of the incline (number between 0-1)

        }
    }
}