import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        features = {"D:/JuliDirectory/fordeveducation/src/test/resources/Tests/ChangeInfoAboutPet.feature"},
        plugin = {"json:D:/JuliDirectory/fordeveducation/target/cucumber-parallel/2.json"},
        monochrome = false,
        tags = {"@petsTests"},
        glue = {"Steps"})
public class Parallel02IT {
}
