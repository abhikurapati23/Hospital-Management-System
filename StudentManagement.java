
package pro;
import java.util.ArrayList;

public interface StudentManagement {
	
	public boolean enrollStudent(String student,int percentage,int roll, long deptName);
	public ArrayList<String> getStudentsByDepartment(String deptName);
	public void displayStudents(String deptName);
}