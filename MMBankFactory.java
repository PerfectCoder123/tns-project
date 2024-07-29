class MMBankFactory extends BankFactory {
    @Override
    public MMSavingAcc getNewSavingAccount(int accNo, String accNm, float accBal, boolean isSalaried) {
        return new MMSavingAcc(accNo, accNm, accBal, isSalaried);
    }

    @Override
    public MMCurrentAcc getNewCurrentAccount(int accNo, String accNm, float accBal, float creditLimit) {
        return new MMCurrentAcc(accNo, accNm, accBal, creditLimit);
    }
}