package runner;

import io.cucumber.testng.CucumberOptions;
import stepDef.ProjectSpecificMethod;

@CucumberOptions(features="src/test/java/feature/MergeLead.feature",
                 glue={"stepDef","hooks"},
                 monochrome=true,
                 publish=true,
                 tags ="@smoke"
                 )

public class RunCucumberTests extends ProjectSpecificMethod {

}
