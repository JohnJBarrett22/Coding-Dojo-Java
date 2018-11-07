import java.util.HashMap;
import java.util.Set;

public class MapOfTheHashmatique{
    public void retriveSongData(){  
        HashMap<String, String> songMap = new HashMap<String, String>();
        songMap.put("Eatin Chicken At Night", "Ohhh, how I love eating ckicken at night, under the pale moon light!");
        songMap.put("I Don't Like Grubs", "Nasty lil grubs, why won't you just leave me alone?");
        songMap.put("Butter Is Better Than Lotion", "All my friends wonder how I have silky soft skin, it's cuz I use margarine");
        songMap.put("Roadkill", "Partially prepped meals, ohh how tasty you are!");

        String single = songMap.get("Butter Is Better Than Lotion");
        System.out.println(single);

        Set<String> keys = songMap.keySet();
        for(String key : keys){
            System.out.println(key);
            System.out.println(songMap.get(key));
        }
    }
}