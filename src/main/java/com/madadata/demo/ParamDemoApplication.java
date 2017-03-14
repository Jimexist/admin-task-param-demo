package com.madadata.demo;

import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

/**
 * Created by jiayu on 3/14/17.
 */
public class ParamDemoApplication extends Application<ParamDemoConfiguration> {

    public static void main(String[] args) throws Exception {
        new ParamDemoApplication().run(args);
    }

    @Override
    public String getName() {
        return "param-demo-app";
    }

    @Override
    public void run(ParamDemoConfiguration configuration, Environment environment) throws Exception {
        environment.admin().addTask(new ParamDemoFunnyTask());
    }
}
