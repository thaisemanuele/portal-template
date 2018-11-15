package dwsession.view;


import io.dropwizard.jersey.sessions.Session;
import io.dropwizard.views.View;

import javax.servlet.http.HttpSession;

public class HomeView extends View {

    private String page = "home";

    public String getPage() {
        return page;
    }

    public HomeView(@Session HttpSession session){
        
        super("home.ftl");


    }
    
    

}
