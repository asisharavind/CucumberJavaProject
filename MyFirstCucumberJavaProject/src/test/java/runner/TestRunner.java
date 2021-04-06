//https://www.youtube.com/watch?v=WVteFkSqvTw
//mvn test -Dcucumber.options=“src/test/resources/Features/Login.feature”
//working-clean install -Durl=$appURL -Dbrowser=$BROWSER


package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/resources/Features"},glue={"steps"})
public class TestRunner {

}
