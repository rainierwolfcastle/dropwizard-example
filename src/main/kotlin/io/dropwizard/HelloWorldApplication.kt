package io.dropwizard;

import io.dropwizard.resources.HelloWorldResource
import io.dropwizard.Application
import io.dropwizard.setup.Bootstrap
import io.dropwizard.setup.Environment

public class HelloWorldApplication : Application<HelloWorldConfiguration>() {

    companion object {
        @JvmStatic fun main(args: Array<String>) {
            HelloWorldApplication().run(*args)
        }
    }

    override fun run(config: HelloWorldConfiguration, env: Environment) {
        val resource = HelloWorldResource(config.getTemplate(), config.getDefaultName())
        env.jersey().register(resource)
    }

}
