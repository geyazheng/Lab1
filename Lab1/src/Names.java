import java.util.ArrayList;
import java.util.List;

public class Names {
    public static void printNames() {
        List<String> names = new ArrayList<>();
        names.add("Amy");
        names.add("Bob");
        names.add("Candy");
        names.add("David");
        names.add("Eva");
        
        List<String> switchedNames = new ArrayList<>();
        
        for (String name : names) {
            String switchedName = switchLetters(name);
            switchedNames.add(switchedName);
        }
        
        System.out.println("Names = " + names.toString());
        System.out.println("Names (switched) = " + switchedNames.toString());
    }

    
    private static String switchLetters(String name) {
        if (name.length() <= 1) {
            return name.toUpperCase(); 
        }
        String switched = name.substring(name.length() - 1).toUpperCase() +
                          name.substring(1, name.length() - 1).toLowerCase() +
                          name.substring(0, 1).toLowerCase();
        return switched;
    }
} 
