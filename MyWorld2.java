import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld2 extends World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld2()
    {    
        super(1000, 800, 1);
        getBackground();
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        addObject(new Protagonista(), 68, 408);        
        premio premio = new premio();
        addObject(premio,545,509);
    }
    
    public void act(){
        //
    }
}