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
        // Create a new world with 1000x700 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1);
        getBackground();
        addObject(new Protagonista(), 68, 408);
        addObject(new Serra(), 491, 409);
        addObject(new Serra(), Greenfoot.getRandomNumber(1001), Greenfoot.getRandomNumber(801));
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}
