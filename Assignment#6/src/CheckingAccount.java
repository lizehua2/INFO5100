public class CheckingAccount extends Account{
    double min = 500;
    double penaltyFee = 200;
    public CheckingAccount(String FirstName, String LastName, double CurBalance){
        super(FirstName,LastName,CurBalance);
    }

    @Override
    public double DebitTransaction(double debitAmount) {
        super.DebitTransaction(debitAmount);
        ChargeFee();
        return CurBalance;
    }
    public double CreditTransaction(double creditAmount){
        super.CreditTransaction(creditAmount);
        ChargeFee();
        return CurBalance;
    }
    private void ChargeFee(){
        if(CurBalance < min){
            this.CurBalance = CurBalance - penaltyFee;
        }
    }
}
