package ATM.Test;
class TestBank{
    public static void main(String args[]){
    Bank c1= new Bank("Sushanth",1321,3000.0);
    
	c1.deposit(500);
    c1.printBalance();
	System.out.println("After applying Intrest: \t");
	c1.Intrest();
	c1.printBalance();
	Bank c2= new Bank("Srikar",4212,1700.0);
	
	c2.withdraw(600);
	c2.printBalance();
    }
}
