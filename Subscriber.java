class Subscriber{
	public String Name;
	public int age;
	public Subscriber(String n, int rr){
	
		Name=n;
		age=rr;
	}
	public void info(){
		System.out.println("Name="+Name);
		System.out.println("Age="+age);
	}}
	
class WLS extends Subscriber{
	public int Mobileno;
	
	WLS(String w, int s,int t){
		super(w,s);
		Name=w;
		age=s;
	    Mobileno=t;}
	public void info(){
		super.info();
System.out.println("Mobile="+Mobileno);}}

class BBS extends WLS{
	public int netspeed;
	BBS(String Name,int age,int Mobileno,int netspeed){
		super(Name,age,Mobileno);
		this.Name=Name;
		this.age=age;
		this.Mobileno=Mobileno;
		this.netspeed=netspeed;
	}
	public void info(){
		super.info();
		System.out.println("The Internet Speed is: "+netspeed);
	}
}			