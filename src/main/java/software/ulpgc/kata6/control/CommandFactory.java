package software.ulpgc.kata6.control;

import software.ulpgc.kata6.io.Input;
import software.ulpgc.kata6.io.Output;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommandFactory {
    private final Map<String, CommandBuilder> registeredCommands;

    public CommandFactory() {
        this.registeredCommands = new HashMap<>();
    }

    public CommandFactory register(String path, CommandBuilder commandSupplier) {
        this.registeredCommands.put(path, commandSupplier);
        return this;
    }

    public List<String> getPathsOfRegisteredCommands() {
        return this.registeredCommands.keySet().stream().toList();
    }

    public Command get(String path, Input input, Output output) {
        return this.registeredCommands.get(path).build(input, output);
    }
}