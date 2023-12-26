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
        showStatus();
        testEndGame();
        
        //animateWithDelay();
    }
    
    public void robotMovement(){
        if(Greenfoot.isKeyDown("W")){
            setLocation(getX(),getY()-3);
            animate();
        }
        else if(Greenfoot.isKeyDown("A")){
            move(-3);
            animate();
        }
        else if(Greenfoot.isKeyDown("S")){
            setLocation(getX(),getY()+3);
            animate();
        }
        else if(Greenfoot.isKeyDown("D")){
            move(3);
            animate();
        }
    }
    
    public void detectBlockCollision(){
        if(isTouching(block.class)){
            Greenfoot.playSound("hurt.wav");
            setLocation(48, 50);
            removeLife();
        }
    }
    
    public void detectWallCollision(){
        if(isTouching(wall.class)){
            Greenfoot.playSound("hurt.wav");
            setLocation(48, 50);
            removeLife();
        }
    }
    
    // ini masih salah (skrng sudah benar)
    public void detectHome(){
        if(isTouching(Home.class)){
            if (pizzaEaten >= 5){
            Greenfoot.playSound("yipee.wav");
            setLocation(48, 50);
            pizzaEaten = 0;
            increaseScore();
            Greenfoot.stop();
            }
            else {
            setLocation(48, 50);
            }
        }
        
    }
    
    int pizzaEaten = 0;
    public void eatPizza(){
        if(isTouching(Pizza.class)){
            Greenfoot.playSound("eat.wav");
            removeTouching(Pizza.class);
            pizzaEaten++;
            //increaseScore();
        }
    }
    
    private GreenfootImage robotimage1;
    private GreenfootImage robotimage2;    
    private GreenfootImage gameover;
    
    public Robot(){
        robotimage1 = new GreenfootImage("man01.png");
        robotimage2 = new GreenfootImage("man02.png");
        
        gameover = new GreenfootImage("gameover.png");
    }
    
    /*private int animationCounter = 0 ;
    public void animateWithDelay(){
        if (animationCounter >= 5) {
            animate();  // Ganti gambar animasi
            animationCounter = 0;  // Reset penghitung
        } 
        else{
            animationCounter++;  // Tambahkan penghitung
        }
    }*/

    public void animate(){
        if(getImage()==robotimage1){
            setImage(robotimage2);
        }
        else{
            setImage(robotimage1);
        }
        
    }
    
    int lives = 3;
    public void removeLife(){
        detectBlockCollision();
        detectWallCollision();
        lives--;
    }
    
    //private GreenfootImage gameover;
    public void testEndGame(){
        if(lives <= 0){
            setImage(gameover);
            Greenfoot.stop();
        }
    }
    
    int score = 0;
    public void increaseScore(){
        score++;
    }
    
    public void showStatus(){
        RobotWorld world = (RobotWorld) getWorld();
        String status = "Lives: " + lives + " \nScore: " + score;
        world.showText(status, 71, 554);
    }
}
