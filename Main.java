import java.util.Scanner;


public class Main {

	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);		
		boolean flag = true;

		while(flag == true){
		    int in;

		    System.out.println("1. String Driver");
		    System.out.println("2. Marksheet Driver");
		    System.out.println("3. Area Driver");
		    System.out.println("4. Exit");
		    
		    in = sc.nextInt();
		    
		    if(in == 1){
		    	stringDriver();
		    }
		    else if(in == 2){
		    	marksheetDriver();
		    }
		    else if(in == 3){
		    	areaDriver();
		    }
		    else if(in == 4){
		        
		    	flag = false;
		    }

		    else {
		    	System.out.println("Enter valid choice");
		    }
		}
	}
	
	public static void stringDriver(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s1 = sc.nextLine();
		Strings s = new Strings();
		System.out.println("Reverse of String:-");
		System.out.println(s.reverse(s1));
		System.out.println("Togglecase of String:-");
		System.out.println(s.toggleCase(s1));
		System.out.println("Total number of words in String:-");
		System.out.println(s.countNoOfWords(s1));
		System.out.println("Compare a string:-");
		System.out.println("Enter another string");
		String s2 = sc.nextLine();
		System.out.println(s.isEqual(s1,s2));
	}
	
	public static void marksheetDriver(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of students");
		int n = sc.nextInt();
		float[] grades = new float[n];
		System.out.println("Enter grades of all students");
		for(int i=0;i<n;i++){
			float t = sc.nextFloat();
			grades[i] = t;
		}
		
		Marksheet m = new Marksheet();
		System.out.println("Maximum grade:-");
		System.out.println(m.maximumInGrades(grades));
		System.out.println("Minimum grade:-");
		System.out.println(m.minimumInGrades(grades));
		System.out.println("Average of grades:-");
		System.out.println(m.averageOfGrades(grades));
		System.out.println("Find percentage of passed students:-");
		System.out.println(m.passedPercentage(grades));
	}
	
	public static void areaDriver(){
		Scanner sc = new Scanner(System.in);
		Area a = new Area();
		while(true){
			int in;

		    System.out.println("1. Find triange area");
		    System.out.println("2. Find rectange area");
		    System.out.println("3. Find square area");
		    System.out.println("4. Find circle area");
		    System.out.println("5. Exit");
		    
		    in = sc.nextInt();
		    
		    if(in == 1){
		    	System.out.println("Enter base & height:-");
		    	double b = sc.nextDouble();
		    	double h = sc.nextDouble();
		    	System.out.println(a.triangle(b, h));
		    }
		    else if(in == 2){
		    	System.out.println("Enter length & breadth:-");
		    	double l = sc.nextDouble();
		    	double b = sc.nextDouble();
		    	System.out.println(a.rectangle(l, b));
		    }
		    else if(in == 3){
		    	System.out.println("Enter side:-");
		    	double s = sc.nextDouble();
		    	System.out.println(a.square(s));
		    }
		    else if(in == 4){
		    	System.out.println("Enter radius:-");
		    	double r = sc.nextDouble();
		    	System.out.println(a.Circle(r));
		    }
		    else if(in == 5){
		        
		    	break;
		    }
		    else {
		    	System.out.println("Enter valid choice");
		    }

		}
	}
}
