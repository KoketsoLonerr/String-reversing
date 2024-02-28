import java.util.Scanner;

class StringReversingInArray {
    public static void main(String[] args) {
        String str;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your string : ");
        str = scan.nextLine();
        char[] ch = str.toCharArray();
        System.out.println("Reversed string : ");
        int i = ch.length;
        for(int j=i; j>0; j--){
            System.out.print(ch[j-1]);
        }
    }
}
