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
    }
    
    public void robotMovement(){
        
    }
    
    public void detectBlockCollision(){
        if(isTouching(block.class)){
            setLocation(48, 50);
        }
    }
    
    public void detectWallCollision(){
        if(isTouching(wall.class)){
            setLocation(48, 50);
        }
    }
}
