abstract class BankAcc {
    private int accNo;
    private String accNm;
    private float accBal;

    public BankAcc(int accNo, String accNm, float accBal) {
        this.accNo = accNo;
        this.accNm = accNm;
        this.accBal = accBal;
    }

    public void deposit(float amount) {
        this.accBal += amount;
    }

    public abstract void withdraw(float amount);

    @Override
    public String toString() {
        return "AccNo: " + accNo + ", AccNm: " + accNm + ", AccBal: " + accBal;
    }

    // Getters and Setters
    public int getAccNo() {
        return accNo;
    }

    public String getAccNm() {
        return accNm;
    }

    public void setAccNm(String accNm) {
        this.accNm = accNm;
    }

    public float getAccBal() {
        return accBal;
    }


    public void setAccBal(float accBal){
        this.accBal = accBal;
    }
}
