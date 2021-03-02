//import java.lang.*;

public class Marksheet {
	
	/**
	 * Find average of grades present in grades array
	 * @param array of grades 
	 * @return average 
	 **/
	public float averageOfGrades(float[] grades) throws ArithmeticException{
		float ans = 0;
		for(int i=0;i<grades.length;i++){
			ans += grades[i];
		}
		try{
			ans = ans/grades.length;
		}
		catch(ArithmeticException e){
			e.printStackTrace();
			return 0;
		}
		return ans;
	}
	
	/**
	 * Find maximum of grades present in grades array
	 * @param array of grades 
	 * @return maximum 
	 **/
	public float maximumInGrades(float[] grades){
		float ans = Float.MIN_VALUE;
		for(int i=0;i<grades.length;i++){
			if(ans < grades[i])
				ans = grades[i];
		}
		return ans;
	}
	
	
	/**
	 * Find minimum of grades present in grades array
	 * @param array of grades 
	 * @return minimum 
	 **/
	public float minimumInGrades(float[] grades){
		float ans = Float.MAX_VALUE;
		for(int i=0;i<grades.length;i++){
			if(ans > grades[i])
				ans = grades[i];
		}
		return ans;
	}
	
	/**
	 * Find passed percentage of students present in grades array
	 * @param array of grades 
	 * @return passed percentage of students
	 **/
	public float passedPercentage(float[] grades) throws ArithmeticException{
		int passedNoOfStudents = 0;
		int totalNoOfStudents = grades.length;
		float ans = 0;
		for(int i=0;i<totalNoOfStudents;i++){
			if(grades[i] >= 40)
				passedNoOfStudents++;
		}
		try{
			ans = (passedNoOfStudents*100)/totalNoOfStudents;
		}
		catch(ArithmeticException e){
			e.printStackTrace();
			return 0;
		}
		return ans;
	}
}
