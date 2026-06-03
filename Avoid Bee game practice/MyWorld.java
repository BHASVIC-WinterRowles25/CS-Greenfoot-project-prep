import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Player player = new Player();
        addObject(player,155,270);
        Enemy bee1 = new Enemy();
        addObject(bee1, 100, 60);
        Enemy bee2 = new Enemy();
        addObject(bee2, 200, 270);
        Enemy bee3 = new Enemy();
        addObject(bee3, 300, 540);
        Enemy enemy4 = new Enemy();
        addObject(enemy4,312,134);
        Enemy enemy5 = new Enemy();
        addObject(enemy5,590,34);
        Enemy enemy6 = new Enemy();
        addObject(enemy6,513,242);
        Enemy enemy7 = new Enemy();
        addObject(enemy7,489,412);
        Enemy enemy8 = new Enemy();
        addObject(enemy8,93,453);
        Enemy enemy9 = new Enemy();
        addObject(enemy9,622,522);
        player.setLocation(87,275);
    }
}
