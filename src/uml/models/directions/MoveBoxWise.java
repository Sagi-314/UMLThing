package uml.models.directions;

import uml.models.rects.Rect;

public interface MoveBoxWise
{
    void moveLeft(Rect rect, double speed);
    void moveRight(Rect rect, double speed);
    void moveUp(Rect rect, double speed);
    void moveDown(Rect rect, double speed);
}
