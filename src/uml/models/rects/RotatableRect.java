package uml.models.rects;

public class RotatableRect extends Rect
{
    private double rotation;

    public double getRotation()
    {
        return rotation;
    }
    public void setRotation(double rotation)
    {
        this.rotation = rotation % 360;
    }

    //todo check if this rotates clockwise or counterclockwise and change if needed.
    public void rotateClockwise(double degrees)
    {
        setRotation(getRotation() + degrees);
    }
    public void rotateCounterclockwise(double degrees)
    {
        setRotation(getRotation() - degrees);
    }

    @Override
    public String toString()
    {
        return "RotatableRect{" +
                super.toString() +
                ", rotation=" + rotation +
                '}';
    }
}