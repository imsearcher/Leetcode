//#290 Word Pattern
import java.util.*;
public class WordPattern {
    public boolean wordPattern(String pattern, String str) {
        
       String[] strArr=str.split(" ");
        
        if(strArr.length!=pattern.length())
            return false;
        HashMap<Character,String> map=new HashMap<Character,String>();
        HashSet<String> tokenSet=new HashSet<String>();
        for(int i=0;i<pattern.length();i++){
            char c=pattern.charAt(i);
            String s=strArr[i];
            if(!map.containsKey(c)){
                if(tokenSet.contains(s))
                    return false;
                else{
                    map.put(c,s);
                    tokenSet.add(s);
                }
            }else{
                if(!map.get(c).equals(s))
                    return false;
            }
        }

        return true;
    }
}