package com.smart_bear_order_process.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/smart_bear_order_process/step_definitions",
        dryRun = false,
        tags = "@order",
        plugin = {"html:target/smart-bear.html",
                "json:target/json-report.json",
                "rerun:target/rerun.txt"
        }
)
public class Cukes {
}
