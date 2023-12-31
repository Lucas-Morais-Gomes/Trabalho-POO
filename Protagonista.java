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
        Ganhou();
        Perdeu();
        SalaPremio();
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
    
    int cont = 0;
    public boolean TocarCoins(){
        if (getOneIntersectingObject(Coins.class) != null){
            getWorld().removeObject(getOneIntersectingObject(Coins.class));
            Greenfoot.playSound("collectcoin.mp3");
            cont ++;
            
            Counter counter = (Counter) getWorld().getObjects(Counter.class).get(0);
            counter.add(1);
            }
        if(cont == 5){
            return true;
        } else {
            return false;
        }
    }
    public void SalaPremio(){
        if(TocarCoins() == true){
            Greenfoot.setWorld(new MyWorld2());
        }
    }
    public boolean TocarPremio(){
        if(isTouching(premio.class)){
            return true;
        } else{
            return false;
        }
    }
    
    public void Ganhou(){
        if (TocarPremio() == true){
            getWorld().addObject(new VoceVenceu(), 500, 400);
            Greenfoot.playSound("vencedor.mp3");
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