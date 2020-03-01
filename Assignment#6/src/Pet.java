public class Pet {
    private String petName;
    private String ownerName;
    private String color;
    protected int Sex;
    private static final int Male = 0;
    private  static final int Female =1;
    private  static  final int Sprayed = 2;
    private  static final int Neutered = 3;
    public Pet(String petName, String ownerName, String color){
        this.petName = petName;
        this.ownerName = ownerName;
        this.color = color;
    }
    public String getPetName(){
        return this.petName;
    }
    public String getOwnerName(){
        return this.ownerName;
    }
    public String getColor(){
        return this.color;
    }
    public void setSex(int sexid){
        this.Sex = sexid;
    }
    public String getSex() {
        if(this.Sex == 0){
            return "Male";
        }
        if(this.Sex == 1){
            return "Female";
        }
        if(this.Sex == 2){
            return "Sprayed";
        }
        if(this.Sex == 3){
            return "Neutered";
        }
        return " No sex has been entered";
    }
    public String toString(){
        return "Pet name: "+getPetName()+"\nOwner's name: "+ getOwnerName()+"\nColor: "+ getColor()+"\nGender: " + getSex();
    }

    public static void main(String[] args) {
        Pet p = new Pet("Spot","Mary","Black and White");
        p.setSex(0);
        System.out.println(p);
    }

}
