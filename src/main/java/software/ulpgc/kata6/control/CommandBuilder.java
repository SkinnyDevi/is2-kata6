package software.ulpgc.kata6.control;

import software.ulpgc.kata6.io.Input;
import software.ulpgc.kata6.io.Output;

public interface CommandBuilder {
    Command build(Input in, Output out);
}