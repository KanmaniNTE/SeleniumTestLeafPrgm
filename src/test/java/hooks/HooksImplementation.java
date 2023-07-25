package hooks;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;

import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import stepDef.ProjectSpecificMethod;

public class HooksImplementation extends ProjectSpecificMethod {
	@BeforeStep
	public void beforeStep() {
		System.out.println("This Before Staring the Every Step");
	}
	
	@AfterStep
	public void afterStep() throws IOException {
		System.out.println("This is to take a snap");
		 File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		  File target = new File("./Snapshot/snap"+i+".png");	
		   //set the storage path
		   FileUtils.copyFile(screenshotAs, target);
		   i++;
	}

}
