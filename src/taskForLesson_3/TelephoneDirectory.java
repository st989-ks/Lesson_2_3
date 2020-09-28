package taskForLesson_3;

import java.util.*;

public class TelephoneDirectory {
    private static HashMap<String, String> caller = new HashMap<>();


    public static void add(String name, String phone) {
        caller.put( phone, name );
    }

    public static String get(String name) {
        String resultPrint = name + " - ";
        int counter = 0;
        for (Map.Entry x : caller.entrySet()) {
            if (name.equalsIgnoreCase( (String) x.getValue() )) {
                resultPrint += x.getKey() + "; ";
                counter++;
            }
        }
        if (counter == 0) {
            return name + " - отсутствует в списке;";
        }
        return resultPrint;
    }

}
