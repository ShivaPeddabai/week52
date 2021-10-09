
public class BuyState implements State
{
	Glass glass;
	public BuyState(Glass glass)
	{
		this.glass = glass;
	}
	
	@Override
	public void buyGlass() {
		System.out.println("Buying Short Glass");
	}

	@Override
	public void serveGlass() {
		System.out.println("Serving with short glass");
		glass.setState(glass.getServeState());
    }

	@Override
	public void breakGlass() {
		System.out.println("Short Glass broke");
		glass.setState(glass.getBreakState());
	}

	@Override
	public void washGlass() {
		System.out.println("Washing Short glass");	
		glass.setState(glass.getWashState());
	}
	
	public String toString() {
		return "brought";
	}
}
