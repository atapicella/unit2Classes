public class VendingMachine
{
    private int tokens = 0;
    
    private int cans = 5;

    
    public VendingMachine()
    {
    }
    
    public void insertToken()
    {
        this.tokens += 1;
        this.cans -= 1;
    }
    
    
    public int getTokens()
    {
        return this.tokens;
    }
    
    public int getCans()
    {
        return this.cans;
    }
    
    public void addCans(int cans)
    {
        this.cans += cans;
    }

}
