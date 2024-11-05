

public class Spot {
    private String val;
    
    Spot(){
        this.val="_";
    }
    Spot(String value){
        this.val=value;
    }

    public String getVal(){
        return val;
    }

    public boolean setVal(String value){
        if(val.equals("_")){
            this.val=value;
            return true;
        }
        return false;
    }
}
