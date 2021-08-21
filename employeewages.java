package employeewages;

public class employeewages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("welcome to employee wage computation");
       final int IS_FULL_TIME=1;
       final int IS_PART_TIME=2;
       final int WAGE_PER_HOUR=20;
       int emphr=0;
       int empwage=0;
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
       empwage=emphr*WAGE_PER_HOUR;
       System.out.println("employee wage is "+empwage);
	}

}
