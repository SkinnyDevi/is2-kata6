package software.ulpgc.kata6.control.commands;

import software.ulpgc.kata6.control.Command;
import software.ulpgc.kata6.io.Input;
import software.ulpgc.kata6.io.Output;

public class SumTaskCommand implements Command {
    public static final String PARAM_NUM1 = "op1";
    public static final String PARAM_NUM2 = "op2";
    private final Input input;
    private final Output output;
    private final int operand1;
    private final int operand2;

    public SumTaskCommand(Input input, Output output) {
        this.input = input;
        this.output = output;
        this.operand1 = Integer.parseInt(this.input.getInput(PARAM_NUM1));
        this.operand2 = Integer.parseInt(this.input.getInput(PARAM_NUM2));
    }

    private String asJson(int result) {
        return String.format("{\"result\": %d}", result);
    }

    @Override
    public void execute() {
        this.output.setOutput(asJson(operand1 + operand2));
    }
}