/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entities.FacTabEmpleado;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import manager.FacTabEmpleadoFacadeLocal;

/**
 *
 * @author Usuario
 */
@WebServlet(name = "controlador", urlPatterns = {"/controlador"})
public class controlador extends HttpServlet {

    @EJB
    private FacTabEmpleadoFacadeLocal facTabEmpleadoFacade;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            List<FacTabEmpleado> lista = facTabEmpleadoFacade.findAll();
          
            //Obtengo valores del Jsp
            String cedula=request.getParameter("cedula");
            String nombres=request.getParameter("nombres");
            String apellidos=request.getParameter("apellidos");
            String correo=request.getParameter("correo");
             //llamada a la entidad empleado
             FacTabEmpleado   e;
             
           
    
         
           try{
    String accion = request.getParameter("btnRegistrar");
    switch(accion){
        case "Guardar":
  
            e= new FacTabEmpleado();
            	e.setNombreEmp(nombres);
            	e.setApellidoEmp(apellidos);
            	e.setCedulaEmp(cedula);
            	e.setEmailEmp(correo);
              facTabEmpleadoFacade.create(e);
            request.setAttribute("listaEmpleados", lista);
            request.getRequestDispatcher("IndexEmpleados.jsp").forward(request, response);
            
         default:
             out.println("Error no se direcciono bien");
    }        
    }finally {
    out.close();
    }
         
         
         
         
         
         
        
            /* TODO output your page here. You may use following sample code. */
      //   out.println("<!DOCTYPE html>");
     //       out.println("<html>");
     //       out.println("<head>");
    //        out.println("<title>Servlet controller</title>");            
   //         out.println("</head>");
    //        out.println("<body>");
   //         out.println("<h1>Servlet controller at " + request.getContextPath() + "</h1>");
   //                    out.println("<h1>Servlet controlador at " + nombres + "</h1>");
    //        out.println("</body>");
       //     out.println("</html>");
            
        }
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
