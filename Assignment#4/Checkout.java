import java.util.Vector;
public class Checkout {
    private Vector<DessertItem>list;
    DessertShoppe shop = new DessertShoppe(6.5,"M & M Dessert Shoppe\n");
    public Checkout() {
        list = new Vector<DessertItem>();
    }
    public int numberOfItems(){

        return list.size();
    }
    public void enterItem(DessertItem item){
        list.addElement(item);

    }
    public void clear(){
        list.clear();
    }
    public int totalCost(){
        int total = 0;
        for(DessertItem item :list){
            total += item.getCost();
        }
        return total;

    }
    public int totalTax(){
        return (int) java.lang.Math.round((totalCost() * shop.getTaxRate()/100));

    }
    public java.lang.String toString(){
        StringBuffer s = new StringBuffer();
        s.append("M & M Dessert Shoppe\n");
        s.append("----------------------\n");
        for (DessertItem item : list) {
            s.append(item.toString());
            s.append(String.format("%-30s %-40s", item.getName(), shop.cents2dollarsAndCentsmethod(item.getCost())));
            s.append('\n');
        }
        s.append(String.format("%-31s %-42s", "Tax: ", shop.cents2dollarsAndCentsmethod(totalTax())));
        s.append("\n");
        s.append(String.format("%-29s %-42s", "Total Cost: ", shop.cents2dollarsAndCentsmethod(totalCost())));
        return s.toString();

    }

}
