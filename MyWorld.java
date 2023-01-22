import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public Bar player1;
    public Bar player2;
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
        
        GameManager.Score.Reset();
        DrawScore();
    }
    
    public void act()
    {
        DrawScore();
    }
    
    private void DrawScore()
    {
        showText("Score P1: " + GameManager.Score.player1, 100, 40);
        showText("Score P2: " + GameManager.Score.player2, 500, 40);
    }
    
    private void prepare()
    {
        player1 = new Bar(PlayerType.PLAYER_1);
        addObject(player1,70,200);
        player2 = new Bar(PlayerType.PLAYER_2);
        addObject(player2,530,200);
        
        Ball ball = new Ball();
        addObject(ball,300,200);
    }
}
