import java.util.Scanner;

public class MyMain {

    // Changes a capital letter to a lowercase letter
    // If the char is not an uppercase letter, 
    // it is returned unchanged. 
    public static char toLower(char ch) {
        if(ch <91 && ch>64){
            return (char) (ch+32);
        }else{
            return ch;
        }
    }

    // Returns a copy of a String, where all letters 
    // are now lowercase
    public static String myToLowerCase(String str) {
        String out = "";
        for(int i=0;i<str.length();i++){
        if(str.charAt(i) <91 && str.charAt(i)>64){
            out+=(char) (str.charAt(i)+32);
        }else{
            out+=str.charAt(i);
        }
        }
        return out;
    }

    // Changes a lowercase letter to an uppercase letter
    // If the char is not an lowercase letter, 
    // it is returned unchanged. 
    public static char toUpper(char ch) {
        if(ch <123 && ch>96){
            return (char) (ch-32);
        }else{
            return ch;
        }
    }

    // Returns a copy of a String, where all letters 
    // are now uppercase
    public static String myToUpperCase(String str) {
        String out = "";
        for(int i=0;i<str.length();i++){
        if(str.charAt(i) <123 && str.charAt(i)>96){
            out+=(char) (str.charAt(i)-32);
        }else{
            out+=str.charAt(i);
        }
        }
        return out;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type a string");
        String in = scan.nextLine();
        System.out.println("Do you want it uppercase or lowercase? (Type 'L' or 'U'");
        String choice = scan.nextLine();
        if(choice.equals("L")){
            System.out.println(myToLowerCase(in));
        }else{
            System.out.println(myToUpperCase(in));
        }
        scan.close();
    }
        
    
}
