public class TokenPass {

    private int[] board;
    private int currentPlayer;
    private int token;
    int playerCount;

    public TokenPass(int playerCount)
    {
        this.playerCount=playerCount;
        this.board= new int[playerCount];
        for(int x=0;x<board.length;x++)
        {
            board[x]=(int)((Math.random()*10)+1);
        }
        this.currentPlayer=(int)(Math.random()*playerCount);
    }

    public void distributeCurrentPlayerTokens()
    {
        int tokens = board[currentPlayer];
        board[currentPlayer]=0;
        for(int x = (currentPlayer+1)%playerCount;tokens!=0;x++)
        {
            tokens--;

        }

    }


    public int gameOver()
    {
        int x;
        int low=-1;
        for(x = 0;x<board.length;x++)
        {
            if(board[x]==0)
            {
                low= x;
            }
        }
        return low;

    }

    public void nextPlayer()
    {
        currentPlayer=(currentPlayer+1)%playerCount;
    }

    public void printBoard()
    {
        String line="";
        for(int x = 0;x<board.length;x++)
        {
            line = line + "Player "+x+":"+ board[x]+" ";
        }
        System.out.println(line);
        System.out.println("Current Player: "+currentPlayer);
    }


}