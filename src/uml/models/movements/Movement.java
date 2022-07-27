package uml.models.movements;

import uml.models.rects.RotatableRect;

public abstract class Movement
{
    public abstract void move(RotatableRect rect, double speed, double rotationSpeed);


}