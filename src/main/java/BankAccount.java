/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        /**
         *
         */
        CHECKINGS,

        /**
         *
         */
        SAVINGS,

        /**
         *
         */
        STUDENT,

        /**
         *
         */
        WORKPLACE
    }

    /**
     *
     */
    private int accountNumber;

    /**
     *
     */
    private BankAccountType accountType;

    /**
     *
     */
    private double accountBalance;

    /**
     *
     */
    private String ownerName;

    /**
     *
     */
    private double interestRate;

    /**
     *
     */
    private double interestEarned;

    /**
     *
     * @param name a string
     * @param accountCategory the bank account type
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        /*
         * Implement this function
         */
    }

    /*
     * Implement getters and setters as appropriate for private variables.
     */

    /**
     * @return new owner name
     */
    public String getOwnerName() {
        return this.ownerName;
    }

    /**
     * @param newOwnerName new owner name
     * @return new owner name
     */
    public void setOwnerName(final String newOwnerName) {
        ownerName = newOwnerName;
    }

    /**
     * @return account balance
     */
    public double getAccountBalance() {
        return accountBalance;
    }
}
