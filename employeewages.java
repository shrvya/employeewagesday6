package employeewages;

public class employeewages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("welcome to employee wage computation");
       final int IS_FULL_TIME=1;
       final int IS_PART_TIME=2;
       final int WAGE_PER_HOUR=20;
       final int WDAYS_PER_MONTH=20;
       int emphr=0;
       int empwage=0;
       int empcheck=(int) (Math.floor(Math.random()*10)%3);
       switch(empcheck)
       {
       case IS_FULL_TIME:emphr=16;
                        System.out.println("FULL TIME EMP");
                         break;
       case IS_PART_TIME:emphr=8;
       System.out.println("PART TIME EMP");
                         break;
       default:emphr=0;
       System.out.println(" EMP ABSENT");
              break;
       }
       empwage=emphr*WAGE_PER_HOUR*WDAYS_PER_MONTH;
       System.out.println("monthly employee wage is "+empwage);
	}

}
