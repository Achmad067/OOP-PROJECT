import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RobotWorld here.
 * 
 * @author (Ibad) 
 * @version (a version number or a date)
 */
public class RobotWorld extends World
{

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
        addObject(block,427,145);
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
    }
}
