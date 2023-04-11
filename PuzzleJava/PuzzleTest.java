import java.util.ArrayList;
import java.util.Random;
public class PuzzleTest {
    
	public static void main(String[] args) {
		PuzzleJava generator = new PuzzleJava();
		ArrayList<Integer> randomRolls = generator.getTenRolls();
		System.out.println(randomRolls);
		

		char randomLetterRolls = generator.getRandomLetter();
		System.out.println(randomLetterRolls);

		String password = generator.generatePassword();
		System.out.println(password);

		ArrayList<String> randomPasswordArray = generator.getNewPasswordSet(5);
		System.out.println(randomPasswordArray);

		ArrayList<Integer> mixedArray = generator.shuffleArray();
		System.out.println(mixedArray);
 
	}
}
