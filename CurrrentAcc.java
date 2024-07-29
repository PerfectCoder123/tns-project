abstract class CurrentAcc extends BankAcc {
    private float creditLimit;

    public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
        super(accNo, accNm, accBal);
        this.creditLimit = creditLimit;
    }

    @Override
    public void withdraw(float amount) {
        if (getAccBal() + creditLimit >= amount) {
            setAccBal(getAccBal() - amount);
        } else {
            System.out.println("Insufficient balance. Exceeds credit limit.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", CreditLimit: " + creditLimit;
    }

    // Getter for creditLimit
    public float getCreditLimit() {
        return creditLimit;
    }
}
