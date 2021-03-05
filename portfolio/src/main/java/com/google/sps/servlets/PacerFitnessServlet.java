package com.google.sps.servlets;

import com.google.gson.Gson;
import java.io.IOException;
import java.util.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/pacer-text")
public class PacerFitnessServlet extends HttpServlet {
  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    response.setContentType("application/json;");

    List<String> arr = new ArrayList<>();
    arr.add("My favorite show is Castlevania");
    arr.add("Coding is always a good time");
    arr.add("One time I got McDonalds and there was hair in the sprite");
    arr.add("I can only eat chips for about 5 seconds before I get bored of them");
    arr.add("I've probably made about 7 youtube channels with no vides on them");

    Gson gson = new Gson();
    String json = gson.toJson(arr);

    response.getWriter().println(json);
  }
}
