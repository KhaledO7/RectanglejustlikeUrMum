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
    public int getScore(){
        return score;
    }

    /** Add the addPlayer() method here */
    /* to be completed in part (b) */
    public int addPlayer(){
        players++;
        return players;
    }

    /** Add the increaseScore(int increase) method here */
    /* to be completed in part (c) */
    public int increaseScore(int oh){
        score += oh;
        return score;
    }

    /** Add the averageScorePerPlayer() method here */
    /* to be completed in part (d) */
    public int averageScorePerPlayer(){
        int avg = score/players;
        return avg;
    }

    public void end()
    {
        gameOver = true;
    }
}
