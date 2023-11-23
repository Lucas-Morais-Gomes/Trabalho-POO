import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Coins here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Coins extends Actor
{
    GreenfootImage[] CoinAnima = new GreenfootImage[10];
    int animCont = 0;
    
    public Coins(){
        CoinsAnimations();
    }
    /**
     * Act - do whatever the Coins wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(CoinAnima[animCont++ % 10]);
    }
    public void CoinsAnimations(){
        for (int i = 0; i < 10; i++){
            String filename = "Gold" + i + ".png";
            CoinAnima[i] = new GreenfootImage(filename);
            }
    }
}
