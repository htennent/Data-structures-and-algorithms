/**
 * 
 */
package helloWorld;

/**
 * @author Harry
 *
 */
public class HelloWorld {
	
	private String name;
	
	public HelloWorld(String name)
	{
		super();
		if(name != "")
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
		HelloWorld obj1 = new HelloWorld("Harry");
		obj1.sayName();
	}

}

