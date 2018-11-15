package dwsession.resources;

import dwsession.view.HomeView;
import dwsession.view.ListProjectsView;
import io.dropwizard.jersey.sessions.Session;

import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/projects")
@Produces(MediaType.TEXT_HTML)
public class ProjectsResource {


        @GET
        public ListProjectsView showProjects(@Session HttpSession session){
            return new ListProjectsView();
        }

}
