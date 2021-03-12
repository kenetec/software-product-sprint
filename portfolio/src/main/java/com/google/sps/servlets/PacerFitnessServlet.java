package com.google.sps.servlets;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/pacer-text")
public class PacerFitnessServlet extends HttpServlet {
  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    response.setContentType("text/html;");
    response.getWriter().println("The FitnessGram™ Pacer Test is a multistage " +
    "aerobic capacity test that progressively gets more difficult as it "
    + "continues. The 20 meter pacer test will begin in 30 seconds. Line up "
    + "at the start. The running speed starts slowly, but gets faster each "
    + "minute after you hear this signal. [beep] A single lap should be " +
    "completed each time you hear this sound. [ding] Remember to run in a "
    + "straight line, and run as long as possible. The second time you fail "
    + "to complete a lap before the sound, your test is over. The test will "
    + "begin on the word start. On your mark, get ready, start.");
  }
}
