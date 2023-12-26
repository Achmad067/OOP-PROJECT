import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class block here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class block extends Actor
{
    /**
     * Act - do whatever the block wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int turnSpeed;
    public void act()
    {
        // Add your action code here.
        //turn(turnspeed);
        int x = getRotation()+1;
        if(x == 360){
            x=0;
        }
        setRotation(x);
        turn(this.turnSpeed);
    }
    
    public void Block(int maxTurnSpeed)
    {
        this.turnSpeed = Greenfoot.getRandomNumber(2* maxTurnSpeed) - (maxTurnSpeed);
    }
    
    /*int turnspeed;
    public void Block(int maxturnspeed){
        int turnspeed = 0;
        if (turnspeed == 0){
            turnspeed = 1;
        } else {
            turnspeed = 0;
        }
    }*/
}
