package Sort;

import Comparable.comparable;

public class shellSort {
	
	public static void sort(comparable[] a){
		int N=a.length;
		
		int h=1;
		while(h<N/3)
			h=3*h+1;
		
		while(h>=1){
			for(int i=h;i<N;i++){
				for(int j=i;j>h&&less(a[j-h],a[j]);j-=h)
					exch(a,j-h,j);
			}
		}
	}
	
	private static boolean less(comparable a,comparable b){
		return a.compareTo(b)<0;
		}
	
	private static void exch(comparable[] a,int i,int j){
		comparable tmp=a[i];
		a[i]=a[j];
		a[j]=tmp;
	}
}
