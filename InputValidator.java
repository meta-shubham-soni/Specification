
public class InputValidator {
	
	public static boolean isInt(String val){
	    try
	    {
	        Integer.parseInt(val);
	        return true;
	    } catch (NumberFormatException ex)
	    {
	    	System.out.println("Please enter integer");
	        return false;
	    }
	    
	}
	
	public static boolean isFloat(String val){
	    try
	    {
	        Float.parseFloat(val);
	        return true;
	    } catch (NumberFormatException ex)
	    {
	    	System.out.println("Please enter float");
	        return false;
	    }
	    
	}
	
	public static boolean isDouble(String val){
	    try
	    {
	        Double.parseDouble(val);
	        return true;
	    } catch (NumberFormatException ex)
	    {
	    	System.out.println("Please enter double");
	        return false;
	    }
	    
	}
	
}
