import java.sql.SQLOutput;

abstract class MoodyObject{
    private String mood;
    protected abstract String getMood();
    //return mood;

    protected abstract void expressFeelings();

    public void queryMood() {
        if(getMood() == "Happy"){
            System.out.println("I feel happy today!");
        }
        if(getMood() == "Sad"){
            System.out.println("I feel sad today!");
        }

    }
}


class SadObject extends MoodyObject {
    String mood = "Sad";

    protected String getMood() {

        return mood;
    }

    public void expressFeelings() {
        System.out.println("'Wah''boo boo''weep''sob''weep'");
    }

    public String toString() {
        return "Observation:Subject cries a lot";

    }

}

    class HappyObject extends MoodyObject{
        String mood = "Happy";

        protected String getMood() {

            return mood;
        }

        public void expressFeelings() {
            System.out.println("'hehehe...hahahah...HAHAHAHAHA!!!'");
        }

        public String toString() {
            return "Observation:Subject laughs a lot";
        }
    }
        class PsychiatristObject {
            public void examine(MoodyObject moodyObject) {
                System.out.println("How are you feeling today?");
                moodyObject.queryMood();

            }

            public void observe(MoodyObject moodyObject) {
                moodyObject.expressFeelings();
                System.out.println(moodyObject.toString());

            }
        }

public class Q2 {
    public static void main(String[] args) {
        MoodyObject m = new SadObject();
        PsychiatristObject p = new PsychiatristObject();
        p.examine(m);
        p.observe(m);

        MoodyObject u = new HappyObject();
        PsychiatristObject x = new PsychiatristObject();
        x.examine(u);
        x.observe(u);
    }
}
