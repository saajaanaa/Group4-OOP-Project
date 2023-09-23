package JavaOopsProject;
/** Count the Number of Words in a String: Write a function to count the
         number of words in a given string. Words are separated by spaces or
         punctuation. For example, the input "Hello, world!" should return 2.*/

public class Task4 {
    public static void main(String[] args) {
        String sentence="The due of the Java group project is by next Sunday";
        String [] word=sentence.split(" ");
        System.out.println(word.length);
    }
}
