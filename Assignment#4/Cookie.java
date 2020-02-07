class Cookie extends DessertItem {
    protected int number;
    protected double pricePerDozen;

    public Cookie(String name, int n, double pd) {
        super(name);
        number = n;
        pricePerDozen = pd;
    }

    public int getnumber() {

        return number;
    }

    public double getpricePerDozen() {

        return pricePerDozen;
    }

    public void setnumber(int n) {

        number = n;
    }

    public void setpricePerDozen(double pd) {

        pricePerDozen = pd;
    }

    public int getCost() {
        return (int) (number * pricePerDozen / 12);
    }

    public String toString() {
        StringBuffer s = new StringBuffer();
        s.append(getnumber()+" "+"@"+" "+getpricePerDozen()/100+" "+"/dz");
        s.append('\n');
        return s.toString();
    }
}
