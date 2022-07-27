package uml.models;

import uml.models.rects.RotatableRect;

public abstract class Direction
{
    private final RotatableRect rect;

    public Direction(RotatableRect rect)
    {

        this.rect = rect;
    }

    public void turnClockwise(double byDegrees)
    {
        rect.rotateClockwise(byDegrees);
    }
    public void turnCounterclockwise(double byDegrees)
    {
        rect.rotateCounterclockwise(byDegrees);
    }
    public void moveForward(double speed)
    {
        double rotationInRadians = Math.toRadians(rect.getRotation() + 90);
        rect.decreaseX(speed * Math.cos(rotationInRadians)); //Cos of radians gives us the X of the incline (number between 0-1)
        rect.decreaseY(speed * Math.sin(rotationInRadians)); //Sin of radians gives us the Y of the incline (number between 0-1)
    }
    public void moveBackward(double speed)
    {
        double rotationInRadians = Math.toRadians(rect.getRotation() + 90);
        rect.increaseX(speed * Math.cos(rotationInRadians)); //Cos of radians gives us the X of the incline (number between 0-1)
        rect.increaseY(speed * Math.sin(rotationInRadians)); //Sin of radians gives us the Y of the incline (number between 0-1)
    }

    public void moveUp(double by)
    {
        rect.decreaseY(by);
    }
    public void moveDown(double by)
    {
        rect.increaseY(by);
    }
    public void moveLeft(double by)
    {
        rect.decreaseX(by);
    }
    public void moveRight(double by)
    {
        rect.increaseX(by);
    }
}
