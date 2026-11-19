import java.util.List;

public class PersonalAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;
    private List<Amount> transactions;

    public PersonalAccount(int accountNumber, String accountHolder){

    }


    public void Deposit(double amount){

    }

    public void withraw(double amount){

    }

    public void printTransactionHistory(){

    }

    public double getBalance(){
        return 0.0;
    }

    int getAccountNumber(){
        return 0;
    }

    public void setAccountNumber(){

    }

    public String getAccountHolder(){
        return null;
    }

    @Override
    public String toString(){
        return("Acc number: " + accountNumber + ". /n" + "Acc Holder: " + accountHolder + ". /n" + "balance: " + balance + ".");
    }
}

