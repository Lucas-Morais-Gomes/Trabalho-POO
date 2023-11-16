import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Serra here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Serra extends Actor
{
    /**
     * Act - do whatever the Serra wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        move(10);
        if(Greenfoot.getRandomNumber(10) >= 5 ){
            turn(Greenfoot.getRandomNumber(90)-45);
            }
    }
}
