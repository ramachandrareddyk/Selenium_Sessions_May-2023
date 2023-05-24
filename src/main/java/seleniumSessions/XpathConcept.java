package seleniumSessions;

public class XpathConcept {

	public static void main(String[] args) {
		//Xpath is XML path used to navigate the HTML stracture of the page
		
		//When general locaters are not finding an element we have to use xpath
		
		//Xpath syntax
		
		//xpath=  //tagname[@attribute='value']   use * insted of tagname
		
		
		//   //=Select current node
		//	 tagname= input, div, img, src td, tr, tbody
		//   @ = Select attribute
		//   attribute= attribute name
		//   value= value of the attribute
		
		//types of xpath
		//1. Absolute Xpath - Direct Way to findout the element
		
		// Starts with /
		//starting nodepoint is HTML
		//ex: /html/body/form/table/tbody/tr[1]/td[2]/input
		
		//2. Relative Xpath  - Starts from middile of the DOM stracture
		//Starts with //
		
		//Basic Xpath
		//-----------
		//Ex: //input[@name='uid']
		
		//Contains()
		//When attribute values are changeing dynamically we have to use contains method
		
		//Ex: //button[contains(@id,'u_0_5_')]
		
		//ex: //label[contains(@id,'message')]
		
		
		//Using OR & AND
		//OR
		//EX: //input[@name='uid' or @type='text']
		//AND
		//Ex://input[@name='uid' and @type='text']
		
		//Starts-with
		
		//Ex: //label[starts-with(@id,'message')]
		
		//text:
		//td[text()='Password']
		
		//td[contains(text(),'Password')]
		

	}

}
