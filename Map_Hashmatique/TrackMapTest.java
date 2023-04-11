import java.util.Set;
import java.util.HashMap;
public class TrackMapTest{
    public static void main(String[] args){
        HashMap<String, String> trackList = new HashMap<String, String>();
       
        trackList.put("Track1","layric1");
        trackList.put("Track2","layric2");
        trackList.put("Track3","layric3");
        trackList.put("Track4","layric4");

        String Track = trackList.get("Track2");
        System.out.println(Track);

        Set<String> keys = trackList.keySet();
        for(String key : keys) {
            // System.out.println(key);
            System.out.println(key+":"+trackList.get(key)); 

        }

    }
}