public class Dog extends Pet implements Boardable{
    private String size;
    private String species;
    int StartMon, StartDay, StartYear;
    int EndMon, EndDay, EndYear;
    public Dog(String petName, String ownerName, String color, String size){
        super(petName,ownerName,color);
        this.size = size;
    }
    public String getSize(){
        return this.size;
    }
    public String toString(){
        return "species: "+this.species + "\nPet name: "+getPetName()+"\nOwner's name: "+ getOwnerName()+"\nColor: "+ getColor()+"\nSex: " + getSex()+"\nSize: "+getSize();
    }
    public void setBoardStart(int month, int day, int year) {
        StartMon = month;
        StartDay = day;
        StartYear = year;
    }

    @Override
    public void setBoardEnd(int month, int day, int year) {
        EndMon = month;
        EndDay = day;
        EndYear = year;
    }
    public boolean boarding(int month, int day, int year){
        return month <= EndMon && month>=StartMon && day>=StartDay && day <= EndDay && year >= StartYear && year <= EndYear;
    }
    public static void main(String[] args) {
        Dog d = new Dog("Spot", "Susan", "white", "medium");
        d.species = "Dog";
        d.setSex(2);
        d.setBoardStart(1, 6, 2010);
        d.setBoardEnd(7, 12, 2020);
        boolean date = d.boarding(3, 11, 2020);
        System.out.println(d);
        if (date == true)
            System.out.println("Date is valid");
        else
            System.out.println("Date is invalid");
    }

}
