package dwsession.resources;

import dwsession.view.HomeView;
import io.dropwizard.jersey.sessions.Session;

import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/home")
@Produces(MediaType.TEXT_HTML)
public class HomeResource {


        @GET
        public HomeView showHome(@Session HttpSession session){
            return new HomeView(session);
        }

}
