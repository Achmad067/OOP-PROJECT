import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Robot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Robot extends Actor
{
    /**
     * Act - do whatever the Robot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        robotMovement();
        detectBlockCollision(); 
        detectWallCollision();
        detectHome();
        eatPizza();
    }
    
    public void robotMovement(){
        if(Greenfoot.isKeyDown("W")){
            setLocation(getX(),getY()-3);
        }
        else if(Greenfoot.isKeyDown("A")){
            move(-3);
        }
        else if(Greenfoot.isKeyDown("S")){
            setLocation(getX(),getY()+3);
        }
        else if(Greenfoot.isKeyDown("D")){
            move(3);
        }
        
    }
    
    public void detectBlockCollision(){
        if(isTouching(block.class)){
            Greenfoot.playSound("hurt.wav");
            setLocation(48, 50);
        }
    }
    
    public void detectWallCollision(){
        if(isTouching(wall.class)){
            Greenfoot.playSound("hurt.wav");
            setLocation(48, 50);
        }
    }
    
    public void detectHome(){
        if(isTouching(Home.class)){
            Greenfoot.playSound("yipee.wav");
            setLocation(48, 50);
        }
    }
    
    public void eatPizza(){
        if(isTouching(Pizza.class)){
            Greenfoot.playSound("eat.wav");
            removeTouching(Pizza.class);
        }
    }
}
