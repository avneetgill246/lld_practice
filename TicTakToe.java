
import java.util.ArrayList;
import java.util.List;



public class TicTakToe {
    private Board board;
    private List<Player> players;
    private Player lastTurn;

    public void startGame(Player A,Player B){
        this.board=new Board();
        this.players.add(A);
        this.players.add(B);

    }

    public void resetGame(Player A,Player B){
        this.board.resetBoard();
        this.players=new ArrayList<>();
        this.players.add(A);
        this.players.add(B);
        this.lastTurn=null;
        
    }

    public boolean takeTurn(Player X,int x,int y){
        if(this.lastTurn !=null && this.lastTurn==X)return false;
        if(this.board.setVal(x, y, X.peice==PlayerPeice.CIRCLE?"O":"X")){
            checkResult();
        }else{
            return false;
        }
    }
}
