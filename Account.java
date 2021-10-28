class Account
{
  double balance;
  void addBalance(double value)
  {
    balance = balance+value; 
  }
  double getBalance()
  {
    return balance;
  }
  double withdraw(double Amount)
  {
      if(balance>(amount+5000))   // if((balance-amount)>5000)
         {
            balance=balance-amount;
            return balance;
         }
      else
       {
         System.out.println("Insufficient Funds!!!")
         return -1;
       }
  }
  public static void main(String args[])
    {

        Account acc=new Account();
        acc.addBalance(1000);   //1000
        acc.addBalance(acc.getBalance()*2);
        System.out.println(acc.getBalance());

    }
}