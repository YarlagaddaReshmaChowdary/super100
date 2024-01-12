public class Atm { 
    private int balance=0;
    public int deposit(int money)
    {
        balance+=money;
        System.out.println("The balance after depositing the money"+money+"is: "+balance);
        return balance;
    }
    public int withdraw(int money)
    {
    if(money>balance)
    {
        System.out.println("Insufficient funds for withdrawal: " + money);
    }
    else{
        balance-=money;
        System.out.println("The balance after withdrawing the money: "+balance);
    }
    return balance;
    }
    public void balanceEnquiry()
    {
        System.out.println("The available balance is: "+balance);
    }
    public static void main(String[] args)
    {
        Atm a=new Atm();
        a.deposit(10000);
        a.withdraw(5000);
        a.balanceEnquiry();
        a.deposit(1000);
        a.withdraw(7000);
        a.balanceEnquiry();
}
}
