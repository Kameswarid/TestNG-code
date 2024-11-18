package dataprovider;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegistrationPage {
	
	@Test(dataProvider= "list")
	public void display(String Username,String password,String Fname,String Lname,String Gender)
	{
		System.out.println("User name = ---> "+ Username);
		System.out.println("Password---> "+password);
		System.out.println("First name---> " +Fname);
		System.out.println("Last name---> "+ Lname);
		System.out.println("Gender---> "+Gender);
		//System.out.println();
	}
@DataProvider(name= "list")

public Object[][] reg()
{
	Object data[][]=new Object[10][5];
	data[0][0]= "ram@gmail.com";
	data[0][1]="r123";
	data[0][2]="Ram";
	data[0][3]="Dasa";
	data[0][4]="M";
	
	data[1][0]="laxman@gmail.com";
	data[1][1]="l123";
	data[1][2]="Laxman";
	data[1][3]="Dasa";
	data[1][4]="M";
	
	
	data[2][0]="Hanuma@gmail.com";
	data[2][1]="h123";
	data[2][2]="Hanuma";
	data[2][3]="Vanara";
	data[2][4]="M";
	
	data[3][0]="Sugreeva@gmail.com";
	data[3][1]="s123";
	data[3][2]="Sugreeva";
	data[3][3]="Dasa";
	data[3][4]="M";
	
	data[4][0]="Bharata@gmail.com";
	data[4][1]="b123";
	data[4][2]="Bharata";
	data[4][3]="Dasa";
	data[4][4]="M";
	
	data[5][0]="Sita@gmail.com";
	data[5][1]="s123";
	data[5][2]="Sita";
	data[5][3]="Dasa";
	data[5][4]="F";
	
	data[6][0]="Kousalya@gmail.com";
	data[6][1]="k123";
	data[6][2]="Kousalya";
	data[6][3]="Dasa";
	data[6][4]="F";
	
	data[7][0]="Kaikeyi@gmail.com";
	data[7][1]="k123";
	data[7][2]="Kaikeyi";
	data[7][3]="Dasa";
	data[7][4]="F";
	
	
	data[8][0]="Sumitra@gmail.com";
	data[8][1]="s123";
	data[8][2]="Sumitra";
	data[8][3]="Dasa";
	data[8][4]="F";
	
	data[9][0]="Dasaratha@gmail.com";
	data[9][1]="d123";
	data[9][2]="Dasaratha";
	data[9][3]="Dasa";
	data[9][4]="M";
	return data;
			
}
}
