//Check if the input is pangram or not. (A pangram is a sentence that contains all the alphabets from A to Z)

import java.util.*;
public class pangram {
    public static boolean isPangram(String s){
        if(s.length() < 26){
            return false;
        }
        else{
            for(char ch = 'a'; ch <= 'z'; ch++){
                if(s.indexOf(ch) < 0){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input : ");
        String s = sc.nextLine();
        if(isPangram(s.toLowerCase())){
            System.out.println("The given input is pangram");
        }
        else{
            System.out.println("The given input is not a pangram");
        }
        sc.close();
    }
    
}
