
import java.util.Scanner;

public class Player
{
	private final Scanner Input;
	private Vector2 Position;

	public Player(Vector2 start_position)
	{
		this.Input = new Scanner(System.in);
		this.Position = start_position;
	}

	public void Clean()
	{
		this.Input.close();
	}

	public void Move(Map map)
	{
		String move = Input.nextLine();

		Vector2 translation = new Vector2();

		switch (move)
		{
			case "w" ->
			{
				translation.y = -1;
			}
			case "s" ->
			{
				translation.y = 1;
			}
			case "a" ->
			{
				translation.x = -1;
			}
			case "d" ->
			{
				translation.x = 1;
			}
		}

		if (!map.Test_Collition(this.Position.Add_To(translation)))
		{
			this.Position = this.Position.Add_To(translation);
		}
	}


	public void Set_Position(Vector2 position)
	{
		this.Position = position;
	}

	public Vector2 Get_Position()
	{
		return this.Position;
	}
}
