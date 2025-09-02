public class Renderer
{
	public static void Clear_Screen()
	{
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}

	public static void Draw_Map(Map map, Player player)
	{
		for (int y = 0; y < map.size.y; y++)
		{
			String line = "";

			for(int x = 0; x < map.size.x; x++)
			{
				int index = (y * (int)map.size.x) + x;

				
				if (player.Get_Position().Is_Equalt_To(new Vector2(x, y)))
				{
					line += "* ";
				}
				else
				{
				
					switch (map.level[index])
					{
						case 0 -> // Air
						{
							line += "  ";
						}
						case 1 -> // Wall
						{
							line += "# ";
						}
						case 3 -> // Finish
						{
							line += "! ";
						}
						default ->
						{
							line += "  ";
						}
					}
				}
			}

			System.out.println(line);
		}
	}
}
