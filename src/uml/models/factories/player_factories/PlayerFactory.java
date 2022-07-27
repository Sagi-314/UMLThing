package uml.models.factories.player_factories;

import uml.models.directions.MoveBackAndForth;
import uml.models.directions.MoveBoxWise;
import uml.models.directions.Rotatable;
import uml.models.rects.RotatableRect;

public abstract class PlayerFactory
{
    public abstract int getBaseSpeed();
    public abstract int getBaseRotationSpeed();

    protected RotatableRect rect;

    public final RotatableRect getRotatableRect()
    {
        if (rect == null)
        {
            rect = new RotatableRect();
        }
        return rect;
    }

    public Rotatable createRotatable()
    {
        return null;
    }

    public MoveBackAndForth createMoveBackAndForth()
    {
        return null;
    }

    public MoveBoxWise createMoveBoxWise()
    {
        return null;
    }
}