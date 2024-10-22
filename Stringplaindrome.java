import java.util.*;
class Palindrome{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String sb;
        int n;
        String temp="";
        System.out.println("Enter the String:");
        sb = sc.nextLine();
        n = sb.length();
        for(int i=n-1;i>=0;i--){
          temp = temp+sb.charAt(i);
        }
        if(sb.equals(temp)){
            System.out.println("Plaindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
}
