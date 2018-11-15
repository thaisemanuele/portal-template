package dwsession.resources;

import dwsession.view.LoginView;
import io.dropwizard.jersey.sessions.Session;

import javax.servlet.http.HttpSession;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import java.net.URI;
import java.net.URISyntaxException;


@Path("/login")
@Produces(MediaType.TEXT_HTML)
public class LoginResource {

    @GET
    public LoginView showLogin(){
        return new LoginView();
    }

    @POST
    @Path("/validate")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public Response validateLogin(
            @FormParam("username") String username,
            @FormParam("password") String password,
            @Session HttpSession session) throws URISyntaxException {

        session.setAttribute(username, true);
        return Response.seeOther(UriBuilder.fromUri(new URI("/home")).build()).build();

    }
}
