import java.util.Random;
	
	public class randomvalues{

	
	public static void main(String []args){
		
		Random random = new Random ();
		
		int x = random.nextInt(6)+1; //----dice randomizer
		double y = random.nextDouble(); //---- random values between 0-1
		boolean z = random.nextBoolean(); //---- true or false
		
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}