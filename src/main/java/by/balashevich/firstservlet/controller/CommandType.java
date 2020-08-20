package by.balashevich.firstservlet.controller;

import by.balashevich.firstservlet.controller.impl.CalculateTimeCommand;
import by.balashevich.firstservlet.controller.impl.ResetStopwatchCommand;

public enum CommandType {
    RESET_STOPWATCH(new ResetStopwatchCommand()),
    CALCULATE_TIME(new CalculateTimeCommand());

    private ActionCommand command;

    CommandType(ActionCommand command){
        this.command = command;
    }

    public ActionCommand getCommand(){
        return command;
    }
}
