package by.balashevich.firstservlet.controller;

public class CommandProvider {
    public ActionCommand defineCommand(String command){
        return CommandType.valueOf(command.toUpperCase()).getCommand();
    }
}
