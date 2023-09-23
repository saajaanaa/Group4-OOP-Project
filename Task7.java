package JavaOopsProject;

import java.util.ArrayList;

/**You have a list of strings and you want to keep only those that start
        with “A” and you want to return them in lower case"*/

public class Task7 {
    public static void main(String[] args) {
        ArrayList<String>words=new ArrayList<>();
        words.add("America");
        words.add("October");
        words.add("Ant");
        words.add("Home");
        words.add("Air");

        for (int i = 0; i < words.size(); i++) {
            if(!words.get(i).startsWith("A")){
                words.remove(i);
            }
            System.out.println(words.get(i).toLowerCase());

        }


    }

}
