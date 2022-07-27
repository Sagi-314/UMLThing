package uml.models;

import uml.models.directions.*;
import uml.models.directions.Rotatable;
import uml.models.rects.RotatableRect;
import uml.models.factories.player_factories.PlayerFactory;

public class Player
{
    private final RotatableRect rect;

    private final double baseSpeed;
    private final double baseRotationSpeed;

    private double speed;
    private double rotationSpeed;

    private final Rotatable rotatable;
    private final MoveBackAndForth moveBackAndForth;
    private final MoveBoxWise moveBoxWise;

    public Player(PlayerFactory playerFactory)
    {
        rect = playerFactory.getRotatableRect();
        rotatable = playerFactory.createRotatable();
        moveBackAndForth = playerFactory.createMoveBackAndForth();
        moveBoxWise = playerFactory.createMoveBoxWise();
        baseSpeed = playerFactory.getBaseSpeed();
        baseRotationSpeed = playerFactory.getBaseRotationSpeed();

        speed = baseSpeed;
        rotationSpeed = baseRotationSpeed;
    }


    public void moveForward()
    {
        if (moveBackAndForth != null)
        {
            moveBackAndForth.moveForward(rect, speed);
        }
    }
    public void moveBackward()
    {
        if (moveBackAndForth != null)
        {
            moveBackAndForth.moveBackward(rect, speed);
        }
    }


    public void moveLeft()
    {
        if (moveBoxWise != null)
        {
            moveBoxWise.moveLeft(rect, speed);
        }
    }
    public void moveRight()
    {
        if (moveBoxWise != null)
        {
            moveBoxWise.moveRight(rect, speed);
        }
    }
    public void moveUp()
    {
        if (moveBoxWise != null)
        {
            moveBoxWise.moveUp(rect, speed);
        }
    }
    public void moveDown()
    {
        if (moveBoxWise != null)
        {
            moveBoxWise.moveDown(rect, speed);
        }
    }


    public void rotateClockwise()
    {
        if (rotatable != null)
        {
            rotatable.rotateClockwise(rect, rotationSpeed);
        }
    }
    public void rotateCounterclockwise()
    {
        if (rotatable != null)
        {
            rotatable.rotateCounterclockwise(rect, rotationSpeed);
        }
    }

    @Override
    public String toString()
    {
        return rect.toString();
    }
}