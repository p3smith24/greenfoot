import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class critter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Critter extends Actor
{
    /**
     * Act - do whatever the critter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int count = 0;
    private int moveNum = 10;
    private int turnAmount = 0;

    public Critter(int turnAmount) {
        this.count = 0;
        this.moveNum = 10;
        this.turnAmount = turnAmount;
        this.turn(turnAmount);
    }
    
    public void act()
    {
        //System.out.println("Pos:" + this.getX() + ", " + this.getY());
        
        if (this.isAtEdge()) 
        {
            this.turn(180);
            moveNum++;
            
            //System.out.println("Speed: " + moveNum);
        }
        
        this.move(moveNum);
        
        if (moveNum >= 50) 
        {
            this.getWorld().removeObject(this);
            //System.out.println("Object Removed");
        }
        
    }
}
