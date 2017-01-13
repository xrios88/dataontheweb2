package com.ironyard.servlets;

import com.ironyard.data.Person;

import javax.servlet.RequestDispatcher;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Banksy on 1/12/17.
 */
@javax.servlet.annotation.WebServlet(name = "xavierFinancial")
public class xavierFinancial extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        // get data from form

        String myFirstName = request.getParameter("firstName");
        String myLastName = request.getParameter("lastName");
        double myInvestAmount = Double.parseDouble(request.getParameter("investAmount"));
        double myInvestReturn = Double.parseDouble(request.getParameter("investReturn"));

        request.setAttribute("fName" , myFirstName);
        request.setAttribute("lName" , myLastName);
        request.setAttribute("iAmount" , myInvestAmount);
        request.setAttribute("iReturn" , myInvestReturn);


        double percentRtn = myInvestReturn / myInvestAmount;
        double percentage = percentRtn * 100;

        String investmentCal;
        if(percentRtn <= .05){
            investmentCal = " this is a likely investment! That's a " + (percentage) + "% return off of your initial investment";
        }
        else if(percentRtn > .05 && percentRtn <= 0.8){
            investmentCal = " this is a greedy investment! That's a " + (percentage) + "% return off of your initial investment";
        }
        else{
            investmentCal = " this is a SUPER DUPER GREEDY investment! That's a " + percentage + "% return off of your initial investment";

        }

        request.setAttribute("eval" , investmentCal);

        // forward to display JSP
        String nextJSP = "/helloData.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
        dispatcher.forward(request,response);
    }


    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
