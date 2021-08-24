package employeewages;

public class employeewages {
 
	public static final int IS_FULL_TIME=1;
	public static final int  IS_PART_TIME=2;
	
	private final String company;
	private final int WAGE_PER_HOUR;
	public final int WDAYS_PER_MONTH;
	public final int MAX_WRK_HRSMONTH;
    public employeewages(String company,int WAGE_PER_HOUR,int WDAYS_PER_MONTH,int MAX_WRK_HRSMONTH )
    {
    	this.company=company;
    	this. WAGE_PER_HOUR= WAGE_PER_HOUR;
    	this. WDAYS_PER_MONTH= WDAYS_PER_MONTH;
    	this.MAX_WRK_HRSMONTH=MAX_WRK_HRSMONTH;
    }
    
    public boolean computewage()
    {
    	 int emphr=0;
         int empwage=0;
        int totalwhrs=0;
        int totalwdays=0;
        int totalempwage=0;
        
        
        while(totalwhrs<MAX_WRK_HRSMONTH && totalwdays<WDAYS_PER_MONTH)
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
            empwage=emphr*WAGE_PER_HOUR;
            totalempwage+=empwage;
            
        }
        
         System.out.println(" employee wage is "+empwage);
         System.out.println("total employee wage is "+empwage);
         System.out.println(" total hrs is "+totalwhrs);
         System.out.println("total days is "+totalwdays);
         return false ;
  	}

    
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("welcome to employee wage computation");
        employeewages dmart=new  employeewages("dmart" ,20,20,100);
        employeewages kmart=new  employeewages("kmart" ,10,20,150);
       dmart.computewage();
      
       kmart.computewage();
       
	}
}









