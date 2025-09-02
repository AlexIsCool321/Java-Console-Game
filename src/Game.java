public class Game
{
	private final Player player;
	private final Map map;

	public Game()
	{
		this.player = new Player(new Vector2(2, 2));
		this.map = new Map();
	}

	public boolean Loop()
	{
		Renderer.Clear_Screen();
		Renderer.Draw_Map(map, player);
		
		this.player.Move(map);

		return true;
	}

	public void Clean()
	{
		this.player.Clean();
	}
}
