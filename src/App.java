public class App
{
	private static Game game;
	private static boolean running;

	public static void main(String[] args)
	{
		App.running = true;
		App.game = new Game();

		while (App.running)
		{
			App.running = App.game.Loop();
		}

		App.game.Clean();
	}
}
