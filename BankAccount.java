
public class BankAccount {
String name;
double balance;
double transactionFee = 0.00;

public boolean deposit(double amount) {
if(amount > 0) {
   balance = balance + amount;
   return true;
    }
return false;
  }

public boolean withdraw(double amount) {
   double temp_bal;
if(amount > 0){
   temp_bal = balance - amount - transactionFee;
   if(temp_bal > 0){
       balance = temp_bal;
         return true;
      }
   return false;
    }
return false;
  }

public void tostring(){
   System.out.println(name + ", $" + balance);
  }
}
