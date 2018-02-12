import java.util.Arrays;

public class BagOfNames {

    private String[] names;

    public BagOfNames(){
        names = new String[] {"Jill", "Jackie", "Joe", "John", "Kevin", "Brittney", "Jeremy", "Grayson", "Benjamin", "Stefanie", "Rachael", "Amanda", "Elizabeth"};
    }

    public boolean isKnown(String name){
        if (!Arrays.asList(names).contains(name)){
            System.out.println("The name entered cannot be found in the 'names' array.");
            return false;
        }
        System.out.println("The name entered is listed in the 'names' array.");
        return true;
    }

    public boolean sameLength(String name){
        for (int i = 0; i < names.length; i++){
            if (names[i].length() == name.length()) {
                System.out.println("The name entered matches the 'names' array value: " + names[i]);
                return true;
            }
        }
        System.out.println("No matches found.");
        return false;
    }
}
