package Lesson4;

public class BankAccount {
    int id;
    String name;
    double balance;
    double amount;
    void addMoney(int amount) {

            balance += amount;

        }


        void withdrawMoney (int amount){

                balance -= amount;

            }
            void printBalance(){
                System.out.println(balance);
            }


        public static void main(String[] args) {
            BankAccount MyAccount = new BankAccount();
            BankAccount HisAccount = new BankAccount();
            BankAccount HerAccount = new BankAccount();

            MyAccount.id = 1;
            MyAccount.name = "Juia";
            MyAccount.balance = 10000.100;
            MyAccount.addMoney(100);


            HisAccount.id = 2;
            HisAccount.name = "Vova";
            HisAccount.balance = 500.33;
            HisAccount.withdrawMoney(500);

            HerAccount.id = 3;
            HerAccount.name = "Chris";
            HerAccount.balance = 22;

           MyAccount.printBalance();
           HisAccount.printBalance();
           HerAccount.printBalance();


        }
    }





