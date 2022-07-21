package Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Aulas_Base.BaseTest;
import Pages.HomePage1;
import Pages.LoginClass;
import Pages.UserManagementPage1;
import Util.TestUtil;

public class UserManagementTest1 extends BaseTest{
	LoginClass LC;
	HomePage1 HP;
	TestUtil testUtil;
	
	UserManagementPage1 UM;
    public UserManagementTest1()
	{
		super();
	}
    @BeforeMethod
	public void setup() throws InterruptedException
	{
		initilization();
		UM = new UserManagementPage1();
		LC = new LoginClass();
		
		HP = LC.newLogin(prop.getProperty("username"),prop.getProperty("password"));

}
    @Test(priority=1)
    public void OverAllStatus()
    {
    	wait(2000);
    	UM.OverAllStatus();
    }
    
}

