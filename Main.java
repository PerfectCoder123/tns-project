public class Main {
    public static void main(String[] args) {
        BankFactory factory = new MMBankFactory();

        SavingAcc savingAcc = factory.getNewSavingAccount(101, "Jahid Khan", 5000, true);
        CurrentAcc currentAcc = factory.getNewCurrentAccount(102, "Cody Rhodes", 10000, 5000);

        System.out.println(savingAcc);
        System.out.println(currentAcc);

        savingAcc.withdraw(1000);
        currentAcc.withdraw(11000);

        System.out.println(savingAcc);
        System.out.println(currentAcc);
    }
}
