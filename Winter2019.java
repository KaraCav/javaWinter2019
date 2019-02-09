// 1. Codewars- DNA to RNA Conversion
// DNA is composed of four nucleic acid bases Guanine ('G'), Cytosine ('C'), Adenine ('A'), and Thymine ('T').
// RNA's chemical structure and contains no Thymine. In RNA Thymine is replaced by another nucleic acid Uracil ('U').
// Create a function which translates a given DNA string into RNA.

public String dnaToRna(String dna) {
      String replaceString = dna.replace('T','U');
        return replaceString; 
    } 

// 2. Codewars- If you can't sleep, just count sheep!!
// Given a positive integer (3 for example) return a string with a murmur: "1 sheep...2 sheep...".

class Kata {
  public static String countingSheep(int num) {
  String totalSheep = "";
    for(int i = 1; i <= num; i++){
    totalSheep = totalSheep + i + " sheep...";
    }
    return totalSheep;
  }
}

// 3. Codewars- A Strange Trip to the Market
// Nessie is a master of disguise but always says the phrase "tree fiddy" (also written as 3.50 or three fifty). 
// Return "true" if the speaker is Nessie, and "false" if not. 

public class Nessie {
    public static boolean isLockNessMonster(String s){
      if(s.contains("tree fiddy") || s.contains("3.50") || s.contains("three fifty")){
        return true; }
      else {
        return false; }
    }
}
// ALSO can do:
import java.util.regex.Pattern;

public class Nessie {
    public static boolean isLockNessMonster(String s) {
        return Pattern.matches(".*(tree fiddy|3\\.50|three fifty).*", s);  }
}

// 4. Codewars- Form the Largest
// Return The max number that could be formed from the digits of a given number.
// arrayList will grow as you add more, the memory will increase
// only real use case for primitave array is for very small apps
// List can reorder, array can not


import java.util.*;
public class Solution {
    public static long maxNumber(long n) {
        List<Long> nums = new ArrayList<>();
        while(n > 0) {
            nums.add(n % 10);
            n = n / 10;
        }
        Collections.sort(nums, Collections.reverseOrder());
     //   for(Long num : nums){ n = (n * 10) + num }
        for(int i = 0; i < nums.size(); i++){
           n = (n * 10) + nums.get(i);
        }
        return n;
    }
}
