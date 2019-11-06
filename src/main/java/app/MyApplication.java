package app;


import service.EmployeeService;

import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;


public class MyApplication extends Application {

    private Set<Object> singletons = new HashSet<Object>();

    public MyApplication() {
        singletons.add(new EmployeeService());
    }

    @Override
    public Set<Object> getSingletons() {
        return singletons;
    }

}