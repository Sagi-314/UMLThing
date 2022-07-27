package uml.models;

import uml.models.rects.RotatableRect;
import uml.models.factories.player_factories.PlayerFactory;
import uml.models.movements.Movement;

public class Player
{
    private final RotatableRect rect;
    private final Movement<?> movement;

    private final double basicSpeed;
    private final double basicRotationSpeed;

    public Player(PlayerFactory playerFactory)
    {
        rect = playerFactory.getBox();
        movement = playerFactory.createMovement();
        basicSpeed = playerFactory.getBasicSpeed();
        basicRotationSpeed = playerFactory.getBasicRotationSpeed();
    }

    public void move()
    {
        if (movement != null)
        {
            movement.move(rect, basicSpeed, basicRotationSpeed);
        }
    }

    public Movement<?> getMovement()
    {
        return movement;
    }

    @Override
    public String toString()
    {
        return "Player{" +
                "rect=" + rect +
                '}';
    }
}