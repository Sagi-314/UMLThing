package uml.models.directions;

import uml.models.rects.RotatableRect;

public interface Rotatable
{
    void rotateClockwise(RotatableRect rect, double byDegrees);
    void rotateCounterclockwise(RotatableRect rect, double byDegrees);
}