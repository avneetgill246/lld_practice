
import java.util.ArrayList;
import java.util.List;

public class Board{
    private List<List<Spot>> spots;

    public Board() {
        this.spots=new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            List<Spot> row=new ArrayList<>();
         for (int j = 0; j < 3; j++) {
             row.add(new Spot());
         }   
         this.spots.add(row);
        }
    }
    public boolean setVal(int x, int y,String value){
        return this.spots.get(x-1).get(y-1).setVal(value);
      
    }
    public void resetBoard(){
        this.spots=new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            List<Spot> row=new ArrayList<>();
         for (int j = 0; j < 3; j++) {
             row.add(new Spot());
         }   
         this.spots.add(row);
        }
    }
    public void printBoard(){
        for(List<Spot> sps:spots){
           for(Spot sp:sps){
                System.out.print(sp.getVal() + " ");
           }
           System.out.println();
        }
    }
}

