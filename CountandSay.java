//#38 Count and Say
public class CountandSay {
    public String countAndSay(int n) {
        
        int index=1;
        String seq="1";
        while(index<n){
            int count=1;
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<seq.length();i++){
               
               if(i+1>=seq.length()||seq.charAt(i)!=seq.charAt(i+1)){
                   sb.append(String.valueOf(count)).append(seq.charAt(i));
                   count=1;
               }else{
                   count++;
               }
                    
            }
            seq=sb.toString();
            index++;
            
        }
        return seq;
    }
}