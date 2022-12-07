import java.util.HashMap;
import java.util.Map;

public class zad2 {
    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<String, String>();

        languages.put("Java ", "18");
        languages.put("Phyton ", "6");
        languages.put("PHP ", "0");
        languages.put("C++ ", "17");


        for (Map.Entry<String, String> e:languages.entrySet()){
            System.out.print(e.getKey());
            System.out.println(e.getValue());

        }
        System.out.println(languages);

    }
}