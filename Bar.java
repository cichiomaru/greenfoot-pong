import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bar extends Actor implements IMoveable
{
    private int xDirection;
    private int yDirection;
    
    private int speed = 10;
    private PlayerType type;
    
    public Bar(PlayerType type)
    {
        this.type = type;
        
        getImage().scale(10, 70);
    }
    
    public void act()
    {
        InputHandler();
        UpdatePosition();
    }
    
    public void InputHandler()
    {
        xDirection = 0;
        yDirection = 0;
        
        if (type == PlayerType.PLAYER_1)
        {
            if (Greenfoot.isKeyDown("w"))   yDirection = -1 * speed;
            if (Greenfoot.isKeyDown("s"))   yDirection = 1 * speed;
        }
        else if (type == PlayerType.PLAYER_2)
        {
            if (Greenfoot.isKeyDown("up"))   yDirection = -1 * speed;
            if (Greenfoot.isKeyDown("down"))   yDirection = 1 * speed;
        }
    }
    
    public void SetDirection(int x, int y)
    {
        xDirection = x;
        yDirection = y;
    }
    
    public void UpdatePosition()
    {
        setLocation(getX() + xDirection, getY() + yDirection);
    }
}
