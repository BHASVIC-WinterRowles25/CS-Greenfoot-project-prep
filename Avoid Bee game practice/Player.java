import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int speed = 2;
    int baseSpeed = speed;
    public void act()
    {
        moveAround();
        youWin();
        hitEnemy();
    }
    public void moveAround()
    {
        if (Greenfoot.isKeyDown("right"))
        {
            move(speed);
        }
        if (Greenfoot.isKeyDown("left"))
        {
            move(-speed);
        }
        if (Greenfoot.isKeyDown("down"))
        {
            turn(2);
        }
        if (Greenfoot.isKeyDown("up"))
        {
            turn(-2);
        }
        if (Greenfoot.isKeyDown("space"))
        {
            speed = speed + 2;
        }
        else
        {
            speed = baseSpeed;
        }
    }
    public void hitEnemy()
    {
        if (isTouching(Enemy.class))
        {
            getWorld().addObject(new YouLose(), 400, 300);
            getWorld().removeObject(this);
            Greenfoot.stop();
        }
    }
    public void youWin()
    {
        if (getY() >= 599)
        {
            getWorld().addObject(new YouWin(), 400, 300);
            Greenfoot.stop();
        }
    }
}    
