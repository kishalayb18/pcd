@SpringBootApplication

// Main class

// Implementing CommandLineRunner interface
public class SpringBootAppApplication implements CommandLineRunner
{
	// Method 1

	// run() method for springBootApplication to execute
	@Override
	public void run(String args[]) throws Exception
	{
		// Print statement when method is called
		System.out.println("HEllo PCD V1");
	}

	// Method 2
	
	// Main driver method
	public static void main(String[] args)
	{
		// Calling run() method to execute
		// SpringBootApplication by

		// invoking run() inside main() method
		SpringApplication.run(SpringBootAppApplication.class, args);
	}
}
