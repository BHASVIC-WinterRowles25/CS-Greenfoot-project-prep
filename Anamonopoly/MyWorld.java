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
    private GreenfootImage myImage;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        myImage = new GreenfootImage(40, 80);
        
        myImage.drawString
        
        
        
        
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Space1 space1 = new Space1();
        addObject(space1,104,294);
        Space2 space2 = new Space2();
        addObject(space2,278,301);
        Space3 space3 = new Space3();
        addObject(space3,463,287);
        Infotile infotile = new Infotile(myImage);
        addObject(infotile,184,145);
    }
}
