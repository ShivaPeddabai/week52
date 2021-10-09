
public class Glass 
{
	State buyState;
	State breakState;
	State serveState;
	State washState;
	State state;
	
	public Glass()
	{
		buyState = new BuyState(this);
		breakState = new BreakState(this);
		serveState = new ServeState(this);
		washState = new WashState(this);
		state = buyState;
	}
	
	public void setState(State state)
	{
		this.state = state;
	}
	
	public State getState() 
	{
		return state;
	}

	public State getBuyState() 
	{
		return buyState;
	}

	public State getBreakState() 
	{
		return breakState;
	}

	public State getServeState() 
	{
		return serveState;
	}

	public State getWashState() 
	{
		return washState;
	}
	
	public void buyGlass()
	{
		state.buyGlass();
	}
	
	public void serveGlass()
	{
		state.serveGlass();
	}
	
	public void washGlass()
	{
		state.washGlass();
	}
	
	public void breakGlass()
	{
		state.breakGlass();
	}
	
	public String toString()
	{
		StringBuffer sb=new StringBuffer();
		sb.append("\nShort Glass State  \n");
		sb.append("Short Glass "+state+"\n");
		return new String(sb);
	}
}
