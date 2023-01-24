package day5;

public class PurchaseDetails implements Tax {
    String purchaseID;
    String paymentType;
    int taxPercent;
    public PurchaseDetails(String purchaseID, String paymentType) {
        this.purchaseID = purchaseID;
        this.paymentType = paymentType;
        //Default value
        this.taxPercent = 2;
    }
    public String getPurchaseID() {
        return purchaseID;
    }
    public void setPurchaseID(String purchaseID) {
        this.purchaseID = purchaseID;
    }
    public String getPaymentType() {
        return paymentType;
    }
    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }
    public int getTaxPercent() {
        return taxPercent;
    }
    public void setTaxPercent(int taxPercent) {
        this.taxPercent = taxPercent;
    }
    @Override
    public double calcTax(int amt) {
        if (paymentType == "Credit"){
            setTaxPercent(2);
        }
        else if(paymentType == "Debit"){
            setTaxPercent(3);
        }
        return(amt + (amt*getTaxPercent())/100 );
        
     }
    
}
