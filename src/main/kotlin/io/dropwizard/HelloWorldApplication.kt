package io.dropwizard;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class HelloWorldApplication : Application<HelloWorldConfiguration>() {

    companion object {
        @JvmStatic fun main(args: Array<String>) {
            HelloWorldApplication().run(*args)
        }
    }

    override fun getName(): String {
        return "Hello world"
    }

    override fun initialize(bootstrap: Bootstrap<HelloWorldConfiguration>) {
        // TODO: application initialization
    }

    override fun run(config: HelloWorldConfiguration, env: Environment) {
        // TODO: implement application
    }

}
