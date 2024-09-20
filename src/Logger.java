import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Logger {
    public final String fileName = "log.txt";
    private PrintWriter printWriter;

    public Logger() {
        try {
            FileWriter fw = new FileWriter(fileName);
            PrintWriter pw = new PrintWriter(fw, true);
        } catch (IOException e) {
            System.out.println("Catching IO Exception");
            throw new RuntimeException(e);
        }
    }

    public void logWithdraw(String account, double amount) {
        printWriter.println("Withdraw {" + account + "}: " + amount);
    }

    public void logDeposit(String account, double amount) {
        System.out.println("Deposit {" + account + "}: " + amount);
        printWriter.println("Deposit {" + account + "}: " + amount);
    }

    public void logTransfer(String sender, String receiver, double amount) {
        printWriter.println("Transfer " + amount + " " + sender + " to " + receiver);
    }



}
