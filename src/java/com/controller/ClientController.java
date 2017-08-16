/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ConstanceMothibeli
 */
public class ClientController extends HttpServlet {
     private static final long serialVersionUID = 1L;


        public ClientController() 
        {
            super();
        }

    
    
//    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet ClientController</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet ClientController at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
//        }
//    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

   
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int clientId =Integer.parseInt( request.getParameter("clientid")); 
             String clientName = request.getParameter("clientname"); 
             

        
        
        
    }
    
    
        public  String insertuser() throws SQLException
        {

            String sql = "insert into client(clientName) values(?)";
            Connection con = null;
            PreparedStatement prep = null;

            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/clientprojectsdb", "root", "Dikengkeng123");
                prep = con.prepareStatement(sql);
                prep.setInt(1, 1);
                prep.setString(1, "clientName");
               
                prep.executeUpdate();
                prep.close();

            } 
            catch (ClassNotFoundException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();

            }
            return "successfully added";
        }

    
    

}
