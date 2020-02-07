abstract class DessertItem{
    protected java.lang.String name;
    public DessertItem(){

    }
    public DessertItem(java.lang.String name){
        this.name = name;

    }
    public final java.lang.String getName(){
        return name;

    }
    public abstract int getCost();
    public abstract java.lang.String toString();

}
