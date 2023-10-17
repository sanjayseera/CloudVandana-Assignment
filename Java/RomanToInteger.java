//Enter a Roman Number as input and convert it to an integer. (Example: IX = 9)

import java.util.*;
public class RomanToInteger {
    public static int romanToInt(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = map.get(s.charAt(s.length()-1));
        for(int i = s.length()-2; i >= 0; i--){
            if(map.get(s.charAt(i)) < map.get(s.charAt(i+1))){
                result -= map.get(s.charAt(i));
            }
            else{
                result += map.get(s.charAt(i));
            }
        }

        return result;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Roman Number : ");
        String s = sc.nextLine();
        int val = romanToInt(s.toUpperCase()); 
        System.out.println(s.toUpperCase()+  " = " + val);
        sc.close();

    }
}
