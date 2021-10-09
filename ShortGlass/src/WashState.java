
public class WashState implements State
{
    Glass glass;
    public WashState(Glass glass)
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
		System.out.println("Short Glass serving drinks");
		glass.setState(glass.getServeState());
		
	}

	@Override
	public void breakGlass() {
		System.out.println("Short Glass broke");
		glass.setState(glass.getBreakState());
		
	}

	@Override
	public void washGlass() {
		System.out.println("Coaster broken, needs to be recycled or thrown away");	
	}

	public String toSting()
	{
		return "short glass cleaned";
	}
}
