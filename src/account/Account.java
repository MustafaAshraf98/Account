package account;

/**
 *
 * @author Mustafa
 */
public class Account {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PayAccount a1 =new PayAccount();
        
        a1.insert(4466276, "Mustafa Ashraf", 10000);
        a1.deposit(12000);
        a1.withdraw(2000);
        a1.checkBalance();
        a1.toString();
        
    }
    
}
