package by.balashevich.firstservlet.controller.impl;

import by.balashevich.firstservlet.controller.ActionCommand;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.GregorianCalendar;

public class CalculateTimeCommand implements ActionCommand {
    private static final int MILLIS_DELIMITER = 1_000;

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        GregorianCalendar gc = new GregorianCalendar();
        long timeJsp = Long.parseLong(request.getParameter("time"));
        float delta = (float)(gc.getTimeInMillis() - timeJsp) / MILLIS_DELIMITER;
        request.setAttribute("res", delta);
        request.getRequestDispatcher("/WEB-INF/jsp/timeresult.jsp").forward(request, response);
    }
}
