package uml.models.directions;

import uml.models.rects.RotatableRect;

public interface MoveBackAndForth
{
    void moveForward(RotatableRect rect, double speed);
    void moveBackward(RotatableRect rect, double speed);
}
