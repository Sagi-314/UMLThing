package uml.models.factories.player_factories;

import uml.models.directions.MoveBackAndForth;
import uml.models.directions.Rotatable;
import uml.models.movements.VehicleMovement;

public class TankFactory extends PlayerFactory
{
    private static final int baseSpeed = 1;
    private static final int baseRotationSpeed = 1;

    private VehicleMovement vehicleMovement;

    @Override
    public int getBaseSpeed()
    {
        return baseSpeed;
    }

    @Override
    public int getBaseRotationSpeed()
    {
        return baseRotationSpeed;
    }

    protected final VehicleMovement getVehicleMovement()
    {
        if (vehicleMovement == null)
        {
            vehicleMovement = new VehicleMovement();
        }
        return vehicleMovement;
    }

    @Override
    public Rotatable createRotatable()
    {
        return getVehicleMovement();
    }

    @Override
    public MoveBackAndForth createMoveBackAndForth()
    {
        return getVehicleMovement();
    }
}
