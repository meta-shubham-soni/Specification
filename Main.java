import java.util.Scanner;


public class Main {

	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);		
		boolean flag = true;

		while(flag == true){
		    String in;

		    System.out.println("1. String Driver");
		    System.out.println("2. Marksheet Driver");
		    System.out.println("3. Area Driver");
		    System.out.println("4. Exit");
		    
		    in = sc.nextLine();
		    if(InputValidator.isInt(in)){
		    	int input = Integer.parseInt(in);
			    if(input == 1){
			    	stringDriver();
			    }
			    else if(input == 2){
			    	marksheetDriver();
			    }
			    else if(input == 3){
			    	areaDriver();
			    }
			    else if(input == 4){
			        
			    	flag = false;
			    }
	
			    else {
			    	System.out.println("Enter valid choice");
			    }
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
		String size = sc.nextLine();
		if(!InputValidator.isInt(size)){
			System.out.println("Please enter a valid input!");
			
			return;
		}
		int n = Integer.parseInt(size);
		float[] grades = new float[n];
		System.out.println("Enter grades of all students");
		for(int i=0;i<n;i++){
			String in = sc.nextLine();
			
			if(InputValidator.isFloat(in)){
				float t = Float.parseFloat(in);
				grades[i] = t;
			}
			else{
				System.out.println("Please enter a valid input!");
				i--;
			}
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
			String choice;

		    System.out.println("1. Find triange area");
		    System.out.println("2. Find rectange area");
		    System.out.println("3. Find square area");
		    System.out.println("4. Find circle area");
		    System.out.println("5. Exit");
		    
		    choice = sc.nextLine();
		    if(!InputValidator.isInt(choice))
		    	continue;
		    
		    int in = Integer.parseInt(choice);
		    if(in == 1){
		    	System.out.println("Enter base & height:-");
		    	String b = sc.nextLine();
		    	String h = sc.nextLine();
		    	if(InputValidator.isDouble(b) && InputValidator.isDouble(h)){
			        double base = Double.parseDouble(b);
			        double height = Double.parseDouble(h);
		    		System.out.println(a.triangle(base, height));
		    	}
		    }
		    else if(in == 2){
		    	System.out.println("Enter Length & Breadth:-");
		    	String l = sc.nextLine();
		    	String b = sc.nextLine();
		    	if(InputValidator.isDouble(l) && InputValidator.isDouble(b)){
			        double length = Double.parseDouble(l);
			        double breadth = Double.parseDouble(b);
		    		System.out.println(a.rectangle(length, breadth));
		    	}
		    }
		    else if(in == 3){
		    	System.out.println("Enter side:-");
		    	String s = sc.nextLine();
		    	if(InputValidator.isDouble(s)){
		    		double side = Double.parseDouble(s);
		    		System.out.println(a.square(side));
		    	}
		    }
		    else if(in == 4){
		    	System.out.println("Enter radius:-");
		    	String r = sc.nextLine();
		    	if(InputValidator.isDouble(r)){
		    		double radius = Double.parseDouble(r);
		    		System.out.println(a.Circle(radius));
		    	}
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
