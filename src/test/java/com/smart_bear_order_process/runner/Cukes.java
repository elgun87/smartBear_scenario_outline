package com.smart_bear_order_process.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/smart_bear_order_process/step_definitions",
        dryRun = false,
        plugin = "html:target/smart-bear.html",
        tags = ""
)
public class Cukes {
}
