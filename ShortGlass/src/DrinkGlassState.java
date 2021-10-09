
public class DrinkGlassState {

	public static void main(String[] args) 
	{
		Glass glass = new Glass();
		System.out.println(glass);
		
		glass.buyGlass();
		glass.breakGlass();
		glass.washGlass();
		glass.serveGlass();
		glass.buyGlass();
		
		System.out.println(glass);
		glass.buyGlass();
		glass.washGlass();
		glass.serveGlass();
		glass.breakGlass();
		
		System.out.println(glass);
		glass.buyGlass();
		glass.serveGlass();
		glass.washGlass();
		glass.breakGlass();
		
	}

}
