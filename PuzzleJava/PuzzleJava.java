import java.util.Random;
import java.util.ArrayList;
public class PuzzleJava{
    Random random = new Random();
    ArrayList<Integer> getTenRolls(){

       ArrayList<Integer> myRandomArray = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++){
            myRandomArray.add(random.nextInt(1,20));
        }
        return myRandomArray;
    }
    char getRandomLetter(){
        ArrayList<Character> myRandomLetterArray = new ArrayList<Character>();
                for(char i = 'a'; i <= 'z' ; i++){
            myRandomLetterArray.add(i);
        }
        int randomIndex = random.nextInt(0,25);
        char randomLetter = myRandomLetterArray.get(randomIndex);
        return randomLetter;
    }
    String generatePassword(){
        String password =""; 
        for (int i = 0; i < 8; i++){
            password = password.concat(String.valueOf(getRandomLetter()));
        }
        return password;
    }
    ArrayList<String> getNewPasswordSet(int x){
        ArrayList<String> myRandomPasswordArray = new ArrayList<String>();
        for (int i =0 ; i< x ; i++){
            myRandomPasswordArray.add(generatePassword());
        }
        return myRandomPasswordArray;
    }
    ArrayList<Integer> shuffleArray(){
        ArrayList<Integer> myArray = new ArrayList<Integer>(getTenRolls());
        System.out.println(myArray);
        for (int i = 0; i < myArray.size(); i++){
            int randomIndex = random.nextInt(0,myArray.size());
            Integer temp = myArray.get(i);
            myArray.set(i, myArray.get(randomIndex));
            myArray.set(randomIndex, temp);
        }
        return myArray;
    }
    
}