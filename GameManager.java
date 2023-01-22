/**
 * Write a description of class GameManager here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameManager  
{
    public static class Score
    {
        public static int player1;
        public static int player2;
        
        public static void Reset()
        {
            player1 = player2 = 0;
        }
        
        public static void AddScore(PlayerType type)
        {
            if (type == PlayerType.PLAYER_1)
            {
                player1 ++;
            } 
            else if (type == PlayerType.PLAYER_2)
            {
                player2++;
            }
        }
    }
}
