package Model;


public class SaleSeller extends Seller {
    protected int sale;
    private double commission;

    public double getCommission() {
        return commission;
    }
    
    public int getSale() {
        return sale;
    }  

    public SaleSeller(String name, String id, int sale) {
        super(name, id);
        this.sale = sale;
        this.commission = 0.0;
    }   

    public Double CalculateCommission(){
        if(sale>=1000){
            commission=(sale*3.5)/100;
        }
        if(sale>=1500){
            commission=(sale*5)/100;
        }
        if(sale>=2000){
            commission=(sale*6.5)/100;
        }
        if(sale>=2500){
            commission=(sale*8)/100;
        }
        if(sale>=3000){
            commission=(sale*10)/100;
        }

        return commission;
    }
}
