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
        addObject(new Serra(), 494, 410);
        Counter counter1 = new Counter();
        addObject(counter1,60,37);
        
    }
    
    int contSerra = 0;
    int timeSerra = 0;
    int contCoin = 0;
    int timeCoin = 0;
    public void act(){
        timeSerra ++;
        if (timeSerra % 60 == 0 && contSerra < 5){
            addObject(new Serra(), Greenfoot.getRandomNumber(870), Greenfoot.getRandomNumber(800));
            contSerra ++;
        }
        
        timeCoin ++;
        if (timeCoin % 60 == 0 && contCoin < 5){
            addObject(new Coins(), Greenfoot.getRandomNumber(1000), Greenfoot.getRandomNumber(800));
            contCoin ++;
        }
        
        
    }
}