// GoldenRetriever class inherits Dog class
public class GoldenRetriever extends Dog
{
	private String furShade;

	public GoldenRetriever()
	{
	}

	public String getShade()
	{
		return furShade;
	}

	public void setShade(String newValue)
	{
		furShade = newValue;
	}

	public String Bark()
	{
		return "woof woof";
	}
}
