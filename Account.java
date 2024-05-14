package refactorizacion;

/**
 *
 * @author Marta Romero Poo
 */
 
 /**
  * CÓDIGO SIN REFACTORIZAR:
    public class Account {
        //Atributos:
            public String accountNumber;
            public double balance;

        //Constructor
            public Account(String accountNumber, double balance) {
                this.accountNumber = accountNumber;
                this.balance = balance;
            }
    }
*/

//CÓDIGO REFACTORIZADO
public class Account {
    // Atributos:
    private String accountNumber;
    private double balance;
    
    // Constructor:
    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Métodos, getters y setters:
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}


