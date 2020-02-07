class IceCream extends DessertItem{
    protected int iceCreamPrice;
    public IceCream(String name, int icprice){
        super(name);
        iceCreamPrice = icprice;
    }

    public int geticeCreamPrice(){

        return iceCreamPrice;
    }

    public void setIC(int icprice){

        iceCreamPrice = icprice;
    }
    public int getCost(){

        return iceCreamPrice;
    }
    public String toString(){
        return "";
    }
}

