//#278 First Bad Version
public class FirstBadVersion extends VersionControl {
    public int firstBadVersion(int n) {
        if(n<2)
            return isBadVersion(n)==true?n:0;
        else
            return check(1,n);
    }
    public int check(int head,int end){
          //head+end may overflow
         int index=head+(end-head)/2;
          if(head>end)
                return head;
          int result=0;
          if(isBadVersion(index)){
            // performance issue
            //   if(index==1||!isBadVersion(index-1))
            //     return index;
            //   else
                return check(head,index-1);
          }else{
              return check(index+1,end);
          }
        
        // while(head<end){
        //     int index=head+(end-head)/2;
        //     if(isBadVersion(index)){
        //       if(index==1||!isBadVersion(index-1))
        //         return index;
        //       else
        //         end=index-1;
        //     }else{
        //         head=index+1;    
        //     }
        // }
        // return head;  
    }
}