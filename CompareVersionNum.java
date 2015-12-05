//#165 Compare Version Numbers
public class CompareVersionNum {
    public int compareVersion(String version1, String version2) {
        //reg exp
        String[] v1=version1.split("\\.");
        String[] v2=version2.split("\\.");
        int l1=v1.length;
        int l2=v2.length;
        int length=l1>l2?l1:l2;
        for(int i=0;i<length;i++){
            
            int v1number=l1<=i?0:Integer.parseInt(v1[i]);
            int v2number=l2<=i?0:Integer.parseInt(v2[i]);
            
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