
package pro;
import java.io.*;
import java.util.*;

public class Tester 
{
	public static void main(String[] args) 
	{
		System.out.println("Welcome to Prashanth College of Thopes.\n");
		Scanner sc=new Scanner(System.in);
		int i=0;
		System.out.println("Enter 1 to Enroll a student.");
		System.out.println("Enter 2 to get the list of enrolled students.");
		System.out.println("Enter 3 to get students' details based on their grades.");
		System.out.println("Enter 4 to exit.");
		while(i!=4)
		{
			System.out.println("Kindly enter your option.");
			i=sc.nextInt();
			int counter=0;
				if(i==1)
				{
					int depcho;
					Student a= new Student();
					System.out.println("Enter the number corresponding to the desired branch.");
					System.out.println("1-CSE");
					System.out.println("2-MECH");
					System.out.println("3-ECE");
					depcho=sc.nextInt();
					if(depcho>0 & depcho<4)
					{
						System.out.println("Enter the name of the Student.");
						String name=sc.next();
						System.out.println("Enter the percentage of the Student.");
						int percentage=sc.nextInt();
						System.out.println("Enter the Roll Number of the Student.");
						int roll=sc.nextInt();
						boolean check = false;
						//Checking for options
						if(depcho==1)
						{
							check=a.enrollStudent(name,percentage,roll,"CSE");
						}
						if(depcho==2)
						{
							check=a.enrollStudent(name,percentage,roll,"MECH");
						}
						if(depcho==3)
						{
							check=a.enrollStudent(name,percentage,roll,"ECE");
						}
						if(check==true)
						{
							System.out.println("Student has been added to the Department.");
							counter=counter+1;
						}
					}
				}
				if(i==2)
				{
					int depcho;
					String name;
					Student a= new Student();
					System.out.println("Enter the number corresponding to the desired branch.");
					System.out.println("1-CSE");
					System.out.println("2-MECH");
					System.out.println("3-ECE");
					depcho=sc.nextInt();
					if(depcho>0 & depcho<4)
					{
						ArrayList<String> cse = new ArrayList<String>(); 
						ArrayList<String> mech = new ArrayList<String>(); 
						ArrayList<String> ece = new ArrayList<String>(); 
						
						 
						//Checking for options
						if(depcho==1)
						{
							cse=a.getStudentsByDepartment("CSE");
							if(cse.size()>0)
							{	
							for ( int i1 = 0 ; i1 < cse.size(); i1++)
				            {
				                if(i1 == 0 )
				                System.out.println("Name\t  Department");
				                System.out.println(cse.get(i1)+"\t"+"CSE");
				            }
							}
							else
							{
								System.out.println("The CSE department is empty.");
							}
						}
						if(depcho==2)
						{
							mech=a.getStudentsByDepartment("MECH");
							if(mech.size()>0)
							{
							for ( int i1 = 0 ; i1 < mech.size(); i1++)
				            {
				                if(i1 == 0 )
				                System.out.println("Name\t Department");
				                System.out.println(mech.get(i1)+"\t"+"MECH");
				            }
							}
							else
							{
								System.out.println("The MECH department is empty.");
							}
						}
						if(depcho==3)
						{
							ece=a.getStudentsByDepartment("ECE");
							if(ece.size()>0)
							{	
							for ( int i1 = 0 ; i1 < ece.size(); i1++)
				            {
				                if(i1 == 0 )
				                System.out.println("Name\t  Department");
				                System.out.println(ece.get(i1)+"\t"+"ECE");
				            }
							}
							else
							{
								System.out.println("The ECE department is empty.");
							}
						}	
					}
				}
				if(i==3)
				{
					int depcho;
					Student a= new Student();
					System.out.println("Enter the number corresponding to the desired branch.");
					System.out.println("1-CSE");
					System.out.println("2-MECH");
					System.out.println("3-ECE");
					depcho=sc.nextInt();
					if(depcho>0 & depcho<4)
					{
						if(depcho==1)
						{
							a.displayStudents("CSE");
						}
						if(depcho==2)
						{
							a.displayStudents("MECH");
						}
						if(depcho==3)
						{
							a.displayStudents("ECE");
						}
					}
				}
		}
		System.out.println("Have a nice day.");
	}
}		
