package Sort;

import Comparable.comparable;

public class mergeSort {
	
	private static comparable[] aux;
	
	private static void merge(comparable[] a,comparable[] aux,int lo,int mid,int hi){
		assert isSorted(a,lo,mid);
		assert isSorted(a,mid,hi);
		
		for(int k=0;k<a.length;k++)
			aux[k]=a[k];
		
		int i=lo,j=mid+1;
		for(int k=0;k<a.length;k++){
			if(i>mid) a[k]=aux[j++];
			else if(j>hi) a[k]=a[i++];
			else if(less(aux[j],aux[i])) a[k]=aux[j++];
			else a[k]=aux[i++];
			
		assert isSorted(a,lo,hi);
		}
				
	}
	private static void sort(comparable[] a,comparable[] aux,int lo,int hi){
		if(hi<=lo+6){//归并排序对小序列列来说很浪费，这个只收可以用shell(Insertion)
			shellSort.sort(a);
		}
		if(hi<=lo) return;
		int mid=lo+(hi-lo)/2;
		sort(a,aux,lo,mid);
		sort(a,aux,mid,hi);
		if(!less(a[mid+1],a[mid])) return;
		merge(a,aux,lo,mid,hi);
		
	}
	
	public static void sort(comparable[] a){//重新写一个sort函数，不在里面出现aux，可以节省空间
		aux=new comparable[a.length];
		sort(a,aux,0,a.length-1);
	}
	
	public static void sortBU(comparable[] a){
		int N=a.length;
		for(int sz=1;sz<N;sz=sz+sz){
			for(int lo=0;lo<N-sz;lo+=sz+sz){
				merge(a,aux,lo,lo+sz-1,Math.min(lo+sz+sz-1, N-1));
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
	private static boolean isSorted(comparable[] a,int i,int j){
		for(;i<j;i++){
			if(less(a[i],a[i-1]))
				return false;
		}
		return true;
	}
}
