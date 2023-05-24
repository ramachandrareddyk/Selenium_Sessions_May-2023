package seleniumSessions;

public class XpathConcept1 {

	public static void main(String[] args) {
	//xpath Axes methods
		
		//1. Following
		
		//input[@type='password']//following::input[1]
		
		//input[@type='password']//following::button
		
		//2. Ancestor
		
		//b[text()='Testing']//ancestor::div
		
		//input[@type='password']//ancestor::div
		
		//3. child - selects all the children elements of the current node
		
		//*[@class='row featured-boxes']//child::a
		
		//div[@id='globalContainer']//child::button
		
		//4. Preceding- select all the nodes before the current node
		
		//div[@id='globalContainer']//preceding::button
		
		//input[@type='submit']//preceding::input
		
		//5. Following sibling
		//input[@type='submit']//following-sibling::input
		
		//6. Preceding-sibling
		//input[@type='reset']//preceding-sibling::input

	}

}
