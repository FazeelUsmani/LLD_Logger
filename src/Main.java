
public class Main {
    public static void main(String[] args) {

        Logger logger1 = new Logger();
        Logger logger2 = new Logger();
        Logger logger3 = new Logger();

        logger1.logDeposit("Fazeel", 100);
        logger2.logWithdraw("Ayesha", 80);
        logger1.logTransfer("Fazeel", "Usmani", 40);
        logger3.logDeposit("Rameez", 85);
        logger2.logWithdraw("Sameer", 30);




    }
}