import java.util.Date;

public class CreditCard
{
    private Guardian guardian;
    private int cardNumber;
    private Date expirationDate;
    private int cvv;

    public CreditCard(Guardian guardian, int cardNumber, Date expirationDate, int cvv)
    {
        this.guardian = guardian;
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
        this.cvv = cvv;
    }
}
