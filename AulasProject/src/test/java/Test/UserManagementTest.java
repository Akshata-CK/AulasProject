package Test;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Aulas_Base.BaseTest;
import Pages.HomePage1;
import Pages.LoginClass;

import Pages.UserManagementPage;

import Util.TestUtil;
public class UserManagementTest extends BaseTest
{
	LoginClass LC;
	HomePage1 HP;
	TestUtil testUtil;
	
	UserManagementPage UM;
    public UserManagementTest()
	{
		super();
	}
    @BeforeMethod
	public void setup() throws InterruptedException
	{
		initilization();
		UM = new UserManagementPage();
		LC = new LoginClass();
		UM = new UserManagementPage();
		HP = LC.newLogin(prop.getProperty("username"),prop.getProperty("password"));
		
}

	/*
			@AfterMethod
			public static void takeScreenshotAtEndOfTest() throws IOException, InterruptedException
			{
			// Take screenshot and store as a file format
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			String currentDir = System.getProperty("user.dir");
			// now copy the screenshot to desired location using copyFile //method
			FileUtils.copyFile(src, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));



			//FileUtils.copyFile(src, ----->
			// new File("C:\\Users\\Bhargav\\git\\repository\\Aulas_Project\\screenshots" + fileName + "_"+".jpg"));
			Thread.sleep(5000);
			driver.quit();

			}
			
			@AfterTest
				public void Teardown()
				{
					driver.quit();
				}

*/
				
	 
 
	
	/* 
	@Test(priority=1,groups="Student Creations")
		public void ClickUserManagement() throws InterruptedException
		{
		SoftAssert Assert=new SoftAssert();
		 String expectedtitle="Abcdf";
		 String actualtitle=driver.getTitle();
			Thread.sleep(2000);
			UM.ClickUserManagement();
		    Thread.sleep(2000);
		    Assert.assertEquals(expectedtitle,actualtitle);
		}
*/



	//********************** STUDENT CREATIONS ******************
	/*@Test(priority=1,groups="Student Creations")
	public void ClickFee() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='ant-menu-title-content'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='SETTINGS']")).click();
		Thread.sleep(2000);
	}


	@Test(priority=1,groups="Student Creations")
	public void ClickUserManagement() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.ClickUserManagement();
	
	}
	@Test(priority=2,groups="Student Creations")
	public void ClickAddUser() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.ClickAddUser();
	}
	
	@Test(priority=3,groups="Student Creations")
	public void ClickStudent() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.ClickStudent();
	}
	
	
	 @Test(priority=4,groups="Student Creations")
	public void StudentCreation() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.StudentCreation();
		Thread.sleep(2000);
		
	}
	 
	@Test(priority=5,groups="Student Creations")
	public void ClickCancelStudent() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.ClickCancelStudent();
	}
	@Test(priority=6,groups="Student Creations")
	public void ClickIntoMarkStudent() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.ClickIntoMarkStudent();
	}
	@Test(priority=7,groups="Student Creations")
	public void ExistedStudent() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.ExistedStudent();
	}

	

	//************************* TEACHER CREATIONS *************************



	@Test(priority=8,groups="Teacher Creations")
	public void ClickTeacher() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.ClickTeacher();
	}
	@Test(priority=9,groups="Teacher Creations")
	public void TeacherAdminCreation() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.TeacherAdminCreation();
	}
	@Test(priority=10,groups="Teacher Creations")
	public void TeacherPlannerCreation() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.TeacherPlannerCreation();
	}
	@Test(priority=11,groups="Teacher Creations")
	public void TeacherFeeManagerCreation() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.TeacherFeeManagerCreation();
	}
	@Test(priority=12,groups="Teacher Creations")
	public void TeacherInstituteSupportCreation() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.TeacherInstituteSupportCreation();
	} 
	@Test(priority=13,groups="Teacher Creations")
	public void TeacherAdminFeeManagerCreation() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.TeacherAdminFeeManagerCreation();
	}
	@Test(priority=14,groups="Teacher Creations")
	public void TeacherPlannerFeeManagerInstituteSupportCreation() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.TeacherPlannerFeeManagerInstituteSupportCreation();
	}
	@Test(priority=15,groups="Teacher Creations")
	public void ClickCancelTeacher() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.ClickCancelTeacher();
	}
	@Test(priority=16,groups="Teacher Creations")
	public void ClickIntoMarkTeacher() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.ClickIntoMarkTeacher();
	}
	@Test(priority=17,groups="Teacher Creations")
	public void ExistedTeacher() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.ExistedTeacher();
	}



	//*********************** DATA OPERATOR CREATIONS *********************



	@Test(priority=18,groups="Data Operator Creations")
	public void ClickDataOperator() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.ClickDataOperator();
	}
	@Test(priority=19,groups="Data Operator Creations")
	public void DataOperatorAdminCreation() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.DataOperatorAdminCreation();
	}
	@Test(priority=20,groups="Data Operator Creations")
	public void DataOperatorPlannerCreation() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.DataOperatorPlannerCreation();
	}
	@Test(priority=21,groups="Data Operator Creations")
	public void DataOperatorFeeManagerCreation() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.DataOperatorFeeManagerCreation();
	}

	@Test(priority=22,groups="Data Operator Creations")
	public void DataOperatorInstituteSupportCreation() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.DataOperatorInstituteSupportCreation();
	} 
	@Test(priority=23,groups="Data Operator Creations")
	public void DataOperatorAttendenceMarkerCreation() throws InterruptedException
	{
		Thread.sleep(3000);
		UM.DataOperatorAttendenceMarkerCreation();
	} 
	@Test(priority=24,groups="Data Operator Creations")
	public void DataOperatorAdminFeeManagerCreation() throws InterruptedException
	{
		Thread.sleep(3000);
		UM.DataOperatorAdminFeeManagerCreation();
	}
	@Test(priority=25,groups="Data Operator Creations")
	public void DataOperatorExceptAdminCreation() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.DataOperatorExceptAdminCreation();
	}
	@Test(priority=26,groups="Data Operator Creations")
	public void ClickCancelDataOperator() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.ClickCancelDataOperator();
	}
	@Test(priority=27,groups="Data Operator Creations")
	public void ClickIntoMarkDataOperator() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.ClickIntoMarkDataOperator();
	}
	@Test(priority=28,groups="Data Operator Creations")
	public void ExistedDataOperator() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.ExistedDataOperator();
	}

	//*******************    OPERATIONS CREATIONS   ***************



	@Test(priority=29,groups="Operations Creations")
	public void ClickOperation() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.ClickOperation();
	}
	@Test(priority=30,groups="Operations Creations")
	public void OperationAdminCreation() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.OperationAdminCreation();
	}
	@Test(priority=31,groups="Operations Creations")
	public void OperationPlannerCreation() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.OperationPlannerCreation();
	}
	@Test(priority=32,groups="Operations Creations")
	public void OperationFeeManagerCreation() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.OperationFeeManagerCreation();
	}
	@Test(priority=33,groups="Operations Creations")
	public void OperationInstituteSupportCreation() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.OperationInstituteSupportCreation();
	} 
	@Test(priority=34,groups="Operations Creations")
	public void OperationAttendenceMarkerCreation() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.OperationAttendenceMarkerCreation();
	} 
	@Test(priority=35,groups="Operations Creations")
	public void OperationAdminFeeManagerCreation() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.OperationAdminFeeManagerCreation();
	}
	@Test(priority=36,groups="Operations Creations")
	public void OperationExceptAdminCreation() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.OperationExceptAdminCreation();
	}
	@Test(priority=37,groups="Operations Creations")
	public void ClickCancelOperation() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.ClickCancelOperation();
	}
	@Test(priority=38,groups="Operations Creations")
	public void ClickIntoMarkOperation() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.ClickIntoMarkOperation();
	}
	@Test(priority=39,groups="Operations Creations")
	public void ExistedOperation() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.ExistedOperation();
	}

	//**************** STUDENT VIEW MORE **********************
	@Test(priority=40,groups="Student View More")
	public void ClickStudentViewMore() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.ClickStudentViewMore();
	}
	@Test(priority=41,groups="Student View More")
	public void ClickAddUserButton() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.ClickAddUserButton();
	}
	@Test(priority=42,groups="Student View More")
	public void Student1Creation() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.Student1Creation();
	}
	@Test(priority=43,groups="Student View More")
	public void ClickCancelStudent1() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.ClickCancelStudent1();
	}
	@Test(priority=44,groups="Student View More")
	public void ClickIntoMarkStudent1() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.ClickIntoMarkStudent1();
	}
	@Test(priority=45,groups="Student View More")
	public void ExistedStudent1() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.ExistedStudent1();
	}


	//************************* TEACHER VIEW MORE CREATIONS *************************



	@Test(priority=46,groups="Teacher View More")
	public void ClickTeacherViewMore() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.ClickTeacherViewMore();
	}
	@Test(priority=47,groups="Teacher View More")
	public void TeacherAdmin1Creation() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.TeacherAdmin1Creation();
	}
	@Test(priority=48,groups="Teacher View More")
	public void TeacherPlanner1Creation() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.TeacherPlanner1Creation();
	}
	@Test(priority=49,groups="Teacher View More")
	public void TeacherFeeManager1Creation() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.TeacherFeeManager1Creation();
	}
	@Test(priority=50,groups="Teacher View More")
	public void TeacherInstituteSupport1Creation() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.TeacherInstituteSupport1Creation();
	} 
	@Test(priority=51,groups="Teacher View More")
	public void TeacherAdminFeeManager1Creation() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.TeacherAdminFeeManager1Creation();
	}
	@Test(priority=52,groups="Teacher View More")
	public void TeacherPlannerFeeManagerInstituteSupport1Creation() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.TeacherPlannerFeeManagerInstituteSupport1Creation();
	}
	@Test(priority=53,groups="Teacher View More")
	public void ClickCancelTeacher1() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.ClickCancelTeacher1();
	}
	@Test(priority=54,groups="Teacher View More")
	public void ClickIntoMarkTeacher1() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.ClickIntoMarkTeacher1();
	}
	@Test(priority=55,groups="Teacher View More")
	public void ExistedTeacher1() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.ExistedTeacher1();
	}
    

	//************************* DATA OPERATOR VIEW MORE CREATIONS *************************


	@Test(priority=56,groups="Data Operator View More")
	public void ClickDataOperatorViewMore() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.ClickDataOperatorViewMore();
	}
	@Test(priority=57,groups="Data Operator View More")
	public void DataOperatorAdmin1Creation() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.DataOperatorAdmin1Creation();
	}
	@Test(priority=58,groups="Data Operator View More")
	public void DataOperatorPlanner1Creation() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.DataOperatorPlanner1Creation();
	}
	@Test(priority=59,groups="Data Operator View More")
	public void DataOperatorFeeManager1Creation() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.DataOperatorFeeManager1Creation();
	}

	@Test(priority=60,groups="Data Operator View More")
	public void DataOperatorInstituteSupport1Creation() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.DataOperatorInstituteSupport1Creation();
	} 
	@Test(priority=61,groups="Data Operator View More")
	public void DataOperatorAttendenceMarker1Creation() throws InterruptedException
	{
		Thread.sleep(3000);
		UM.DataOperatorAttendenceMarker1Creation();
	} 
	@Test(priority=62,groups="Data Operator View More")
	public void DataOperatorAdminFeeManager1Creation() throws InterruptedException
	{
		Thread.sleep(3000);
		UM.DataOperatorAdminFeeManager1Creation();
	}
	@Test(priority=63,groups="Data Operator View More")
	public void DataOperatorExceptAdmin1Creation() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.DataOperatorExceptAdmin1Creation();
	} 
	@Test(priority=64,groups="Data Operator View More")
	public void ClickCancelDataOperator1() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.ClickCancelDataOperator1();
	}
	@Test(priority=65,groups="Data Operator View More")
	public void ClickIntoMarkDataOperator1() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.ClickIntoMarkDataOperator1();
	}
	@Test(priority=66,groups="Data Operator View More")
	public void ExistedDataOperator1() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.ExistedDataOperator1();
	}  

	//************************* OPERATIONS VIEW MORE CREATIONS *************************

	@Test(priority=67,groups="Operations View More")
	public void ClickOperationViewMore() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.ClickOperationViewMore();
	}

	@Test(priority = 68, groups = "Operations View More")
	public void OperationAdmin1Creation() throws InterruptedException {
		Thread.sleep(2000);
		UM.OperationAdmin1Creation();
	}
	@Test(priority=69,groups="Operations View More")
	public void OperationPlanner1Creation() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.OperationPlanner1Creation();
	}
	@Test(priority=70,groups="Operations View More")
	public void OperationFeeManager1Creation() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.OperationFeeManager1Creation();
	}
	@Test(priority=71,groups="Operations View More")
	public void OperationInstituteSupport1Creation() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.OperationInstituteSupport1Creation();
	} 
	@Test(priority=72,groups="Operations View More")
	public void OperationAttendenceMarker1Creation() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.OperationAttendenceMarker1Creation();
	} 
	@Test(priority=73,groups="Operations View More")
	public void OperationAdminFeeManager1Creation() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.OperationAdminFeeManager1Creation();
	}
	@Test(priority=74,groups="Operations View More")
	public void OperationExceptAdmin1Creation() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.OperationExceptAdmin1Creation();
	} 
	@Test(priority=75,groups="Operations View More")
	public void ClickCancelOperation1() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.ClickCancelOperation1();
	}
	@Test(priority=76,groups="Operations View More")
	public void ClickIntoMarkOperation1() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.ClickIntoMarkOperation1();
	}

	@Test(priority = 77, groups = "Operations View More")
	public void ExistedOperation1() throws InterruptedException {
		Thread.sleep(2000);
		UM.ExistedOperation1();
	}
  
	@Test(priority=78,groups="Approval")
	public void Manualapproval() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.Manualapproval();
	}
	@Test(priority=79,groups="Approval")
	public void Autoapproval() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.Autoapproval();
	}
	@Test(priority=80,groups="Approval")
	public void SettingsIntoMark() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.SettingsIntoMark();
	}
	
	
	@Test(priority=81,groups="Growth Summary")
	public void GrowthSummaryMonth() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.GrowthSummaryMonth();
	} 
	@Test(priority=82,groups="Growth Summary")
	public void GrowthSummaryWeek() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.GrowthSummaryWeek();
	} 
	@Test(priority=83,groups="Growth Summary")
	public void GrowthSummaryWeekCalendar() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.GrowthSummaryWeekCalendar();
	}
	
	@Test(priority=84,groups="Growth Summary")
	public void StudentGrowthSummaryMonth() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.StudentGrowthSummaryMonth();
	} 
	@Test(priority=85,groups="Growth Summary")
	public void StudentGrowthSummaryWeek() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.StudentGrowthSummaryWeek();
	}
	@Test(priority=86,groups="Growth Summary")
	public void StudentGrowthSummaryWeekCalendar() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.StudentGrowthSummaryWeekCalendar();
	}

	@Test(priority = 87, groups = "Growth Summary")
	public void TeacherGrowthSummaryMonth() throws InterruptedException {
		Thread.sleep(2000);
		UM.TeacherGrowthSummaryMonth();
	}
	
	@Test(priority = 88, groups = "Growth Summary")
	public void TeacherGrowthSummaryWeek() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.TeacherGrowthSummaryWeek();
	}
	@Test(priority=89,groups="Growth Summary")
	public void TeacherGrowthSummaryWeekCalendar() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.TeacherGrowthSummaryWeekCalendar();
	}
	@Test(priority=90,groups="Growth Summary")
	public void DataOperatorGrowthSummaryMonth() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.DataOperatorGrowthSummaryMonth();
	}
	@Test(priority=91,groups="Growth Summary")
	public void DataOperatorGrowthSummaryWeek() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.DataOperatorGrowthSummaryWeek();
	} 
	@Test(priority=92,groups="Growth Summary")
	public void DataOperatorGrowthSummaryWeekCalendar() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.DataOperatorGrowthSummaryWeekCalendar();
	}
	@Test(priority=93,groups="Growth Summary")
	public void OperationGrowthSummaryMonth() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.OperationGrowthSummaryMonth();
	}
	@Test(priority=94,groups="Growth Summary")
	public void OperationGrowthSummaryWeek() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.OperationGrowthSummaryWeek();
	} 
	@Test(priority=95,groups="Growth Summary")
	public void OperationGrowthSummaryWeekCalendar() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.OperationGrowthSummaryWeekCalendar();
	} 
	
	@Test(priority = 96, groups = "Registration Request")
	public void UserRequestRedIntoMarkYes() throws InterruptedException {
		Thread.sleep(2000);
		UM.UserRequestRedIntoMarkYes();
	}
	
	@Test(priority = 97, groups = "Registration Request")
	public void UserRequestRedIntoMarkNo() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.UserRequestRedIntoMarkNo();
	}

	@Test(priority=98,groups="Registration Request")
	public void UserRequestGreenRightMarkYes() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.UserRequestGreenRightMarkYes();
	} 
	@Test(priority=99,groups="Registration Request")
	public void UserRequestGreenRightMarkNo() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.UserRequestGreenRightMarkNo();
	}
	@Test(priority=100, groups = "Registration Request")
	public void UserRequestPendingRedIntoMarkYes() throws InterruptedException {
		Thread.sleep(2000);
		UM.UserRequestPendingRedIntoMarkYes();
	}
	
	@Test(priority=101, groups = "Registration Request")
	public void UserRequestPendingRedIntoMarkNo() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.UserRequestPendingRedIntoMarkNo();
	}
	
	@Test(priority=102,groups="Registration Request")
	public void UserRequestPendingGreenRightMarkYes() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.UserRequestPendingGreenRightMarkYes();
	} 
	@Test(priority=103,groups="Registration Request")
	public void UserRequestPendingGreenRightMarkNo() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.UserRequestPendingGreenRightMarkNo();
	}
	
	
	@Test(priority=104,groups="Registration Request")
	public void UserRequestRejectedGreenRightMarkYes() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.UserRequestRejectedGreenRightMarkYes();
	}

	
	@Test(priority=105, groups="Registration Request")
	public void UserRequestRejectedGreenRightMarkNo() throws InterruptedException {
		Thread.sleep(2000);
		UM.UserRequestRejectedGreenRightMarkNo();
	}
	
	@Test(priority=106,groups="Registration Request")
	public void StudentsRequestRejected() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.StudentsRequestRejected();
	}
	@Test(priority=107,groups="Registration Request")
	public void StudentsRequestPending() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.StudentsRequestPending();
	}
	@Test(priority=108,groups="Registration Request")
	public void TeachersRequestRejected() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.TeachersRequestRejected();
	} 
	@Test(priority=109,groups="Registration Request")
	public void TeachersRequestPending() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.TeachersRequestPending();
	}
	@Test(priority=110,groups="Registration Request")
	public void DataOperatorsRequestRejected() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.DataOperatorsRequestRejected();
	}
	@Test(priority=111,groups="Registration Request")
	public void DataOperatorsRequestPending() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.DataOperatorsRequestPending();
	} 
	@Test(priority=112,groups="Registration Request")
	public void OperationsRequestRejected() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.OperationsRequestRejected();
	}
	@Test(priority=113,groups="Registration Request")
	public void OperationsRequestPending() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.OperationsRequestPending();
	}
	@Test(priority=114,groups="Registration Request")
	public void UserRequestSearch() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.UserRequestSearch();
	} 
	@Test(priority=115,groups="Registration Request")
	public void UserRegistrationViewAllBack() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.UserRegistrationViewAllBack();
	} 
	
	 
	 @Test(priority=116,groups="Student Profile")
		public void UpdateStudentInfo() throws InterruptedException
		{
			Thread.sleep(2000);
			UM.UpdateStudentInfo();
		} 
		
	 @Test(priority=117,groups="Student Profile")
		public void UpdateStudentClass() throws InterruptedException
		{
			Thread.sleep(2000);
			UM.UpdateStudentClass();
		}
		
	 @Test(priority=118,groups="Student Profile")
		public void AddCourse() throws InterruptedException
		{
			Thread.sleep(2000);
			UM.AddCourse();
		}
	 
	 @Test(priority=119,groups="Student Profile")
		public void AddNewCourse() throws InterruptedException
		{
			Thread.sleep(2000);
			UM.AddNewCourse();
		}
	 
	 @Test(priority=120,groups="Student Profile")
		public void ShiftCourse() throws InterruptedException
		{
			Thread.sleep(2000);
			UM.ShiftCourse();
		}
	 
	 @Test(priority=121,groups="Student Profile")
		public void AddCourseCancel() throws InterruptedException
		{
			Thread.sleep(2000);
			UM.AddCourseCancel();
		}
	 @Test(priority=122,groups="Student Profile")
		public void AddExistedCourse() throws InterruptedException
		{
			Thread.sleep(2000);
			UM.AddExistedCourse();
		}
	 
	 @Test(priority=123,groups="Student Profile")
		public void CourseDeActivate() throws InterruptedException
		{
			Thread.sleep(2000);
			UM.CourseDeActivate();
		}
	 @Test(priority=124,groups="Student Profile")
		public void CourseActivate() throws InterruptedException
		{
			Thread.sleep(2000);
			UM.CourseActivate();
		}
	 @Test(priority=125,groups="Student Profile")
		public void CourseStartDateUpdate() throws InterruptedException
		{
			Thread.sleep(2000);
			UM.CourseStartDateUpdate();
		}
	 @Test(priority=126,groups="Student Profile")
		public void CourseOpenCancel() throws InterruptedException
		{
			Thread.sleep(2000);
			UM.CourseOpenCancel();
		}
	 @Test(priority=127,groups="Student Profile")
		public void CourseOpenDeleteYes() throws InterruptedException
		{
			Thread.sleep(2000);
			UM.CourseOpenDeleteYes();
		}
	 @Test(priority=128,groups="Student Profile")
		public void CourseDeleteNo() throws InterruptedException
		{
			Thread.sleep(2000);
			UM.CourseDeleteNo();
		}
	 */
	 
	 
	 @AfterMethod
		public void Teardown()
		{
			driver.quit();
		}
	
}

