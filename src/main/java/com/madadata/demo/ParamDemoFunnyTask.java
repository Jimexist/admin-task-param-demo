package com.madadata.demo;

import com.google.common.collect.ImmutableMultimap;
import io.dropwizard.servlets.tasks.Task;
import java.io.PrintWriter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by jiayu on 3/14/17.
 */
public class ParamDemoFunnyTask extends Task {

    private static final Logger logger = LoggerFactory.getLogger(ParamDemoFunnyTask.class);

    ParamDemoFunnyTask() {
        super("funny");
    }

    @Override
    public void execute(ImmutableMultimap<String, String> immutableMultimap, PrintWriter printWriter) throws Exception {
        immutableMultimap.entries().forEach(stringStringEntry ->
            logger.info("key '{}', value '{}'", stringStringEntry.getKey(), stringStringEntry.getValue()));
    }
}
