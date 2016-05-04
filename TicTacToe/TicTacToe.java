

/**
 * Write a description of class TicTacToe here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TicTacToe
{
    /** description of instance variable x (add comment for each instance variable) */
    private int width = 3;
    private int height = 3;
    static final char EMPTY = ' ';
    static final char PLAYER_X = 'x';
    static final char PLAYER_O = 'o';
    private boolean[][] game;
    private int turn = 0;
    /**
     * Default constructor for objects of class TicTacToe
     */
    public TicTacToe()
    {
        this.game = new boolean[width][height];
        for(int i = 0; i< this.game.length;i++)
        {
            for(int j = 0; j < this.game[0].length; j++)
            {
                // initializes game to null
                //this.game[i][j];
            }
        }
    }
    
    public static void main(String[] args)
    {
        TicTacToe game = new TicTacToe();
        
        
    }
    
    public boolean isWon()
    {
        for(int i = 0; i <game.length; i++)
        {
            if(this.game[i][0] == this.game[i][1] == this.game[i][2])
            {
                return true;
            }
            if(this.game[0][i] == this.game[1][i] == this.game[2][i])
            {
                return true;
            }
            if(this.game[0][0] == this.game[1][1] == this.game[2][2])
            {
                return true;
            }
            if(this.game[2][0] == this.game[1][1] == this.game[0][2])
            {
                return true;
            }
            //for(int j = 0; j <game[].length; j++)
            //{
            //    if (this.game[i][j])
            //}
            else
            {
                return false;
            }
        }
        return false;
    }
    
    public boolean isBoardFull() 
    {
        boolean isFull = true;
        for (int i = 0; i < game.length; i++) 
        {
            for (int j = 0; j < game[0].length; j++) 
            {
                //if (game[i][j] == null) 
                {
                    isFull = false;
                }
            }
        }       
        return isFull;
    }

    
    public void displayBoard() 
    {
        System.out.println("  0  " + toChar(0,0) + "|" + toChar(0,1) + "|" + toChar(0,2));
        System.out.println("    --+-+--");
        System.out.println("  1  " + toChar(1,0) + "|" + toChar(1,1) + "|" + toChar(1,2));
        System.out.println("    --+-+--");
        System.out.println("  2  " + toChar(2,0) + "|" + toChar(2,1) + "|" + toChar(2,2));
        System.out.println("     0 1 2 ");
    }
    public char toChar(int xPos, int yPos)
    {
        /*if(this.game[xPos][yPos] == null)
        {
            return EMPTY;
        }
        if(this.game[xPos][yPos] == true)
        {
            return PLAYER_X;
        }
        if(this.game[xPos][yPos] == false)
        {
            return PLAYER_O;
        }
        */
       return 'c';
    }
    
    public void makeMove(int xPos, int yPos, int playerNumber)
    {
        //if(playerNumber = 1) // player 1 is true
        {
            this.game[xPos][yPos]=true;
        }
        //else
        {
            this.game[xPos][yPos]=false;
        }
    }
    //public int[][] getMoves( boolean[][] game)
    {
        int xpos = 0;
        int ypos = 0;
        int[][] moves = new int[game.length*game[0].length][2];
        for(int i = 0; i < game.length; i++)
        {
            for (int j = 0; j < game[i].length; j++)
            {
                //if (game[i][j] == null)
                {
                    //moves[x][y] = i;
                    //moves[x][y+1] = j;
                    //x++;
                    //y=0;
                }
            }
        }
    }
    //public int Minimax(boolean[][] game, int depth, int alpha, int beta)
    {
        for(int i = 0; i < game.length; i++)
        {
            for (int j = 0; j < game[i].length; j++)
            {
                
            }
        }
        int bestScore = 0;
        //if(player == mySeed);
        
        
        
    }
    
    public boolean[][] getGameArray()
    {
        return this.game;
    }

}
