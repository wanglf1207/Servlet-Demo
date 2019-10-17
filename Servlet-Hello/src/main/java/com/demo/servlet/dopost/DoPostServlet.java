package com.demo.servlet.dopost;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DoPostServlet  extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException {
        String username = request.getParameter("username");
        System.out.println(username + "ssssssssssssss");

        request.setAttribute("gender","male");
        String gender = (String)request.getAttribute("gender");
        System.out.println("my favorite is : " + gender);
    }
}
