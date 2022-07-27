package uml.models;

import java.util.EnumSet;

public class Vehicle
{
    EnumSet<VehicleDirection> directions = EnumSet.noneOf(VehicleDirection.class);

    public void setDirection(VehicleDirection direction, boolean set)
    {
        if (set)
        {
            directions.add(direction);
        }
        else
        {
            directions.remove(direction);
        }
    }
}
