import java.util.*;
public class Joseph {
	public int getResult(int n){
		int[] tmp = null;
		int[] selected=null;
		for(int i=0;i<n;i++)
			tmp[i]=i;
		int j=0,index=2;
		while(tmp.length!=1){
			int i=0;
			while(i<tmp.length){
				if(i%index==1)
					selected[j]=tmp[i];	
			}
			tmp=null;
			tmp=selected;
		}
		return selected[0];
	} 
	public void main(String[] args){
		System.out.println(getResult(5));
	}
}
