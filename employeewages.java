package employeewages;

public class employeewages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("welcome to employee wage computation");
       final int IS_FULL_TIME=1;
       final int WAGE_PER_HOUR=20;
       int empwage=0;
       double empcheck=Math.floor(Math.random()*10)%2;
       if(empcheck==IS_FULL_TIME)
       {
    	   System.out.println("Employee is present");
    	   empwage=8*WAGE_PER_HOUR;
       }
       else {
    	   System.out.println("Employee is absent");
       }
       System.out.println("full time employee wage is "+empwage);
	}

}
