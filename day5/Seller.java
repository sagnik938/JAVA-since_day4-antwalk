package day5;

public class Seller implements Tax{
    String location;
    int taxPercent;
    public Seller(String location) {
        this.location = location;
        // default value
        this.taxPercent = 18;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public int getTaxPercent() {
        return taxPercent;
    }
    public void setTaxPercent(int taxPercent) {
        this.taxPercent = taxPercent;
    }
    @Override
    public double calcTax(int amt) {
        if (location == "Asia"){
            setTaxPercent(10);
        }
        else if(location == "Europe"){
            setTaxPercent(18);
        }
        return(amt + (amt*getTaxPercent())/100 );
        
    }
    
    
}
