package software.ulpgc.kata6;

import software.ulpgc.kata6.control.CommandFactory;
import software.ulpgc.kata6.control.commands.SumTaskCommand;
import software.ulpgc.kata6.control.commands.MultiplyTaskCommand;
import software.ulpgc.kata6.service.WebService;

public class Main {
    public static void main(String[] args) {
        CommandFactory factory = new CommandFactory()
                .register("/sum", SumTaskCommand::new)
                .register("/multiply", MultiplyTaskCommand::new);

        new WebService(factory).serve();
    }
}