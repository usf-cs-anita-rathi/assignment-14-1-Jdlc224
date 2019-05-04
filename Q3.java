
public class Q3 {

	public static boolean contains(String haystack, String needle)
	{
		if(haystack.length() < needle.length())
		{
			return false;
		}
		else
		{
			boolean containsCheck =false;
			for(int x = 0; x < needle.length(); x++)
			{
				if(haystack.charAt(x) != needle.charAt(x))
					if((x + 1) == needle.length())
						{
						containsCheck = false;
						break;
						}
					else
						break;
				else
					if((x + 1) == needle.length())
					{
						containsCheck = true;
						break;
					}
					else
						continue;
			}
			char[] letterStack = new char[(haystack.length()-1)];

			for(int y = 1; y < letterStack .length; y++)
			{
				letterStack[y - 1] = haystack.charAt(y);
			}
	
			String newHaystack = new String(letterStack);
			
			if(containsCheck == false)
				return contains(newHaystack, needle);
			else
				return true;
		}
	}
	
	public static void main(String args[])
	{
		System.out.println("Java Programming containing ogr is "+ contains("Java programming", "ogr"));
		System.out.println("Java Programming containing grammy is "+ contains("Java programming", "grammy"));

	}
}
