package Comparable;

public class CompareWithCompareTo {
	private static boolean less(comparable v,comparable w){
		return v.compareTo(w)<0;
	}
	
	private static void exch(comparable[] a,int i,int j){
		comparable swap=a[i];
		a[i]=a[j];
		a[j]=swap;
	}
	
	private static boolean isSorted(comparable[] a){
		for(int i=0;i<a.length;i++)
			if(less(a[i],a[i-1]))
				return false;
		return true;
	}
	
	public static void main(String[] args){
		int[] a={1,7,5,6,0,11};
		
	}
}
