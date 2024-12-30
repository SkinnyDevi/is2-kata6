package software.ulpgc.kata6.adapters;

import software.ulpgc.kata6.io.Output;
import spark.Response;

public class SparkResponseAdapter implements Output {
    private final Response response;

    public SparkResponseAdapter(Response response) {
        this.response = response;
    }


    @Override
    public void setOutput(String out) {
        this.response.body(out);
    }
}