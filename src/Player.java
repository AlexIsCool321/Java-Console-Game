
import java.util.Scanner;

public class Player
{
	private static Scanner Input;
	private static Vector2 Position;

	public Player(Vector2 start_position)
	{
		Player.Input = new Scanner(System.in);
		Player.Position = start_position;
	}

	public void Clean()
	{
		Player.Input.close();
	}

	public static Vector2 Get_Position()
	{
		return Player.Position;
	}
}
