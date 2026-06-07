import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mouse here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mouse extends Actor
{
    /**
     * Act - do whatever the Mouse wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int speed = 2;
    public Mouse()
    {
        getImage().scale(getImage().getWidth() /2, getImage().getHeight()/2);
    }
    public void act()
    {
        moveAround();
        hitFood();
        hitTeleporter();
        youLose();
    }
    public void moveAround()
    {
        if (Greenfoot.isKeyDown("d"))
        {
            setLocation(getX() + speed, getY());
            if (hitWall())
            {
                setLocation(getX() - speed, getY());
            }
        }
        if (Greenfoot.isKeyDown("a"))
        {
            setLocation(getX() - speed, getY());
            if (hitWall())
            {
                setLocation(getX() + speed, getY());
            }
        }
        if (Greenfoot.isKeyDown("w"))
        {
            setLocation(getX() , getY() - speed);
            if (hitWall())
            {
                setLocation(getX(), getY() + speed);
            }
        }
        if (Greenfoot.isKeyDown("s"))
        {
            setLocation(getX() , getY() + speed);
            if (hitWall())
            {
                setLocation(getX(), getY() - speed);
            }
        }
    }
    public boolean hitWall()
    {
        if (isTouching(Walls.class))
        {
            return true;
        }
        return false;
    }
    public void hitFood()
    {
        if (getOneIntersectingObject(Cheese.class) != null)
        {
            getWorld().removeObject(getOneIntersectingObject(Cheese.class));
            speed++;
        }
    }
    public void hitTeleporter()
    {
        if (isTouching(Teleporter.class))
        {
            setLocation(32, 566);
        }
    }
    public boolean hitEnemy()
    {
        if (isTouching(Enemy.class))
        {
            return true;
        }
        return false;
    }
    public void youLose()
    {
        if (hitEnemy())
        {
            getWorld().addObject(new YouLose(), 375, 275);
            Greenfoot.stop();
        }
    }
}
