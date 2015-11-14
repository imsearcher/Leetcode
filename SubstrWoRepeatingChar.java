//#3 Longest Substring Without Repeating Characters
//need to be improved
import java.util.*;
public class  SubstrWoRepeatingChar {
    public int lengthOfLongestSubstring(String s) {
        
        HashMap<Character,Integer> c=new HashMap<Character,Integer>();
        int max=0;
        int count=0;
        int last=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            Integer index=c.get(ch);
            if(index!=null)
            {
              
                if(count>max)
                    max=count;
                if(index>last){
                    count=i-index;
                    last=index;
                }else{
                    count=i-last;
                } 
            }else{
                count++;
            }
            c.put(ch,i);
            
        }
        if(count>max)
            max=count;
        return max;
        
        
    }
}