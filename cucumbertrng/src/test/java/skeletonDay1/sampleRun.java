package skeletonDay1;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"pretty","html:src/report"},features="src/test/resources/skeletonDay1/sample.feature",tags= {"@tag1","not @tag2"})
public class sampleRun {

}
