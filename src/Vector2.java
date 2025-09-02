
public class Vector2
{
	public double x;
	public double y;

	public Vector2()
	{
		x = 0;
		y = 0;
	}

	public Vector2(double x, double y)
	{
		this.x = x;
		this.y = y;
	}


	public Vector2 Add_To(Vector2 other)
	{
		return new Vector2(this.x + other.x, this.y + other.y);
	}

	public Vector2 Sub_From(Vector2 other)
	{
		return new Vector2(this.x - other.x, this.y - other.y);
	}

	public Vector2 Multiply(Vector2 other)
	{
		return new Vector2(this.x * other.x, this.y * other.y);
	}

	public Vector2 Divide(Vector2 other)
	{
		return new Vector2(this.x / other.x, this.y / other.y);
	}


	public boolean Is_Equalt_To(Vector2 other)
	{
		return (this.x == other.x && this.y == other.y);
	}
}
