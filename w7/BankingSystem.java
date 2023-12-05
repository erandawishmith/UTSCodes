import java.util.LinkedList;

public class BankingSystem
{    
    private LinkedList<Account> accounts = new LinkedList<Account>();
    private double savingsAccInterest = 0.06;
    private double transactionsAccInterest = 0.01;
    private double creditAccInterest = 0.13;
    private double totalInterestPaid;
    
    public BankingSystem()
    {
        setup();
        run();
    }
    
    private void setup()
    {
        accounts.add(new SavingsAccount(20000, savingsAccInterest));
        accounts.add(new TransactionsAccount(10000, transactionsAccInterest));
        accounts.add(new SavingsAccount(5000, savingsAccInterest));
        accounts.add(new CreditAccount(-7000, creditAccInterest, PaymentGateway.MASTERCARD));
        accounts.add(new CreditAccount(-14000, creditAccInterest, PaymentGateway.VISA));
    }
    
    private void run()
    {
        for(Account account : accounts)
        {
            account.show();
            double interestForToday = account.calcInterest();
            totalInterestPaid += interestForToday;
            account.applyInterest();
            System.out.println("Interest: $" + Formatter.format(interestForToday)
                + " New Balance : $ " +  Formatter.format(account.getBalance()));
        }
        System.out.println("Total interest paid by the Bank: $ " 
            + Formatter.format(totalInterestPaid));
    }
}