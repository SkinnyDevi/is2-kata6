package software.ulpgc.kata6.service;

import software.ulpgc.kata6.adapters.SparkRequestAdapter;
import software.ulpgc.kata6.adapters.SparkResponseAdapter;
import software.ulpgc.kata6.control.Command;
import software.ulpgc.kata6.control.CommandFactory;
import spark.Spark;

public class WebService {
    private final CommandFactory factory;

    public WebService(CommandFactory factory) {
        this.factory = factory;
    }

    public void serve() {
        Spark.port(8080);

        for (String endpoint : this.factory.getPathsOfRegisteredCommands())
            this.createEndpoint(endpoint);
    }

    private void createEndpoint(String path) {
        Spark.get(path, ((request, response) -> {
            Command command = factory.get(request.pathInfo(), new SparkRequestAdapter(request), new SparkResponseAdapter(response));
            command.execute();
            response.type("application/json");
            response.status(200);
            return response.body();
        }));
    }
}