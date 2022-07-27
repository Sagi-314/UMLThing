package uml.models.factories.player_factories;

import uml.models.rects.RotatableRect;
import uml.models.movements.Movement;
import uml.models.movements.TankMovement;

public class TankFactory extends PlayerFactory
{
    @Override
    protected RotatableRect createBox()
    {
        return new RotatableRect();
    }

    @Override
    public Movement<?> createMovement()
    {
        return new TankMovement();
    }
}
