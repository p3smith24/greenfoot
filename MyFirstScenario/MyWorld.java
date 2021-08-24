import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    
    Critter crit = new Critter(0);
    private int stepCount = 0;
    private int turnCount = 0;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        this.addObject(crit, 300, 200);
        
    }
    
    public void act() {
        this.stepCount ++;
        if (this.stepCount >= 200)
        {
            //this.turnCount ++;
            this.addObject(new Critter(turnCount), 300, 200);
            this.stepCount = 0;
        }
        if (this.turnCount >= 360)
        {
            this.turnCount = 0;
        }
    }

}
