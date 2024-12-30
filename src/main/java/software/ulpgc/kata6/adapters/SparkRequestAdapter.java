package software.ulpgc.kata6.adapters;

import software.ulpgc.kata6.io.Input;
import spark.Request;

public class SparkRequestAdapter implements Input {
    private final Request request;

    public SparkRequestAdapter(Request request) {
        this.request = request;
    }


    @Override
    public String getInput(String in) {
        return this.request.queryParams(in);
    }
}