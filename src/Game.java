public class Game
{
	private final Player player;
	private final Map map;

	public Game()
	{
		this.player = new Player(new Vector2(0, 0));
		this.map = new Map();

		this.player.Set_Position(this.map.Get_Starting_Position());
	}

	public boolean Loop()
	{
		Renderer.Clear_Screen();
		System.out.println("Press w, a, s, or d to move the player. (press enter to confirm the move)");
		Renderer.Draw_Map(map, player);
		
		this.player.Move(map);

		if (map.Test_Victory(player))
		{
			Renderer.Clear_Screen();
			Renderer.Draw_Map(map, player);
			
			System.out.println("You Win! :D");

			return false;
		}

		return true;
	}

	public void Clean()
	{
		this.player.Clean();
	}
}
