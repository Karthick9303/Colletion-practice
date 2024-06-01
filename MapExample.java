package CollectionPractice;
import java.util.*;
public class MapExample 
{
    public static void main(String[] args) 
    {
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Apple", 3);
        for (Map.Entry<String, Integer> entry : map.entrySet()) 
        {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        System.out.println("Value for 'Apple': " + map.get("Apple"));
        System.out.println("Contains key 'Apple'? " + map.containsKey("Apple"));
        map.remove("Apple");
        System.out.println("Map after removing 'Banana': " + map);
    }
}
