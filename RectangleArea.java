//#223 Rectangle Area
public class RectangleArea {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        
        int r1Area=(C-A)*(D-B);
        int r2Area=(G-E)*(H-F);
        
      
        int total=r1Area+r2Area;
        if(Math.min(C,G)<=Math.max(A,E)||Math.min(D,H)<=Math.max(B,F))
            return r1Area+r2Area;
        int inter=Math.max(Math.min(C,G)-Math.max(A,E),0)*Math.max(Math.min(D,H)-Math.max(B,F),0);
        total-=inter;
        return total;
    }
}