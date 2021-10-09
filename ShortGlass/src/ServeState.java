
public class ServeState implements State
{
	Glass glass;
	public ServeState(Glass glass)
	{
		this.glass = glass;
	}
	@Override
	public void buyGlass() {
		System.out.println("Short glass already brought");	
		glass.setState(glass.getBuyState());
	}

	@Override
	public void serveGlass() {
		System.out.println("Serving drinks with Short glass");		
	}

	@Override
	public void breakGlass() {
		System.out.println("Short Glass broke");
		glass.setState(glass.getBreakState());		
	}

	@Override
	public void washGlass() {
		System.out.println("Short glass Finished serving, washing short glass");
		glass.setState(glass.getWashState());
	}

	public String toString()
	{
		return "Serving Drinkings";
	}
}
