package com.vishal.pac;

public class EmployeeMain {
	public static void main(String[] args) {
//		Employee ep = new Employee();
//		Developer d = new Developer();
//		Employee ed= new Developer();
//		Employee er=new HR();
////		e.attendance();                             //Developer Attendance will get called as the obj is of Developer class
//		//System.out.println(e.getSkillSet());       //getSkillSet() method is undefined for the type Employee
//		ep.setSal(10000);
////		System.out.println(e.calSalary());
//		System.out.println(ep.calSalary());
//		ed.setSal(10000);
//		
//		System.out.println(ed.calSalary());
//		er.setSal(10000);
//		System.out.println(er.calSalary());
		
		Employee empArray[]= {new Developer(),new HR()};
		empArray[0].setSal(10000);
		empArray[1].setSal(20000);
		/*
		 * System.out.println(empArray[0].calSalary(empArray[1]));
		 * System.out.println(empArray[1].calSalary(empArray[0]));
		 */	
		Employee temp=new Employee();
		for(int ctr=0;ctr>empArray.length;ctr++)
		{
			temp.calSalary(empArray[ctr]);
		}
	}
}
