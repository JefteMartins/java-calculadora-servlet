/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.calculadora.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;

/**
 *
 * @author jefte
 */
@WebServlet(name = "CalcBasica", urlPatterns = {"/CalcBasica"})
public class CalcBasica extends HttpServlet {
    protected void doGet(HttpServletRequest request,
    HttpServletResponse response) throws ServletException,
    IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        String svalorA = request.getParameter("valorA");
        String svalorB = request.getParameter("valorB");
        String sopcao = request.getParameter("opcao");
        
        double dvalorA = Double.parseDouble(svalorA);
        double dvalorB = Double.parseDouble(svalorB);
        double resultado = 0;
        
        if(sopcao.equals("+")){
            resultado = dvalorA + dvalorB;
        }else if(sopcao.equals("-")){
            resultado = dvalorA - dvalorB;
        }else if(sopcao.equals("/")){
            resultado = dvalorA / dvalorB;
        }else {
            resultado = dvalorA * dvalorB;
        }
        request.setAttribute("resultado", resultado);
        request.getRequestDispatcher("/calculadora.jsp");
        out.println("Resultado: <br> "+resultado);
        RequestDispatcher r = request.getRequestDispatcher( "calculadora.jsp" ); 
        r.forward( request, response );
        out.close();
    }


    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
