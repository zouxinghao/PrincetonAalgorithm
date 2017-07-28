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
				//ע������ط�����ΪiԪ����ߵĲ������ź���ģ�����ֻҪj-1���ٴ���j��
				//�ͱ�ʾ�������λ��,���� break��
				
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
