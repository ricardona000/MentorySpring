package mentory.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	// What are the beans?
	// What are the dependencies of a bean?
	// Where to search for beans?

	public static void main(String[] args) {
		/*BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
		int result = binarySearch.binarySearch(new int[] {12, 4, 6}, 3);
		System.out.println("Result = " + result);*/

		// Application Context
		ApplicationContext applicationContext = SpringApplication.run(Application.class, args);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);
		System.out.println("BinarySearch: " + binarySearch);
		System.out.println("BinarySearch1: " + binarySearch1);
		int result = binarySearch.binarySearch(new int[] {12, 4, 6}, 3);
		System.out.println("Result = " + result);
	}

}
