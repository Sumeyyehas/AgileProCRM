package com.Crm.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                //"pretty",
                "json:target/cucumber.json",
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber"
        },
        features ="src/test/resources/features", //features-> choose copy/path reference -> choose path from content root
        glue = "com/Crm/step_definitions", //step_definitions-> choose copy/path reference-> choose path from source root
        dryRun = false, //it will run browser, true means not open, not code seeing.
        tags = "@AGL-418",
        publish = true
        //"@wip" mean work in progress.

)

public class CukesRunner {


}
