import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class SingletonLogger {
    public final String fileName = "singleton-log.txt";
    private PrintWriter printWriter;
    private static SingletonLogger singletonLogger = null;

    private SingletonLogger() {
        try {
            FileWriter fw = new FileWriter(fileName);
            printWriter = new PrintWriter(fw, true);
        } catch (IOException e) {
            System.out.println("Catching IO Exception");
            throw new RuntimeException(e);
        }
    }

    public static SingletonLogger getInstance() {
        if (singletonLogger == null) {
            singletonLogger = new SingletonLogger();
        }
        return singletonLogger;
    }



    public void logWithdraw(String account, double amount) {
        printWriter.println("Withdraw {" + account + "}: " + amount);
    }

    public void logDeposit(String account, double amount) {
//        System.out.println("Deposit {" + account + "}: " + amount);
        printWriter.println("Deposit {" + account + "}: " + amount);
    }

    public void logTransfer(String sender, String receiver, double amount) {
        printWriter.println("Transfer " + amount + " " + sender + " to " + receiver);
    }
}
