import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Protagonista here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Protagonista extends Actor
{
    /**
     * Act - do whatever the Protagonista wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if (Greenfoot.isKeyDown("left")){
            setImage("ProtagonistaEsquerda.png");
            move(-10);
        } if (Greenfoot.isKeyDown("right")){
            setImage("ProtagonistaDireita.png");
            move(10);
        } if (Greenfoot.isKeyDown("up")){
            turn(-5);
        } if (Greenfoot.isKeyDown("down")){
            turn(5);
        } if (Greenfoot.isKeyDown("shift")){
            move(15);
        } 
        
        Tocar();
    }
    
    public void Tocar(){
        if (isTouching(Serra.class)){
            getWorld().showText("GAME OVER - VOCÊ PERDEU!!", 500, 600);
            Greenfoot.stop();        
        }
    }
}
