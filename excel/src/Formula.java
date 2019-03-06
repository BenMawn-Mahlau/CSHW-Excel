public class Formula implements IData{
    private String operation;
    public IData mul(IData x,IData y){
        return x * y;
    }
    public IData mod(IData x, IData y){
        return x % y
    }


}