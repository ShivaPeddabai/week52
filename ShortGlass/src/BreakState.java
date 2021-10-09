
public class BreakState implements State
{
	Glass glass;
	public BreakState(Glass glass)
	{
		this.glass = glass;
	}
	@Override
	public void buyGlass() {
		System.out.println("Buying Short Glass");
		glass.setState(glass.getBuyState());		
	}

	@Override
	public void serveGlass() {
		System.out.println("Short Glass Broke, can not serve");		
	}

	@Override
	public void breakGlass() {
		System.out.println("Short glass broke");
		
	}

	@Override
	public void washGlass() {
		System.out.println("Short glass broken, can not be washed");
	}
	
	public String toString()
	{
		return "broke";
	}
}
