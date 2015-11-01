//#171
public class ExcelSheetColumnNumber {
    public int titleToNumber(String s) {
        if(s==null||s.length()==0)
            return 0;
            
        int length=s.length()-1;
        int total=0;
        for(int i=0;i<s.length();i++){
            total+=(int)Math.pow(26,length)*((s.charAt(i)-'A')+1);
            length--;
        }
        
        return total;
    }
}