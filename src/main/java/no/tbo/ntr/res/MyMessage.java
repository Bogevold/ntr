package no.tbo.ntr.res;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import no.tbo.ntr.dao.Person;

@Path("/msg")
public class MyMessage {
  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public Response getMessage() {
    return Response.ok("Dette er en test").build();
  }
  
  @GET
  @Produces(MediaType.APPLICATION_JSON)
  @Path("/pers")
  public Response getPers() {
    Person p = new Person();
    return Response.ok(p).build();
  }
}
