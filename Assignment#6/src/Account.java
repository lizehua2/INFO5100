public class Account {
    protected String FirstName;
    protected String LastName;
    protected double CurBalance;
    public Account(String FirstName, String LastName, double CurBalance){
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.CurBalance = CurBalance;

    }
    public String getAcctType(){
        return this.getClass().getName();
    }
    public double DebitTransaction(double debitAmount){
        double newBalance = CurBalance - debitAmount;
        return newBalance;
    }
    public double CreditTransaction(double creditAmount){
        double newBalance1 = creditAmount + CurBalance;
        return newBalance1;
    }
    public String toString(){
        return "Account name: " + this.FirstName +" "+ this.LastName +" Accoubt Type: "+ getAcctType()+ " Balance: $"+ this.CurBalance;
    }
    public static void main(String[] args) {
        Account person = new Account("Zehua", "Li", 100);
        System.out.println(person);

        person.DebitTransaction(1000);
        System.out.println(person);

        person.CreditTransaction(400);
        System.out.println(person);

        Account ChAccount = new CheckingAccount("Bruce", "Lee", 300);
        System.out.println(ChAccount);

        ChAccount.DebitTransaction(500);
        System.out.println(ChAccount);

        ChAccount.CreditTransaction(400);
        System.out.println(ChAccount);
    }

}
