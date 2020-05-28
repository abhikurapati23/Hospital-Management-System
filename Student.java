package pro;
import java.util.ArrayList;
import java.util.Collections;

class StudentAlreadyExistsException extends Exception
{}


public class Student extends Department implements StudentManagement{
	 private long studentID;
	 private String studentName;
	 private int creditScore;
	 private static ArrayList<String> cse = new ArrayList<String>();
	 private static ArrayList<String> mech = new ArrayList<String>();
	 private static ArrayList<String> ece = new ArrayList<String>(); 
	 
	 private static ArrayList<Integer> cse_marks = new ArrayList<Integer>(); 
	 private static ArrayList<Integer> mech_marks = new ArrayList<Integer>();
	 private static ArrayList<Integer> ece_marks = new ArrayList<Integer>(); 
	 
	 private static ArrayList<Integer> cse_roll = new ArrayList<Integer>(); 
	 private static ArrayList<Integer> mech_roll = new ArrayList<Integer>();
	 private static ArrayList<Integer> ece_roll = new ArrayList<Integer>(); 
	 
	public boolean enrollStudent(String name,int percentage, int roll, String string) 
	{
		studentName=name;
		creditScore=percentage;
		studentID=roll;
		try
		{
		if(string=="CSE")
		{
			if(cse.contains(name))
			{
				throw new StudentAlreadyExistsException();
			}
			
			else
			{
			cse.add(studentName);
			cse_marks.add(creditScore);
			cse_roll.add((int) studentID);
			return true;
			}
		}

		if(string=="MECH")
		{
			if(mech.contains(name))
			{
				throw new StudentAlreadyExistsException();
			}
			else
			{
			mech.add(studentName);
			mech_marks.add(creditScore);
			mech_roll.add((int) studentID);
			return true;
			}
		}
		if(string=="ECE")
		{
			if(ece.contains(name))
			{
				throw new StudentAlreadyExistsException();
			}
			else
			{
			ece.add(studentName);
			ece_marks.add(creditScore);
			ece_roll.add((int) studentID);
			return true;
			}
		}
		}
		catch(StudentAlreadyExistsException e)
        {
            System.out.println("Student already exists and thus can't be added to the department.");
        }
		return false;
	}
	
	public ArrayList<String> getStudentsByDepartment(String deptName) 
	{
		if(deptName=="CSE")
		{
				return cse;
		}
		
		if(deptName=="MECH")
		{
				return mech;
		}
		
		if(deptName=="ECE")
		{
				return ece;
		}
		return null;
	}
	
	public void displayStudents(String deptName) 
	{	 
		if(deptName=="CSE")
		{
			if(cse.size()>0)
			{
			for ( int i = 0 ; i < cse.size(); i++)
            {
				for (int j = 0 ; j < cse.size()-1 ; j++)
				{
					if(cse_marks.get(j) < cse_marks.get(j+1))
					{
						Collections.swap(cse, j, j+1);
						Collections.swap(cse_roll, j, j+1);
						Collections.swap(cse_marks, j, j+1);
					}
				}
			}
			for ( int i = 0 ; i < cse.size(); i++)
            {
                if(i == 0 )
                System.out.println("Id\t Name\t CGPA\t Department");
                System.out.println(cse_roll.get(i)+"\t"+cse.get(i)+"\t"+cse_marks.get(i)+"\t"+"CSE");
            }
			}
			else
			{
				System.out.println("The CSE Department is empty.");
			}
		}
		
		if(deptName=="MECH")
		{	
			if(mech.size()>0)
			{
			for ( int i = 0 ; i < mech.size(); i++)
			{
				for (int j = 0 ; j < mech.size()-1 ; j++)
				{
					if(mech_marks.get(j) < mech_marks.get(j+1))
					{
					Collections.swap(mech, j, j+1);
					Collections.swap(mech_roll, j, j+1);
					Collections.swap(mech_marks, j, j+1);
					}
				}
			}
			for ( int i = 0 ; i < mech.size(); i++)
            {
                if(i == 0 )
                System.out.println("Id\t Name\t CGPA\t Department");
                System.out.println(mech_roll.get(i)+"\t"+mech.get(i)+"\t"+mech_marks.get(i)+"\t"+"MECH");
            }
			}
			else
			{
				System.out.println("The MECH Department is empty.");
			}
		}
		
		if(deptName=="ECE")
		{
			if(ece.size()>0)
			{
			for ( int i = 0 ; i < ece.size(); i++)
            {
				for (int j = 0 ; j < ece.size()-1 ; j++)
				{
					if(ece_marks.get(j) < ece_marks.get(j+1))
					{
						Collections.swap(ece, j, j+1);
						Collections.swap(ece_roll, j, j+1);
						Collections.swap(ece_marks, j, j+1);
					}
				}
			}
			for ( int i = 0 ; i < ece.size(); i++)
            {
                if(i == 0 )
                System.out.println("Id\t Name\t CGPA\t Department");
                System.out.println(ece_roll.get(i)+"\t"+ece.get(i)+"\t"+ece_marks.get(i)+"\t"+"ECE");
            }
			}
			else
			{
				System.out.println("The ECE Department is empty.");
			}
		}
	}

	@Override
	public boolean enrollStudent(String student, int percentage, int roll, long deptName) {
		return false;
	}	 
}

