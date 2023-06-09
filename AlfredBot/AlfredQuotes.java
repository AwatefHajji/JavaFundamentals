import java.util.Date;
import java.text.SimpleDateFormat;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        return String.format("Hello,%s,lovely to see you", name);
    }
    
    public String dateAnnouncement() {
        Date date = new Date();
        return String.format("It is currently %s", date);
    }
    
    public String respondBeforeAlexis(String conversation) {
        if(conversation.indexOf("Alexis")!= -1){
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        }else if(conversation.indexOf("Alfred")!= -1){
            return "At your service. As you wish, naturally.";
        }else 
        return "Right. And with that I shall retire.";
    }
    
	// NINJA BONUS
	// See the specs to overload the guestGreeting method
    // public String guestGreeting (String name, String dayPeriod){
    //     return String.format("Good %s,%s,lovely to see you",dayPeriod, name);
    // }
    public String guestGreeting(String name, Date date) {
    SimpleDateFormat dateFormat = new SimpleDateFormat("a");
    String dayPeriod = dateFormat.format(date);
    if (dayPeriod.equals("AM")) {
        return String.format("Good morning, %s, lovely to see you", name);
    } else {
        return String.format("Good afternoon, %s, lovely to see you", name);
    }
}
        // SENSEI BONUS
        // Write your own AlfredQuote method using any of the String methods you have learned!
}

