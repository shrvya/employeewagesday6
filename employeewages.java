package employeewages;

public class employeewages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("welcome to employee wage computation");
       final int IS_FULL_TIME=1;
       final int IS_PART_TIME=2;
       final int WAGE_PER_HOUR=20;
       final int WDAYS_PER_MONTH=20;
       
       final int TOTAL_WRK_DAYS=20;
       final int TOTAL_WRK_HRS=100;
       int emphr=0;
       int empwage=0;
      int totalwhrs=0;
      int totalwdays=0;
      int totalempwage=0;
      while(totalwhrs<TOTAL_WRK_DAYS && totalwdays<TOTAL_WRK_HRS)
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
	}

}
