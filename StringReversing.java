import java.util.Scanner;
/**
 * String reverse(String s) is the static method This method contains the logic to reverse the string.
 *Create the object for the class ReverseofaString and call the static method with the object
 *  as rev.reverse(str)) by passing the given string.
 */
class StringReversing {
    public static void main(String[] args) {
        StringReversing rev = new StringReversing();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your string : ");
        String str = scan.nextLine();
        System.out.println("Reverse of your string is : " + rev.reverse(str));
    }
    static String reverse(String s){
        String rev = "";
        for(int j = s.length(); j>0; --j){
            rev = rev + (s.charAt(j-1));
        }
        return rev;
    }
}
