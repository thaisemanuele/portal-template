package dwsession;

import dwsession.resources.HomeResource;
import dwsession.resources.LoginResource;
import dwsession.resources.ProjectsResource;
import io.dropwizard.Application;
import io.dropwizard.assets.AssetsBundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import io.dropwizard.views.ViewBundle;
import org.eclipse.jetty.server.session.SessionHandler;

import javax.servlet.http.HttpSession;
import java.util.Map;

public class DWSessionApplication extends Application<DWSessionConfiguration> {

    public static void main(final String[] args) throws Exception {
        new DWSessionApplication().run(args);
    }

    @Override
    public String getName() {
        return "dwsession";
    }

    @Override
    public void initialize(final Bootstrap<DWSessionConfiguration> bootstrap) {
        bootstrap.addBundle(new ViewBundle<DWSessionConfiguration>());
        bootstrap.addBundle(new AssetsBundle("/assets", "/assets", null, "css"));
    }

    @Override
    public void run(final DWSessionConfiguration configuration,
                    final Environment environment) {
        LoginResource loginResource = new LoginResource();
        HomeResource homeResource = new HomeResource();
        ProjectsResource projectsResource = new ProjectsResource();

        environment.jersey().register(io.dropwizard.jersey.sessions.SessionFactoryProvider.class);
        environment.servlets().setSessionHandler(new SessionHandler());

        environment.jersey().register(loginResource);
        environment.jersey().register(homeResource);
        environment.jersey().register(projectsResource);
    }

}
