class Uber{
	static int y = 5;
	Uber(int x){
		this();
		y = y *3;		
	}
	Uber(){
		y--;
	}	
}
public class File extends Uber{
	File(){
		super(y);
		y = y + 4;
	}
	public static void main(String[]args){
		new File();
		System.out.println(y);
	}
}
