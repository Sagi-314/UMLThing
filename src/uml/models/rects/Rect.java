package uml.models.rects;

public class Rect
{
    private double x;
    private double y;
    private double width;
    private double height;

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

    @Override
    public String toString()
    {
        return "Rect{" +
                "x=" + x +
                ", y=" + y +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
