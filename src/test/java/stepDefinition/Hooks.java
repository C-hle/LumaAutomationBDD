package stepDefinition;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;

public class Hooks {

    public static WebDriver driver;
    public static Scenario scenario;
    public static int row;

    //setup
    @Before
    public void setUp(Scenario scenario){
        Hooks.scenario = scenario;

    }

    //tear down

}
