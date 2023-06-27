package collection;

import java.util.HashMap;
import java.util.Map;

public class Maplist {
    public static void main(String[] args) {
        Map<String,String> person= new HashMap<>();
        person.put("shemi","shemi123@gmail.com");
        person.put("jesi","jesi@gmail.com");
        System.out.println(person.get("shemi"));
        for (Map.Entry<String,String>entry:person.entrySet())
        {
            String key=entry.getKey();
            String value=entry.getValue();
            System.out.println("key:"+key+" value: "+value);
        }
        
    }
}
