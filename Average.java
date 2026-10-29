public class Average{
	public static double avg(int... a){
		System.out.println("VARAGRS CALL");
		double su=0.0;
		int n=a.length;
		for(int i=0;i<n;i++){
			su=su+a[i];
		}
	    return (double)su/n;}
	public static double avg(int a,int b,int c){
	return (a+b+c)/3.0;}
	public static double avg(double a,double b){
		return (a+b)/2.0;
	}
	public static void main(String[] args){
    System.out.println("Avg= "+Average.avg(1,3,6,5,9,0,11));
}}