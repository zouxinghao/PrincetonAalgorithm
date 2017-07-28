
public class inheritHash {
	public static void main(String[] args){
		int x = 19960427;
		int y = 20170724;
		int z = 19960427;
		
		String str = "How I Meet You mother"; 
		
		System.out.println(str.hashCode());
		
		System.out.println(Integer.valueOf(x).hashCode());
		
		int LEN= str.length();
		for(int i = 0;i<LEN;i++){
			System.out.println(str.charAt(i));
		}
		
		String str1 = "hello";
		String str2 = "olleh";
		
		System.out.println(str1.hashCode()==str2.hashCode());
		
		
	}
}
