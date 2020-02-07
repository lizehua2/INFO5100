import java.text.DecimalFormat;
class DessertShoppe{
    protected double TaxRate;
    protected String NameOfStore;
    public DessertShoppe(double r, String s){
        TaxRate = r;
        NameOfStore = s;
    }
    public double getTaxRate(){
        return TaxRate;
    }
    public String getNameOfStore(){
        return NameOfStore;
    }

    public void setTaxRate(double r) {
        TaxRate = r;
    }
    public void setNameOfStore(String s){
        NameOfStore = s;
    }
    public String cents2dollarsAndCentsmethod(int m){
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        double dollars = m * 0.01;
        String numberAsString = decimalFormat.format(dollars);
        return numberAsString;
    }
}
