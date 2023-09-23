package JavaOopsProject;
 /**Check if a String is Palindrome: Determine whether a given string is
    a palindrome, which means it reads the same forwards and
    backward. For example, "madam" is a palindrome*/

public class Task3 {
     public static void main(String[] args) {
         String word="madam";
         String reverse="";
         for (int i = word.length()-1; i >=0 ; i--) {
             reverse=reverse+word.charAt(i);
         }
         if(word.equals(reverse)){
             System.out.println("It is a palindrome");
         }else{
             System.out.println("It is not a palindrome");
         }
     }
}
