import java.util.*; 
  
public class Solution { 
	
    static String list[] = { "","", "abc", "def","ghi", "jkl", "mno","pqrs", "tuv", "wxyz" }; 

    public static ArrayList<String> generateAllPhoneWords(String str) 
    { 
    	ArrayList<String> result = new ArrayList<>();
        if (str.length() == 0) { 
            result.add(""); 
            return result; 
        } 
  
        char ch = str.charAt(0); 
        String rest = str.substring(1); 
        ArrayList<String> prev = generateAllPhoneWords(rest); 
         
        String x = list[ch - '0']; 
        
        for (String val : prev) { 
  
            for (int i = 0; i < x.length(); i++) { 
                result.add(x.charAt(i) + val); 
            } 
        } 
        return result; 
    } 

    public static void main(String[] args) 
    { 
        String str = "228"; 
        System.out.println(generateAllPhoneWords(str)); 
    } 
} 