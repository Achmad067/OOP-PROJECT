import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RobotWorld here.
 * 
 * @author (Ibad) 
 * @version (a version number or a date)
 */
public class RobotWorld extends World
{
    int currentMaxTurnSpeed = 2;
    int currentLevel = 1;
    
    /**
     * Constructor for objects of class RobotWorld.
     * 
     */
    public RobotWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Robot robot = new Robot();
        addObject(robot,48,50);
        robot.setLocation(48,50);

        block block = new block();
        addObject(new block(),427,145);
        //addObject(new block(2),427,145);

        wall wall = new wall();
        addObject(wall, 48,147);

        wall wall2 = new wall();
        addObject(wall2, 52,147);

        wall wall3 = new wall();
        addObject(wall3, 159,147);

        wall wall4 = new wall();
        addObject(wall4, 266,147);

        wall wall5 = new wall();
        addObject(wall5, 587,147);

        wall wall6 = new wall();
        addObject(wall6, 692,147);

        wall wall7 = new wall();
        addObject(wall7, 791,147);

        Home home = new Home();
        addObject(home, 751, 552);

        ScorePanel scorePanel = new ScorePanel();
        addObject(scorePanel, 71, 554);

        Pizza pizza = new Pizza();
        addObject(pizza, 720, 46);

        Pizza pizza2 = new Pizza();
        addObject(pizza2, 433, 38);

        Pizza pizza3 = new Pizza();
        addObject(pizza3, 183, 302);

        Pizza pizza4 = new Pizza();
        addObject(pizza4, 682, 312);

        Pizza pizza5 = new Pizza();
        addObject(pizza5, 417, 537);

        wall wall8 = new wall();
        addObject(wall8,430,333);

        block block2 = new block();
        addObject(block2,164,457);

        wall wall9 = new wall();
        addObject(wall9,321,544);

        block block3 = new block();
        addObject(block3,611,455);

        wall wall10 = new wall();
        addObject(wall10,746,254);

        wall wall11 = new wall();
        addObject(wall11,744,360);

        wall wall12 = new wall();
        addObject(wall12,265,255);
        pizza4.setLocation(609,306);
        wall8.setLocation(378,372);
        wall9.setLocation(251,555);
        pizza5.setLocation(560,544);
        wall8.setLocation(365,572);
        pizza3.setLocation(33,251);
        block2.setLocation(128,394);
        wall wall13 = new wall();
        addObject(wall13,374,363);
        pizza5.setLocation(644,543);
        block3.setLocation(560,462);
        block3.setLocation(600,500);
        pizza5.setLocation(568,553);
        wall wall14 = new wall();
        addObject(wall14,481,363);
        pizza4.setLocation(615,263);
        wall8.setLocation(365,552);
        removeObject(wall8);
        //wall wall8 = new wall();
        addObject(wall8,359,555);
    }
    
    public void setUpLevel(){
        if(currentLevel == 2){
            currentMaxTurnSpeed = +1;
        }
        else if (currentLevel == 3){
            currentMaxTurnSpeed = +1;   
        }
        increaseLevel();
    }
    public void increaseLevel()
    {
        currentLevel++;
    }
}
