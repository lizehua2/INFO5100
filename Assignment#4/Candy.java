class Candy extends DessertItem{
    protected double weight;
    protected double pricePerPound;

    public Candy(String name, double w, double pp){
        super(name);
        weight = w;
        pricePerPound = pp;
    }
    public double getweight(){

        return weight;
    }
    public double getpricePerPound(){

        return pricePerPound;
    }

    public void setweight(double w){

        weight = w;
    }
    public void setpricePerPound(double pp){

        pricePerPound = pp;
    }
    public int getCost(){
        return (int)(weight*pricePerPound);

    }
    public String toString(){
        StringBuffer s = new StringBuffer();
            s.append(getweight()+"lb"+" "+"@"+" "+getpricePerPound()/100+" "+"/lb");
            s.append('\n');
        return s.toString();
    }

}
