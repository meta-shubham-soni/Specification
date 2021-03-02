
public class Area {
	
	/**
	 * Find area of triangle.
	 * @param measurement of base
	 * @param measurement of height
	 * @return area of triangle 
	 **/
	public double triangle(double base,double height) throws ArithmeticException{
		double ans = 0;
		try{
			ans = (base * height)/2;
		}
		catch(ArithmeticException e){
			e.printStackTrace();
			return 0;
		}
		return ans;
	}
	
	/**
	 * Find area of rectangle.
	 * @param measurement of length
	 * @param measurement of breadth
	 * @return area of rectangle 
	 **/
	public double rectangle(double length,double breadth) throws ArithmeticException{
		double ans = 0;
		try{
			ans = (length * breadth);
		}
		catch(ArithmeticException e){
			e.printStackTrace();
			return 0;
		}
		return ans;
	}
	
	/**
	 * Find area of square.
	 * @param measurement of side
	 * @return area of square 
	 **/
	public double square(double side) throws ArithmeticException{
		double ans = 0;
		try{
			ans = (side * side);
		}
		catch(ArithmeticException e){
			e.printStackTrace();
			return 0;
		}
		return ans;
	}
	
	/**
	 * Find area of circle.
	 * @param measurement of radius
	 * @return area of circle 
	 **/
	public double Circle(double radius) throws ArithmeticException{
		double ans = 0;
		try{
			ans = 2*3.14*(radius * radius);
		}
		catch(ArithmeticException e){
			e.printStackTrace();
			return 0;
		}
		return ans;
	}
}
