
public class Strings {
	
	/**
	 * Find if two strings are equal of not
	 * @param first string s1
	 * @param second string s2 
	 * @return true if s1 == s2 else false
	 **/
	public int isEqual(String s1,String s2){
		int len1 = s1.length();
		int len2 = s2.length();
		if(len1 != len2)
			return 0;
		
		for(int i=0;i<len1;i++){
			if(s1.charAt(i) != s2.charAt(i)){
				return 0;
			}
		}
		return 1;
	}
	
	/**
	 * Find reverse of string
	 * @param string s1
	 * @return reverse of s1
	 **/
	public String reverse(String s1){
		String ans = "";
		for(int i=s1.length()-1;i>=0;i--)
			ans += s1.charAt(i);
		return ans;
	}
	
	/**
	 * Find toggleCase of string
	 * toggleCase :- convert lower to upper & upper to lower
	 * @param string s1
	 * @return toggleCase of s1
	 **/
	public String toggleCase(String s){
		String ans = "";
		for(int i=0;i<s.length();i++){
			if(s.charAt(i) >= 65 && s.charAt(i) <= 90){
				ans += Character.toLowerCase(s.charAt(i));
			}
			else if(s.charAt(i) >= 97 && s.charAt(i) <= 122){
				ans += Character.toUpperCase(s.charAt(i));
			}
			else{
				ans += s.charAt(i);
			}
		}
		return ans;
	}
	
	/**
	 * Find total number of words in string
	 * @param string s
	 * @return number of words in s
	 **/
	public int countNoOfWords(String s){
		int count = 1;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i) == ' ' && i >0 && i< s.length()-1 && s.charAt(i-1) != ' ' && s.charAt(i+1) != ' ' )
				count++;
		}
		return count;
	}
}
