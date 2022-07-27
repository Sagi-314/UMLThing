package uml.models.rects;

public class RotatableRect
{
    private double x;
    private double y;
    private double width;
    private double height;

    private double rotation;

    public double getX()
    {
        return x;
    }
    public double getY()
    {
        return y;
    }
    public double getWidth()
    {
        return width;
    }
    public double getHeight()
    {
        return height;
    }
    public double getRotation()
    {
        return rotation;
    }

    public void setX(double x)
    {
        this.x = x;
    }
    public void setY(double y)
    {
        this.y = y;
    }
    public void setWidth(double width)
    {
        this.width = width;
    }
    public void setHeight(double height)
    {
        this.height = height;
    }
    public void setRotation(double rotation)
    {
        this.rotation = rotation % 360;
    }

    public void increaseX(double increaseBy)
    {
        setX(getX() + increaseBy);
    }
    public void decreaseX(double decreaseBy)
    {
        setX(getX() - decreaseBy);
    }

    public void increaseY(double increaseBy)
    {
        setY(getY() + increaseBy);
    }
    public void decreaseY(double decreaseBy)
    {
        setY(getY() - decreaseBy);
    }

    public void increaseWidth(double increaseBy)
    {
        setWidth(getWidth() + increaseBy);
    }
    public void decreaseWidth(double decreaseBy)
    {
        setWidth(getWidth() - decreaseBy);
    }

    public void increaseHeight(double increaseBy)
    {
        setHeight(getHeight() + increaseBy);
    }
    public void decreaseHeight(double decreaseBy)
    {
        setHeight(getHeight() - decreaseBy);
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
                "x=" + x +
                ", y=" + y +
                ", width=" + width +
                ", height=" + height +
                ", rotation=" + rotation +
                '}';
    }
}