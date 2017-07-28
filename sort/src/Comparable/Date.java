package Comparable;

public class Date implements comparable<Date>{

	private final int month,day,year;
	
	public Date(int m,int d,int y){
		month=m;
		day=d;
		year=y;
	}
	
	@Override
	public int compareTo(Date that) {
		// TODO Auto-generated method stub
		if(this.year<that.year) return -1;
		if(this.year>that.year) return +1;
		if(this.month<that.month) return -1;
		if(this.month>that.month) return +1;
		if(this.day<that.day) return -1;
		if(this.day>that.day) return +1;
		return 0;
	}

}
