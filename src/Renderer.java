public class Renderer
{
	public static void Clear_Screen()
	{
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}
}
