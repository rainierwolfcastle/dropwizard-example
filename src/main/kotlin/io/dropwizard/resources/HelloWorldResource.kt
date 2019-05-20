package io.dropwizard.resources

import io.dropwizard.api.Saying
import com.codahale.metrics.annotation.Timed;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.concurrent.atomic.AtomicLong;
import java.util.Optional;

@Path("/hello-world")
@Produces(MediaType.APPLICATION_JSON)
class HelloWorldResource(val template: String, val defaultName: String, val counter: AtomicLong = AtomicLong()) {
    @GET @Timed fun sayHello(@QueryParam("name") name: Optional<String>): Saying {
        val value = String.format(this.template, name.orElse(defaultName))
        return Saying(counter.incrementAndGet(), value)
    }
}