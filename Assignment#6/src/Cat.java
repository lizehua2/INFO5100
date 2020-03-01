public class Cat extends Pet implements Boardable{
    private String hairLength;
    private String species;
    int StartMon, StartDay, StartYear;
    int EndMon, EndDay, EndYear;
    public Cat(String petName, String ownerName, String color, String hairLength){
        super(petName,ownerName,color);
        this.hairLength = hairLength;
    }
    public String getHairLength(){
        return this.hairLength;
    }
    public String toString(){
        return "species: "+this.species + "\nPet name: "+getPetName()+"\nOwner's name: "+ getOwnerName()+"\nColor: "+ getColor()+"\nGender: " + getSex()+"\nHair: " + getHairLength();
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
        Cat c = new Cat("Tom", "Bob", "black", "short");
        c.species = "Cat";
        c.setSex(2);
        c.setBoardStart(1, 6, 2010);
        c.setBoardEnd(7, 12, 2020);
        boolean date = c.boarding(3, 11, 2020);
        System.out.println(c);
        if (date == true)
            System.out.println("Date is valid");
        else
            System.out.println("Date is invalid");
    }
}
