abstract class SavingAcc extends BankAcc {
    private boolean isSalaried;
    private static final float MINBAL = 1000;

    public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
        super(accNo, accNm, accBal);
        this.isSalaried = isSalaried;
    }

    @Override
    public void withdraw(float amount) {
        if (getAccBal() - amount >= MINBAL) {
            setAccBal(getAccBal() - amount);
        } else {
            System.out.println("Insufficient balance. Minimum balance should be maintained.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", isSalaried: " + isSalaried;
    }

    public boolean isSalaried() {
        return isSalaried;
    }
}
