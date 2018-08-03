/**
 * 
 */
package helloWorld;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Harry
 *
 */
public class HelloWorld {
	
	private String name;
	private Pattern namePattern = Pattern.compile("[^a-zA-Z ]");
	
	public HelloWorld(String name)
	{
		super();
		if(name == "") 
		{
			throw new NullPointerException("Name must not be null");
		}
		else if(namePattern.matcher(name).find())
		{
			
			throw new IllegalArgumentException("Name cannot contain numbers or special characters");
		}
		else
		{
			this.name = name;
		}
	}
	
	public void sayName()
	{
		String output = String.format("Hello %s, this is your Hello World application", this.name);
		System.out.print(output);
	}
	
	public static void main(String[] args)
	{
		HelloWorld obj1 = new HelloWorld("Harry Tennent ");
		obj1.sayName();
		
		
	}

}

