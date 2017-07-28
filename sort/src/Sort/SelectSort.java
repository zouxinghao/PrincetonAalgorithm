package Sort;

import Comparable.comparable;

public class SelectSort {
	public static void sort(comparable[] a){
		int N = a.length;
		for(int i=0;i<N;i++){
			int min=i;
			for(int j=i+1;j<N;j++){
				if(less(a[j],a[min])){
					min=j;
				}
				exch(a,i,min);
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
