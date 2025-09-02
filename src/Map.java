
public class Map
{
	public final Vector2 size;
	public int[] level =
	{
		1, 1, 1, 1, 1, 1, 1, 1,
		1, 0, 1, 1, 0, 0, 2, 1,
		1, 0, 0, 0, 0, 1, 1, 1,
		1, 1, 1, 0, 1, 1, 0, 1,
		1, 0, 0, 0, 0, 0, 0, 1,
		1, 0, 1, 1, 0, 1, 0, 1,
		1, 0, 1, 0, 0, 1, 0, 1,
		1, 1, 1, 1, 1, 1, 1, 1
	};

	public Map()
	{
		this.size = new Vector2(8, 8);
	}

	public Map(int[] level, Vector2 size)
	{
		this.level = level;
		this.size = size;
	}

	public boolean Test_Collition(Vector2 position)
	{
		int index = (int)((int)(position.y * this.size.x) + position.x);
		
		return this.level[index] == 1;
	}

	public boolean Test_Victory(Player player)
	{
		int index = (int)((int)(player.Get_Position().y * this.size.x) + player.Get_Position().x);
		
		return this.level[index] == 2;
	}
}
