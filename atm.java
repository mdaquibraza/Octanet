public class atm{
    private static int balance;
    private static int pin;
    public atm(int balance, int pin){
        atm.balance=balance;
        atm.pin=pin;
    }
    public void displayMenu(){
        System.out.println("1.check balance");
        System.out.println("2.Deposite");
        System.out.println("3.Withdraw");
        System.out.println("4.Change pin");
        System.out.println("5.Exit");

    }
    public void deposite(int amount){
        balance+=amount;
    }
    public void Withdraw(int amount){
        if(balance<amount){
            System.out.println("insuffcient funds");
            return;
        }
        balance-=amount;
    }
    public int getBalance(){
        return balance;
    }
    public boolean validtedPin(int pin){
        return atm.pin==pin;
    }
    public void changePin(int newPin){
        pin=newPin;
        System.out.println("pin Change!");
    }



    public static void main(String[] args) 
    {

       
 atm ATM = new atm (balance=1000, pin=1234);


        System.out.println("enter the pin");
        int pin=Integer.parseInt(System.console().readLine()); 
       
        if(ATM.validtedPin(pin)){

            int option=0;
            while(option!=5){
        ATM.displayMenu();
        option=Integer.parseInt(System.console().readLine());
        switch(option){
            case 1:
               System.out.println("balance: " +ATM.getBalance());
                 break;
            case 2:
            System.out.println("enter amount:");
            int amount=Integer.parseInt(System.console().readLine());
            ATM.deposite(amount);
                 break;
            case 3:
            System.out.println("enter amount:");
            amount=Integer.parseInt(System.console().readLine());
            ATM.Withdraw(amount);
                 break;
            case 4:
            System.out.println("enter new pin:");
            int newPin=Integer.parseInt(System.console().readLine());
            ATM.changePin(newPin);
                 break;
            case 5:
            System.out.println("thanku for using atm:");
           
                 break;
            default:
                 break;
        }

            }
        }
        else{

            System.out.println("you have enter invalid pin");
        }
    }
 
    }
