package employeewages;

public class employeewages {
 
    private int numofcompany=0;
	public static final int IS_FULL_TIME=1;
	public static final int  IS_PART_TIME=2;
	private CompanyEmpWage[] CompanyEmpWageArray;
	//constructor to initialize the members of the class
	public employeewages()
	{
		CompanyEmpWageArray=new CompanyEmpWage[5];
	}
	
	
	 public void addCompanyEmpWage(String company ,int WAGE_PER_HOUR,int WDAYS_PER_MONTH,int MAX_WRK_HRSMONTH )
	 {
		 CompanyEmpWageArray[numofcompany]=new CompanyEmpWage(company,WAGE_PER_HOUR, WDAYS_PER_MONTH,MAX_WRK_HRSMONTH );
		 numofcompany++;
	 }
	 
	 private void computewage()
	 {
		 for(int i=0;i<numofcompany;i++)
		 {
			 
			 CompanyEmpWageArray[i].setTotalWage(this.computewage(CompanyEmpWageArray[i]));
		 }
	 }
	 //method to compute wage for  different companies
    public int computewage(CompanyEmpWage companyEmpWage)
    {
    	 int emphr=0;
        
    	 //int empwage=0;
        int totalwhrs=0;
        int totalwdays=0;
        
        int totalempwage=0;
        
        
        while(totalwhrs<=companyEmpWage.MAX_WRK_HRSMONTH && totalwdays<companyEmpWage.WDAYS_PER_MONTH)
        {
      	  int empcheck=(int) (Math.floor(Math.random()*10)%3);
            switch(empcheck)
            {
            case IS_FULL_TIME:emphr=16;
                            
                              break;
            case IS_PART_TIME:emphr=8;
         
                              break;
            default:emphr=0;
            
                   break;
            }
            totalwhrs+=emphr;
            totalwdays++;
            totalempwage=totalwhrs*companyEmpWage.WAGE_PER_HOUR;
           
            System.out.println(" total hrs is "+totalwhrs);
            System.out.println("total days is "+totalwdays);
        }
        return totalempwage;       
  	}

    
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("welcome to employee wage computation");
        employeewages wmpwages=new employeewages();
        wmpwages.addCompanyEmpWage("dmart" ,20,20,100);
        wmpwages.addCompanyEmpWage("kmart" ,10,20,150);
        wmpwages.computewage();
        wmpwages.toString();
	}
}









