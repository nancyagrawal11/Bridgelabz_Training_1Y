package multithreading;


class BankAccount {
    private String accountHolderName;
    private String accountType;

    public BankAccount(String name, String type) {
        this.accountHolderName = name;
        this.accountType = type;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAccountType() {
        return accountType;
    }
}


class User implements Runnable {
    private BankAccount account;

    public User(BankAccount account) {
        this.account = account;
    }

    @Override
    public void run() {
        Thread t = Thread.currentThread();

        for (int i = 1; i <= 3; i++) {
            System.out.println(
                    "User: " + account.getAccountHolderName() +
                            " | Account Type: " + account.getAccountType() +
                            " | Thread: " + t.getName() +
                            " | Priority: " + t.getPriority() +
                            " | Checking Balance (" + i + ")"
            );

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

// Main class
public class BankSimulation {
    public static void main(String[] args) {


        BankAccount premiumAcc = new BankAccount("Alice", "Premium");
        BankAccount regularAcc = new BankAccount("Bob", "Regular");
        BankAccount basicAcc = new BankAccount("Charlie", "Basic");

        // Creating user threads
        Thread t1 = new Thread(new User(premiumAcc), "Premium-Thread");
        Thread t2 = new Thread(new User(regularAcc), "Regular-Thread");
        Thread t3 = new Thread(new User(basicAcc), "Basic-Thread");


        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);


        t1.start();
        t2.start();
        t3.start();
    }
}