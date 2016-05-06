//51. N-Queens 
import java.util.*;

public class NQueens {
    ArrayList<List<String>> list=new ArrayList<List<String>>();
    public List<List<String>> solveNQueens(int n) {
		fetch(n, new int[n], new int[n],0);
		return list;
	}

	public void fetch(int n, int[] remains, int[] subList,int index) {

		if (index == n) {
			
			ArrayList<String> newList = new ArrayList<String>();
			for (int i = 0; i < n; i++) {
				StringBuilder sb = new StringBuilder();
				for (int j = 0; j < n; j++) {
					if (j == subList[i])
						sb.append("Q");
					else
						sb.append(".");
				}
				newList.add(sb.toString());
				
			}

			list.add(newList);
			return;
		}
		for (int i = 0; i < remains.length; i++) {
			if(remains[i]!=-1){
			boolean valid=true;
				for (int j = 0; j < index; j++) {
					int row = index - j;
					int col = Math.abs(subList[j] - i);
					if (row == col)
						valid=false;
				}
				if(!valid)
					continue;
				subList[index]=i;
				remains[i]=-1;
				fetch(n, remains, subList,index+1);
				remains[i]=0;
			}
		}

	}
}