package employeewages;



public class CompanyEmpWage {

	
	
	public final String company;
	public final int WAGE_PER_HOUR;
	public final int WDAYS_PER_MONTH;
	public final int MAX_WRK_HRSMONTH;
	public int totalwage;
	/*
	 * constructor to initialize the parameters
	 */
    public CompanyEmpWage(String company,int WAGE_PER_HOUR,int WDAYS_PER_MONTH,int MAX_WRK_HRSMONTH )
    {
    	this.company=company;
    	this. WAGE_PER_HOUR= WAGE_PER_HOUR;
    	this. WDAYS_PER_MONTH= WDAYS_PER_MONTH;
    	this.MAX_WRK_HRSMONTH=MAX_WRK_HRSMONTH;
    }
    
    public  void setTotalWage(int totalwage) {
    	this.totalwage=totalwage;
    	
    }
    
	public String toString()
	{
		return "total employye wage for "+company+" is: "+totalwage;
	}

}
