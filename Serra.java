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
        move(10);
        if(Greenfoot.getRandomNumber(10) >= 5 ){
            turn(Greenfoot.getRandomNumber(90)-45);
        }
        if(isAtEdge()){
            turn(45);
        }
    }

    public Serra(){
        int size = 170;
        getImage().scale(getImage().getWidth() - size, getImage().getHeight() - size);
    }
}
