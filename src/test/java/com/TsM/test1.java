package com.TsM;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class test1 {

	public static WebDriver dv;
	public static int result;
		@Test(description="Verify that the results match the search criteria")
	public void firstTestCase() throws InterruptedException, AWTException
	{
		//System.out.println("Come");


		if(result==0)
		{
			Assert.assertEquals(1,1);
		}
		else
		{Assert.assertEquals(1,2);}
		
			
		//dv.close();
	}
		
		@Test(description="Verify that the results and details page match the extra filters")

		public void secondTestCase() throws InterruptedException, AWTException
		{
	//		firstTestCase();
			
		dv.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/div/div[1]/main/div/div[1]/div[1]/div[1]/div/div[2]/div/div/div/div[1]/div/div/span/div/div[2]/div/div[5]/button/span[1]")).click();
Thread.sleep(3000);

int bedrooms=5;
int count4=0;
while(count4<bedrooms)
{
dv.findElements(By.className("_7hhhl3")).get(3).click();
//System.out.println(dv.findElements(By.className("_7hhhl3")).get(1).getAttribute("id"));
count4=count4+1;
}

List<WebElement> facilities = dv.findElements(By.className("_py3ty1"));

int count5=0;

while(count5<facilities.size())
{
if(facilities.get(count5).getText().equalsIgnoreCase("Pool"))
{
facilities.get(count5).click();
count5=facilities.size();

}

count5=count5+1;

}

dv.findElement(By.className("_m095vcq")).click();
Thread.sleep(20000);


//Verification
int result2=0;

List<WebElement> searchresults2 = dv.findElements(By.className("_12oal24"));
int size=searchresults2.size();
int count6=0;
while(count6<size)
{
System.out.println(searchresults2.size());
System.out.println(searchresults2.get(count6).findElements(By.className("_3hmsj")).get(1).getText());



String str12;
String str22[];

str12=searchresults2.get(count6).findElements(By.className("_3hmsj")).get(1).getText().toString();
str22=str12.split(" ");

String str32=str22[0].trim();

int total=Integer.parseInt(str32);
System.out.println("here is"+ total);

if(total<bedrooms)
{
	result2=result2+1;
	}


count6=count6+1;
}

List<WebElement> searchresults3 = dv.findElements(By.className("_15tommw"));

System.out.println("Good");
searchresults3.get(0).click();
System.out.println("Good");
Thread.sleep(50000);


//Robot robot=new Robot();

/*int count9=0;
while(count9<44)
{
	robot.keyPress(KeyEvent.VK_DOWN);
	robot.keyRelease(KeyEvent.VK_DOWN);	
count9=count9+1;
}*/


//Thread.sleep(5000);
ArrayList<String> tabs2 = new ArrayList<String> (dv.getWindowHandles());
dv.switchTo().window(tabs2.get(1));
//List<WebElement> amenities = dv.findElements(By.className("b1sec48q"));


//System.out.println("H ere"+amenities.size());
dv.findElement(By.className("b1sec48q")).click();


//JavascriptExecutor js = (JavascriptExecutor) dv;

//js.executeScript("document.getElementById('site-content').click();");
Thread.sleep(3000);
		


		
		
List<WebElement> pool = dv.findElements(By.className("_vzrbjl"));

int count8=0;

while(count8<pool.size())
{
	result2=result2+1;
	
	if(pool.get(count8).getText().contains("pool"))

{
result2=0;
count8=pool.size();

}
count8=count8+1;

		
}

System.out.println("result is "+result2);

if(result2==0)
{
	Assert.assertEquals(1,1);
}
else
{Assert.assertEquals(1,2);}
dv.close();
            dv.switchTo().window(tabs2.get(0));


		}


@Test(description="Verify that a property is displayed on the map correctly")
public void thirdTestCase() throws InterruptedException, AWTException {
	//firstTestCase();
	List<WebElement> searchresults3 = dv.findElements(By.className("_12oal24"));
	System.out.println(searchresults3.get(0).findElement(By.className("_155sga30")).getText());

	String map = searchresults3.get(0).findElement(By.className("_155sga30")).getText().toString();

	List<WebElement> mapelements = dv.findElements(By.className("_1rhps41"));

	int count11 = 0;
	while (count11 < mapelements.size()) {

		if (mapelements.get(count11).getText().equalsIgnoreCase(map)) {
			mapelements.get(count11).click();
			count11 = mapelements.size() + 1;

		}

		count11 = count11 + 1;


	}

	Thread.sleep(7000);


	List<WebElement> mapwindow = dv.findElements(By.className("_9m9ayv"));


//*String a1=mapwindow.get(0).findElement(By.className("_18khxk1")).getText().toString().trim();
//String a8=dv.findElement(By.xpath("//*[@id='ExploreLayoutController']/div/aside/div/div[1]/div/div/div[1]/div[3]/div/div[4]/div[23]/div/div[1]/div/div[2]/div[1]/div/span/span[2]")).getText().toString().trim();
//String a9=dv.findElement(By.xpath("//*[@id='ExploreLayoutController']/div/aside/div/div[1]/div/div/div[1]/div[3]/div/div[4]/div[23]/div/div[1]/div/div[2]/div[1]/div/span/span[3]")).getText().toString().trim();


	String a2 = mapwindow.get(0).findElement(By.className("_1afu10la")).getText().toString().trim();
	String a3 = mapwindow.get(0).findElement(By.className("_1spi1ps9")).getText().toString().trim();
//*	String a4 = mapwindow.get(0).findElement(By.className("_16shi2n")).getText().toString().trim();
	String a5 = mapwindow.get(0).findElement(By.className("_155sga30")).getText().toString().trim();
	String a6 = mapwindow.get(0).findElement(By.className("_ujf3ni")).getText().toString().trim();


//*String a7=dv.findElement(By.xpath("//*[@id='ExploreLayoutController']/div/aside/div/div[1]/div/div/div[1]/div[3]/div/div[4]/div[23]/div/div[1]/div/div[2]/div[4]/div/div/div/span[3]")).getText().toString().trim();
//String a8=a1=dv.findElement(By.xpath("//*[@id=\"ExploreLayoutController\"]/div/aside/div/div[1]/div/div/div[1]/div[3]/div/div[4]/div[23]/div/div[1]/div/div[2]/div[4]/div/div/div/span[3]")).getText().toString().trim();


//String mapstring=a1.replace("\r\n"
	//	+ " ","")+" "+a2.replace("· ","in ")+" "+a3+" "+a4+" "+a5+" "+a6;
	String mapstring = a2.replace("· ", "in ") + " " + a3 + " " + a5 + " " + a6;


	List<WebElement> resultwindow = dv.findElements(By.className("_12oal24"));


//String b1=mapwindow.get(0).findElement(By.className("_18khxk1")).getText().toString().trim();
	String b2 = mapwindow.get(0).findElement(By.xpath("//*[@id=\"ExploreLayoutController\"]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[3]/div/div/div/div/div[1]/div/div/div[2]/div/div/div/div[2]/div[2]/div[1]/div/div[1]/div")).getText().toString().trim();
	String b3 = mapwindow.get(0).findElement(By.className("_5kaapu")).getText().toString().trim();
//*	String b4 = mapwindow.get(0).findElement(By.className("_16shi2n")).getText().toString().trim();
    String b5=  mapwindow.get(0).findElement(By.className("_155sga30")).getText().toString().trim();
    String b6=  mapwindow.get(0).findElement(By.className("_ujf3ni")).getText().toString().trim();



	System.out.println(b2 + " " + b3 +" "+b5+" "+b6);
	System.out.println("Final String is " + mapstring);

	String resultstring = b2 + " " + b3+" "+b5+" "+b6;

	if (resultstring.equalsIgnoreCase(mapstring)) {
		Assert.assertEquals(1, 1);
	} else {
		Assert.assertEquals(1, 2);
	}


}

@BeforeMethod
    public void searchProperty() throws InterruptedException, AWTException {
    System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
    dv = new ChromeDriver();
    dv.get("https://www.airbnb.com/");
    Thread.sleep(8000);
    //WebDriverWait wait=new WebDriverWait(dv, 20);
    //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("bigsearch-query-detached-query")));

    dv.manage().window().maximize();
    dv.findElement(By.id("bigsearch-query-detached-query")).click();
    dv.findElement(By.id("bigsearch-query-detached-query")).sendKeys("Rome, Italy");
    Thread.sleep(3000);
    Robot robot = new Robot();
    robot.keyPress(KeyEvent.VK_ENTER);
    robot.keyRelease(KeyEvent.VK_ENTER);
    //dv.findElement(By.id("bigsearch-query-detached-query")).getAttribute("container").
    Thread.sleep(3000);
    List<WebElement> optionsToSelect = dv.findElements(By.className("_f8btejl"));

    optionsToSelect.get(7).click();
    optionsToSelect.get(14).click();

    int adults = 2;
    int children = 1;
    dv.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/div/div[1]/div[1]/div/header/div/div[2]/div[2]/div/div/div/form/div/div/div[5]/div[1]/div/div[2]")).click();
    Thread.sleep(3000);
    int count1 = 0;
    int count2 = 0;

    while (count1 < adults) {
        dv.findElement(By.xpath("//*[@id=\"stepper-adults\"]/button[2]/span")).click();
        count1 = count1 + 1;
    }
    while (count2 < children) {

        dv.findElement(By.xpath("//*[@id=\"stepper-children\"]/button[2]/span")).click();
        count2 = count2 + 1;
    }


    String from = dv.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/div/div[1]/div[1]/div/header/div/div[2]/div[2]/div/div/div/form/div/div/div[3]/div[1]/div[1]/div/div[2]")).getText().toString();
    String to = dv.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/div/div[1]/div[1]/div/header/div/div[2]/div[2]/div/div/div/form/div/div/div[3]/div[3]/div[1]/div/div[2]")).getText().toString();
    System.out.println(from + "--------------" + to);

    String to1[] = to.split(" ");
    System.out.println(from.trim() + " - " + to1[1].trim());
    String criteriadate = from.trim() + " – " + to1[1].trim();


    dv.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/div/div[1]/div[1]/div/header/div/div[2]/div[2]/div/div/div/form/div/div/div[5]/div[4]/button/span[1]")).click();
    Thread.sleep(20000);

    String filterareadate=dv.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/div/div[1]/div[1]/div/header/div/div[2]/div[1]/div/button[2]/div")).getText().toString();
    String searchheaderdate=dv.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/div/div[1]/main/div/div[1]/div[1]/div[1]/div/div[1]/section/div[1]")).getText().toString();
    System.out.println(criteriadate.replace(" ",""));
    System.out.println(filterareadate.replace(" ",""));

    String filterareaguests=dv.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/div/div[1]/div[1]/div/header/div/div[2]/div[1]/div/button[3]/div[1]")).getText().toString();
    String filterareacity=dv.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/div/div[1]/div[1]/div/header/div/div[2]/div[1]/div/button[1]/div")).getText().toString();

    String searchareacheck=from.trim()+" - "+to1[1].trim()+" · 3 guests";


    //Verification
    result=0;
    int count3=0;

    if(criteriadate.equalsIgnoreCase(filterareadate)&&filterareaguests.equalsIgnoreCase("3 guests")&&filterareacity.equalsIgnoreCase("Rome")&&searchheaderdate.contains(searchareacheck))
    {
        result=result;
    }
    else
    {
        result=result+1;
    }

    List<WebElement> searchresults = dv.findElements(By.className("_12oal24"));
    int size=searchresults.size();

    while(count3<size)
    {
        System.out.println(searchresults.size());
        System.out.println(searchresults.get(count3).findElements(By.className("_3hmsj")).get(0).getText());



        String str1;
        String str2[];

        str1=searchresults.get(count3).findElements(By.className("_3hmsj")).get(0).getText().toString();
        str2=str1.split(" ");

        String str3=str2[0].trim();
        System.out.println(str3);
        int guests=Integer.parseInt(str3);
        int total=adults+children;
        //System.out.println(guests);

        if(guests<total)
        {
            result=result+1;
        }

        count3=count3+1;
    }

}

@AfterMethod
public void closeBrowser()
{
//    dv.close();
}
		}


