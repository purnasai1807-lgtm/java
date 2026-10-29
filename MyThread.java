 import java.util.Random;
 class MyThread extends Thread{
	@Override
	public void run(){
		Random r=new Random();
		int a=r.nextInt();
		System.out.println("Random number is"+a);
		if(a%2==0){
			System.out.println("EVEN,SQ IS"+a*a);
		}
		else{
		System.out.println("ODD , CUBE IS: "+a*a*a);
		}
	}
}
class TestThread{
	public static void main (String args[]){
        MyThread t1=new MyThread();
		t1.start();
		try{
		t1.sleep(1000);}
		catch(InterruptedException e){
		System.out.println(e);}
}
}
		
		