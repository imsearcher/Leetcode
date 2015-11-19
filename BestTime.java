//#121 Best Time to Buy and Sell Stock
public class BestTime {
    public int maxProfit(int[] prices) {
   
        if(prices==null||prices.length==0)
            return 0;
        //return getMax(prices,0,prices.length-1);
        return dpMax(prices);
    }
    public int getMax(int[] prices,int l,int r)
    {
        
        if(l>=r)
            return 0;
            
        int mid=(l+r)/2;    
        int lmax=  getMax(prices,l,mid-1);
        int rmax=  getMax(prices,mid+1,r);
        
        int min=prices[l];
       for(int i=mid;i>=l;i--){
           if(prices[i]<min)
            min=prices[i];
        }
        int max=prices[mid];
        for(int j=mid;j<=r;j++){
            if(prices[j]>max)
            max=prices[j];
        } 
        int dif=max-min;
        int tmp=Math.max(rmax,lmax);
        return Math.max(dif,tmp);
        
        
    }
    public int dpMax(int[] prices){
    
        int profit=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            min=Math.min(min,prices[i]);
            profit=Math.max(profit,prices[i]-min);
        
        }
        return profit;
        
        
        
        
    }
    
    
}