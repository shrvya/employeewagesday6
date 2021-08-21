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
       double empcheck=Math.floor(Math.random()*10)%3;
       if(empcheck==IS_FULL_TIME)
       {
    	   System.out.println("Full time Employee");
    	   emphr=16;
       }
       else if(empcheck==IS_PART_TIME) {
    	   System.out.println("Part time Employee");
    	   emphr=8;
       }
       else {
    	   System.out.println("employee absent");
       }
       empwage=emphr*WAGE_PER_HOUR;
       System.out.println("employee wage is "+empwage);
	}

}
