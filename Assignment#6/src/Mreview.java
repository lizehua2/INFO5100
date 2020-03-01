import java.util.*;
public class Mreview implements Comparable<Mreview>{
    private String title;
    private ArrayList<Integer> ratings;
    public Mreview(){
        this.title = "";
        this.ratings = new ArrayList<Integer>();
    }
    public Mreview(java.lang.String ttl){
        this.title = ttl;
        this.ratings = new ArrayList<Integer>();
    }
    public Mreview(java.lang.String ttl, int firstRating){
        this.title = ttl;
        this.ratings = new ArrayList<Integer>(1);
        ratings.add(firstRating);
    }
    public void addRating(int r){
        ratings.add(r);
    }
    public double aveRating(){
        Integer sum = 0;
        if(!ratings.isEmpty()){
            for (Integer n: ratings){
                sum+=n;
            }
            return sum.doubleValue()/ratings.size();
        }
        return sum;
    }
    public int compareTo (Mreview obj){
        return (this.title).compareTo(obj.title);
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        Mreview obj1 = (Mreview)obj;
        if(this.title!=obj1.title) {
            return false;
        }
        return true;
    }
    public java.lang.String getTitle(){
        return title;

    }
    public int numRatings(){
        return ratings.size();
    }
    @Override
    public java.lang.String toString(){
        return getTitle()+", average "+ aveRating() + " out of " + ratings.size()+ " ratings ";
    }

    public static void main(String[] args) {
        Mreview a = new Mreview("Avengers");
        a.addRating(4);
        a.addRating(3);
        a.addRating(4);
        a.addRating(5);
        System.out.println(a.toString());

        Mreview b = new Mreview("Batman");
        b.addRating(3);
        b.addRating(1);
        System.out.println(b.toString());

    }
}
