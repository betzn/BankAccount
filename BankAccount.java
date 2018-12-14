/*
BankAccount.java

4th Ed of textbook p. 657 Ex 5 and  Ex 6 (Ticket class for campu event).

*Test your classes from the client program (the one with main method). 

Hint: To “force” subclasses to implement superclass methods, make these methods abstract. 

By Nathan Betz
*/

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
