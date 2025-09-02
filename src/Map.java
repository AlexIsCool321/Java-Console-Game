
public class Map
{
	public final Vector2 size;
	public int[] level =
	{
		1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
		1, 0, 0, 1, 1, 1, 1, 0, 0, 0, 1, 0, 0, 3, 1,
		1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 1, 1,
		1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1,
		1, 1, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 1,
		1, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 0, 1,
		1, 0, 0, 1, 0, 1, 0, 1, 1, 0, 1, 0, 0, 0, 1,
		1, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 0, 1,
		1, 0, 1, 1, 0, 1, 0, 1, 1, 0, 0, 0, 0, 0, 1,
		1, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1,
		1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 1,
		1, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1,
		1, 1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1,
		1, 2, 0, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1,
		1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,

	};

	public Map()
	{
		this.size = new Vector2(15, 15);
	}

	public Map(int[] level, Vector2 size)
	{
		this.level = level;
		this.size = size;
	}

	public Vector2 Get_Starting_Position()
	{
		for (int y = 0; y < this.size.y; y++)
		{
			for(int x = 0; x < this.size.x; x++)
			{
				int index = (y * (int)this.size.x) + x;
				
				if (this.level[index] == 2)
				{
					return new Vector2(x, y);
				}
			}
		}
		
		return new Vector2(0, 0);
	}

	public boolean Test_Collition(Vector2 position)
	{
		int index = (int)((int)(position.y * this.size.x) + position.x);
		
		return this.level[index] == 1;
	}

	public boolean Test_Victory(Player player)
	{
		int index = (int)((int)(player.Get_Position().y * this.size.x) + player.Get_Position().x);
		
		return this.level[index] == 3;
	}
}
