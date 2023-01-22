import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ball extends Actor implements IMoveable, ICollision
{
    private double xDirection;
    private double yDirection;
    
    public Ball()
    {
        SetRandomDirection();
    }
    
    public void SetRandomDirection()
    {
        double degree = Greenfoot.getRandomNumber(360);
        SetDirection ((int)(Math.cos(degree) * 10), (int)(Math.sin(degree) * 10));
    }
    
    public void act()
    {
        UpdatePosition();
        CollisionDetection();
        GoalDetection();
    }
    
    public void GoalDetection()
    {
        if (getX() <= 1)
        {
            GameManager.Score.AddScore(PlayerType.PLAYER_1);
            ResetPosition();
        } 
        else if (getX() >= getWorld().getWidth() - 1)
        {
            GameManager.Score.AddScore(PlayerType.PLAYER_2);
            ResetPosition();
        }
    }
    
    public void ResetPosition()
    {
        setLocation(getWorld().getWidth()/2, getWorld().getHeight()/2);
        SetRandomDirection();
    }
    
    public void SetDirection(int x, int y)
    {
        xDirection = x;
        yDirection = y;
    }
    
    public void UpdatePosition()
    {
        setLocation(getX() + (int)xDirection, getY() + (int)yDirection);
    }
    
    public void CollisionDetection()
    {
        /*
        if (getX() <= 1 || getX() >= getWorld().getWidth() - 1)
        {
            xDirection *= -1;
        }
        */
        if (getY() <= 1 || getY() >= getWorld().getHeight() - 1)
        {
            yDirection *= -1;
        }
        
        if (isTouching(Bar.class))
        {
            xDirection *= -1;
        }
    }
}
