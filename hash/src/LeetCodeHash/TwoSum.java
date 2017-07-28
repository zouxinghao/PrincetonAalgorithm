package LeetCodeHash;

import java.util.HashMap;

public class TwoSum {
	public static  int[] twoSum(int[] numbers,int target){
		int N=numbers.length;
		int[] result=new int[2];
		
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int i=0;i<N;i++){
			if(map.containsKey(target-numbers[i])){
				result[0]=map.get(target-numbers[i]);
				result[1]=i+1;
				break;
			}else{
				map.put(numbers[i],i+1);
			}
		}
		return result;
	}
//	public static boolean isPalindrome(int x) {
//        if(x<0) return false;
//        int rev=0,rem;
//        int tmp=x;
//        while(x>0){
//            rem=x%10;
//            x=x/10;
//            rev=10*rev+rem;
//        }
//        if(tmp==rev) return true;
//        return false;
//    }
//	
//	public static String lon(String[] strs){
//		String Long="";
//		for(int i=0;i<strs.length;i++)
//			if(strs[i].length()>=Long.length())
//				Long=strs[i];
//		return Long;
//	}
	
	
}
