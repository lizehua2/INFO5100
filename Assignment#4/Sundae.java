class Sundae extends IceCream{
    private String toppingName;
    private int toppingPrice;

    public Sundae(String name, int icprice, String tpName, int tpPrice){
        super(name,icprice);
        toppingName = tpName;
        toppingPrice = tpPrice;
    }

    public int getToppingPrice(){

        return toppingPrice;
    }

    public void setToppingPrice(int tpPrice) {

        toppingPrice = tpPrice;
    }
    public String getToppingName(){

        return toppingName;
    }

    public void setToppingName(String tpName) {

        toppingName = tpName;
    }

    public int getCost(){
        return super.getCost() + getToppingPrice();
    }
    public String toString(){
        return "";
    }


}
