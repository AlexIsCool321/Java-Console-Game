public class App
{
	private static boolean Running;
	private static Player player;

	public static void main(String[] args)
	{
		Start();

		while (Running)
		{
			Loop();
		}

		Clean();
	}

	private static void Start()
	{
		App.Running = true;
		App.player = new Player(new Vector2(0, 0));
	}

	private static void Loop()
	{
		Renderer.Clear_Screen();
	}

	private static void Clean()
	{
		App.player.Clean();
	}
}
