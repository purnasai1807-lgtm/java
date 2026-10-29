public class Addition{
	private int x;
	private int y;
	private int z;
	
	public Addition(int x,int y){
    this.x=x;
    this.y=y;
	}
	public void sum(){
	z=x+y;
	}
	@Override
	public String toString(){
	return "Sum= "+z;
	}
}
	
