/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package gestion.clientes;


import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author Ambar
 */








@WebServlet(name = "ManejoCliente", urlPatterns = {"/ManejoCliente"})
public class ManejoCliente extends HttpServlet {

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
      
            
            
          //Handling File creation from user's input (Creacion del archivo a partir del input del usuario)
         
        
          
          
          
         try{
          //instancia de cliente 
          cliente cliente1 = new cliente();
            
          //Recibiendo los inputs
          cliente1.id = Integer.parseInt(request.getParameter("id"));
          cliente1.nombre = request.getParameter("nombre");
          cliente1.categoria = request.getParameter("categoria");
          cliente1.direccion = request.getParameter("direccion");
     
          //Crear archivo 
          String ruta = request.getParameter("ruta");
         
         
          try(FileWriter writer = new FileWriter(ruta)){
              writer.write("---- Datos de Cliente ----");
              writer.write("ID: " + cliente1.id + "\n");
              writer.write("Nombre: " + cliente1.nombre + "\n");
              writer.write("Categoría: " + cliente1.id + "\n");
              writer.write("Dirección: " + cliente1.id + "\n");
              
              //HTML 
              out.println("<!DOCTYPE html>");
              out.println("<html>");
              out.println("<head>");
              out.println("<title>Registrado Exitosamente</title>");
              out.println("</head>");
              out.println("<body>");
              out.println("<h1>Su cliente ha sido registrado con exito!!</h1>");
              out.println("<p>Puede consultar el archivo en la ruta:" + ruta +"</p>");
              
              //Mostrar datos del cliente en la web
              out.println("<h2>Datos del cliente</h2>");
              
                out.println("<ul>");
                out.println("<li>ID: " + cliente1.id +"<li>" );
                out.println("<li>Nombre : " + cliente1.nombre +"<li>" );
                out.println("<li>Categoría : " + cliente1.categoria +"<li>" );
                out.println("<li>Dirección : " + cliente1.direccion +"<li>" );
                out.println("</ul>");

              out.println("</body>");
              out.println("</html>");
         
           
  
           }catch(IOException e){
              out.println("<!DOCTYPE html>");
              out.println("<html>");
              out.println("<head>");
              out.println("<title>Error</title>");
              out.println("</head>");
              out.println("<body>");
              out.println("<h1>Error al crear el archivo</h1>");
              out.println("<p>" + e.getMessage() + "<p>");
              out.println("</body>");
              out.println("</html>");
         
           }
          
          
          
            
        
            
           
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
