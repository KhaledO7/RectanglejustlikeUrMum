public class Game
{
    private int players;
    private int score;
    private boolean gameOver;

    public Game()
    {
        players = 1;
        score = 0;
        gameOver = false;
    }

    public int getPlayers()
    {
        return players;
    }

    /** Add the getScore() "getter" method here */
    /* to be completed in part (a) */

    /** Add the addPlayer() method here */
    /* to be completed in part (b) */

    /** Add the increaseScore(int increase) method here */
    /* to be completed in part (c) */

    /** Add the averageScorePerPlayer() method here */
    /* to be completed in part (d) */

    public void end()
    {
        gameOver = true;
    }
}
