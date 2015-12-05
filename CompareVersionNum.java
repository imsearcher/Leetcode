//#165 Compare Version Numbers
public class CompareVersionNum {
    public int compareVersion(String version1, String version2) {
        //reg exp
        String[] v1=version1.split("\\.");
        String[] v2=version2.split("\\.");
        
        int length=v1.length>v2.length?v1.length:v2.length;
        for(int i=0;i<length;i++){
            
            int v1number=v1.length<=i?0:Integer.valueOf(v1[i]);
            int v2number=v2.length<=i?0:Integer.valueOf(v2[i]);
            
            if(v1number>v2number)
            {
                return 1;
            }else if(v1number<v2number){
                return -1;
            }else{
                continue;
            }
        }
        return 0;
    }
}