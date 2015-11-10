//#14 Longest Common Prefix
//
public class LongestComPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null||strs.length==0)
            return "";
        
        int l=Integer.MAX_VALUE;
        for(int i=0;i<strs.length;i++){
            if(strs[i].length()<l)
                l=strs[i].length();
        }
        String result="";
        for(int j=0;j<l;j++){
            char c=strs[0].charAt(j);
            boolean isCommon=true;
            for(int i=1;i<strs.length;i++){
                
                if(strs[i].charAt(j)!=c){
                    isCommon=false;
                    break;
                }
               
            }
            if(isCommon)
                result+=c;
            else
                break;
        }
        return result;
        
        
    }
}