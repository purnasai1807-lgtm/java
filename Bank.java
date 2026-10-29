package ATM.Test;
class Bank{
    private String name;
    private long acno;
    private double bal;
	
	public Bank(String n,long a,double b){
		name=n;
		acno=a;
		bal=b;
	}
	public void deposit(double dep){
	bal=bal+dep;
	}
    public void printBalance(){
        System.out.println(name+" your current Balance is: "+bal);
    }
	public void withdraw(double wtd){
	double newbal=bal-wtd;
    if (newbal>=1000){
       bal=bal-wtd;	
	 }
	else{
	System.out.println("ERROR! ,LOW BALANCE");}}
	
	public void Intrest(){
		if(bal<10000 && bal>=100){
			double inrs=(bal*3)/100;
			bal=bal+inrs;
		}
		else if(bal<50000){
			double inrs_2=(bal*5)/100;
		bal=bal+inrs_2;
		}
		else{
			double inrs_3=(bal*7)/100;
		    bal=bal+inrs_3;
	}}
	
			
			
			
	
}