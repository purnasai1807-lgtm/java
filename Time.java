class Time{
	public int hours;
	public int minutes;
	public int seconds;
	Time(){
		hours=00;
		minutes=00;
		seconds=00;
	}
	Time(int s){
		hours=s/3600;
		minutes=(s/60)-60;
		seconds=s-3600-60;
	}
	Time(int h, int m){
		hours=h;
		minutes=m;
		seconds=00;
	}
	Time(int h,int m,int s){
		hours=h;
		minutes=m;
		seconds=s;
	}
	public void displaytime(){
		System.out.println(hours+"."+minutes+"."+seconds);
}}