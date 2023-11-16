import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    int time = 0;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 1000x700 cells with a cell size of 1x1 pixels.
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
        addObject(new Serra(), 500, 400);
        addObject(new Coins(), Greenfoot.getRandomNumber(1000), Greenfoot.getRandomNumber(800));
        addObject(new Coins(), Greenfoot.getRandomNumber(1000), Greenfoot.getRandomNumber(800));
        addObject(new Coins(), Greenfoot.getRandomNumber(1000), Greenfoot.getRandomNumber(800));
        addObject(new Coins(), Greenfoot.getRandomNumber(1000), Greenfoot.getRandomNumber(800));
        addObject(new Coins(), Greenfoot.getRandomNumber(1000), Greenfoot.getRandomNumber(800));
    }

    public void act(){
        Greenfoot.playSound("DiscRoomOST.mp3");
        time ++;
        if (time % 60 == 0){
            addObject(new Serra(), Greenfoot.getRandomNumber(1000), Greenfoot.getRandomNumber(800));
        }
    }
}