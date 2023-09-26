public class Hgv extends RoadVehicle implements ImportDuty
{
	private int cargo;

	public Hgv()
    { 	
		this(0,0,0);	
	}

	public Hgv(int c, int w, int p)
    { 
		super(w, p);
		setCargo(c);
	}

	public void setCargo(int size)
    {
		cargo = size;
	}

	public int getCargo()
    {
		return cargo;
	}

    @Override
    public double calculateDuty()
    {
        return HGVTAXRATE;
    }
}