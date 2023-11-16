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
        Andar();
        TocarCoins();
        Perdeu();
    }

    public void Andar(){
        if (Greenfoot.isKeyDown("left")){
            setImage("ProtagonistaEsquerda.png");
            setLocation(getX() - 10, getY());
        } 
        if (Greenfoot.isKeyDown("right")){
            setImage("ProtagonistaDireita.png");
            setLocation(getX() + 10, getY());
        } 
        if (Greenfoot.isKeyDown("up")){
            setLocation(getX(), getY() - 10);
        } 
        if (Greenfoot.isKeyDown("down")){
            setLocation(getX(), getY() + 10);
        }
    }

    public boolean TocarSerra(){
        if (isTouching(Serra.class)){
            return true;
        } else {
            return false;
        }
    }
    
    int cont = 1;
    public boolean TocarCoins(){
        if (getOneIntersectingObject(Coins.class) != null){
            getWorld().removeObject(getOneIntersectingObject(Coins.class));
            Greenfoot.playSound("collectcoin.mp3");
            cont = cont + 1;
            }
        if(cont == 5){
            return true;
        } else {
            return false;
        }
    }
    
    public void Ganhou(){
        if (TocarCoins() == true){
            getWorld().addObject(new VocePerdeu(), 500, 400);
            getWorld().showText("MEUS PARABÉNS VOCÊ VENCEU", 500, 600);
            Greenfoot.playSound("gameover.mp3");
            Greenfoot.stop(); 
        }
    }
    
    public void Perdeu(){
        if (TocarSerra() == true){
            getWorld().addObject(new VocePerdeu(), 500, 400);
            getWorld().showText("GAME OVER - VOCÊ PERDEU!!", 500, 600);
            Greenfoot.playSound("gameover.mp3");
            Greenfoot.stop(); 
        }
    }
}