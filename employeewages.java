package employeewages;

public class employeewages {
 
	public static final int IS_FULL_TIME=1;
	public static final int  IS_PART_TIME=2;
	private final int WAGE_PER_HOUR;
	public final int WDAYS_PER_MONTH;
	public final int MAX_WRK_HRSMONTH;
    public employeewages(int WAGE_PER_HOUR,int WDAYS_PER_MONTH,int MAX_WRK_HRSMONTH )
    {
    	this. WAGE_PER_HOUR= WAGE_PER_HOUR;
    	this. WDAYS_PER_MONTH= WDAYS_PER_MONTH;
    	this.MAX_WRK_HRSMONTH=MAX_WRK_HRSMONTH;
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("welcome to employee wage computation");
       
       
       
       int emphr=0;
       int empwage=0;
      int totalwhrs=0;
      int totalwdays=0;
      int totalempwage=0;
      
      employeewages ec=new  employeewages(20,20,100);
      while(totalwhrs<ec. MAX_WRK_HRSMONTH && totalwdays<ec.WDAYS_PER_MONTH)
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
          empwage=emphr*ec.WAGE_PER_HOUR;
          totalempwage+=empwage;
          
      }
      
       System.out.println(" employee wage is "+empwage);
       System.out.println("total employee wage is "+empwage);
       System.out.println(" total hrs is "+totalwhrs);
       System.out.println("total days is "+totalwdays);
	}

}
