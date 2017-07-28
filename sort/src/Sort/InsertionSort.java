package Sort;

import Comparable.comparable;

public class InsertionSort {
	
	public static void insertionSort(comparable[] a){
		int N=a.length;
		for(int i=0;i<N;i++){
			for(int j=i;j>0;j--){
				if(less(a[j],a[j-1]))
					exch(a,j,j-1);
				else break;
				//注意这个地方，因为i元素左边的不封是排好序的，所以只要j-1不再大于j，
				//就表示就是这个位置,可以 break了
				
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
