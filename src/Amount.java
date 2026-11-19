import java.time.LocalDateTime;

public class Amount {
    private double amount;
    private LocalDateTime timestamp;
    private String transactionType;

    public void Amount(double _amount, LocalDateTime _timestamp, String _transactionType){
    amount = _amount;
    timestamp = _timestamp;
    transactionType = _transactionType;
    }
    public double getAmount(){return amount;}
    public LocalDateTime getTimestamp(){return timestamp;}

    @Override
    public String toString() {
        return ("DEPOSIT:" + amount);
    }


}
