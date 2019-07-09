package skeletonDay1;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(plugin="pretty",features="src/test/resources/skeletonDay1/demoshop.feature",dryRun=false,monochrome=true,tags="@tag1")
public class demoWebrun {

}
