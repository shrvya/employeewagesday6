package employeewages;
import java.util.*;

public class employeewages implements Icomputewages{
 
    private int numofcompany=0;
	public static final int IS_FULL_TIME=1;
	public static final int  IS_PART_TIME=2;
	private LinkedList<CompanyEmpWage> CompanyEmpWageList;
	private Map<String,CompanyEmpWage> CompanyToEmpWageMap;
	//constructor to initialize the members of the class
	public employeewages()
	{
		CompanyEmpWageList =new LinkedList<>();
		CompanyToEmpWageMap=new HashMap<>();
	}
	
	
	 public void addCompanyEmpWage(String company ,int WAGE_PER_HOUR,int WDAYS_PER_MONTH,int MAX_WRK_HRSMONTH )
	 {
		 CompanyEmpWage companyempwage=new CompanyEmpWage(company,WAGE_PER_HOUR, WDAYS_PER_MONTH,MAX_WRK_HRSMONTH );
		 CompanyEmpWageList.add(companyempwage);
		 CompanyToEmpWageMap.put(company, companyempwage);
	 }
	 
	 public void computewage()
	 {
		 for(int i=0;i<CompanyEmpWageList.size();i++)
		 {
			 
			 CompanyEmpWage companyempwage=CompanyEmpWageList.get(i);
			 companyempwage.setTotalWage(this.computewage(companyempwage));
			 System.out.println(companyempwage);
		 }
	 }
	 
	 public int gettotalwage(String company)
	 {
		 return CompanyToEmpWageMap.get(company).totalwage;
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
            int dailywage=emphr*companyEmpWage.WAGE_PER_HOUR;
            totalempwage=totalwhrs*companyEmpWage.WAGE_PER_HOUR;
           
            System.out.println(" total workin  hrs is "+totalwhrs);
            System.out.println("total working days is "+totalwdays);
            System.out.println("dailywage  is "+dailywage);
           
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









