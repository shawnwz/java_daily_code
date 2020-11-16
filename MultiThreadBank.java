public class MultiThreadBank {
    public static void main(String[] args) {
        Bank bank = new Bank();
        PersonA personA = new PersonA(bank);
        PersonB personB = new PersonB(bank);

        personA.start();
        personB.start();
    }
}

class Bank{
    static int money = 10000;

    public void Counter(int money){
        System.out.println("Current balance is " + Bank.money);
        Bank.money -= money;
        System.out.println("Counter withdrawl " + money + " the balance is " + Bank.money);
    }

    public void ATM(int money){
        System.out.println("Current balance is " + Bank.money);
        Bank.money -= money;
        System.out.println("ATM withdrawl " + money + " the balance is " + Bank.money);
    }
}

class PersonA extends Thread{
    Bank bank;

    public PersonA(Bank bank){
        this.bank = bank;
    }

    @Override
    public void run() {
        while (Bank.money>=100){
            bank.Counter(100);
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class PersonB extends Thread{
    Bank bank;

    public PersonB(Bank bank){
        this.bank = bank;
    }

    @Override
    public void run() {
        while (Bank.money>=200){
            bank.ATM(200);
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
