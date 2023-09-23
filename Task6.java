package JavaOopsProject;
/**
 * Find the First Non-Repeating Character in a String: Given a string,
   find and return the first non-repeating character. For example, in the
   string "abracadabra", the first non-repeating character is 'c'.*/


public class Task6 {
    public static void main(String[] args) {
        String string = "abracadabra";
        int index = -1;
        char fnc = ' ';

        for (char i : string.toCharArray()) {
            if (string.indexOf(i) == string.lastIndexOf(i)) {
                fnc = i;
                break;
            }
            else {
                index += 1;
            }
        }
        if (index == string.length()-1) {
            System.out.println("All characters are repeating");
        }
        else {
            System.out.println("First non-repeating character: " + fnc);
        }
    }
}
