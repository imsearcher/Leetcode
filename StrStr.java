//#28 ImplementStrStr

public class StrStr {
    public int strStr(String haystack, String needle) {
      
        if(needle.length()==0)
            return 0;       
        for(int i=0;i<haystack.length();i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                if(haystack.length()-i<needle.length())
                    continue;
                int x=i;
                boolean result=true;
                for(int j=0;j<needle.length();j++){
                    
                    if(!(needle.charAt(j)==haystack.charAt(x)))
                        result=false;
                    x++;
                }
                if(result)
                    return i;
                
            }
            
        }
        return -1;
        
    }
}