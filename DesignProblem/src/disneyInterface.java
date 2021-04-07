import java.util.Queue;

public interface disneyInterface {
	
	public void errors(int userInput);
	
	public void checkSmallestLine(Queue<String> Line1, Queue<String> Line2, String input, int userInput);
	
	public void fastLaneChecker(Queue<String> fastLine, String input, int userInput);
}
