package dwsession.view;


import io.dropwizard.views.View;

public class ListProjectsView extends View {

    private String page = "projects";

    public String getPage() {
        return page;
    }

    public ListProjectsView(){
        super("projects-list.ftl");
    }

}
