public class Location
{
	private int latitude, longitude ;

	public Location(){}

	public Location (int aLatitude, int aLongitude)
	{
		this.latitude = aLatitude ;
		this.longitude = aLongitude ;
	}

	public void setLatitude (int aLatitude)
	{
		this.latitude = aLatitude ;
	}

	public void setLongitude (int aLongitude)
	{
		this.longitude = aLongitude ;
	}

	public int getLatitude()
	{
		return this.latitude ;
	}

	public int getLongitude()
	{
		return this.longitude ;
	}

	@Override
	public boolean equals (Object o)
	{
		if (o == null) return false ;
		if (!(o instanceof Location)) return false ;

		Location l = (Location) o ;

		if ((this.latitude == l.latitude) && (this.longitude == l.longitude)) return true ;

		return false ;
	}

	@Override
	public String toString()
	{
		return "(" + this.latitude + "," + this.longitude + ")" ;
	}
}