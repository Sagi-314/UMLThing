package uml.models.factories.player_factories;


import uml.models.movements.Movement;
import uml.models.rects.RotatableRect;

public abstract class PlayerFactory
{
    private RotatableRect rect;


    //overridable
    protected RotatableRect createBox()
    {
        return new RotatableRect();
    }
    public Movement<?> createMovement()
    {
        return null;
    }
    public double getBasicSpeed()
    {
        return 3;
    }
    public double getBasicRotationSpeed()
    {
        return 1;
    }

    public Object createBaseDirection()
    {
        return null;
    }

    //non overridable

    public final RotatableRect getBox()
    {
        if (rect == null)
        {
            return rect = createBox();
        }
        return rect;
    }
}