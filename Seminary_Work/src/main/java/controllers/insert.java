package controllers;

import entity.Questions;
import java.io.IOException;
import java.io.PrintWriter;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "insert", urlPatterns = {"/insert"})
public class insert extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        request.setCharacterEncoding("utf-8");
        
        PrintWriter out = response.getWriter();
        
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("user_name");       
        String lastName = request.getParameter("user_secondname");
        String phoneNumber = request.getParameter("user_tel");
        String email = request.getParameter("user_email");
        String web = request.getParameter("user_webovestranky");
        String text = request.getParameter("user_opinion");
        String contact = request.getParameter("user_classes");
        String choice = request.getParameter("user_options");
        
        
        if(phoneNumber.equals("")){
            phoneNumber = "Neuvedeno";
        }
        
        if(web.equals("")){
            web = "Neuvedeno";
        }
        
        Questions entity = new Questions(id, name, lastName, phoneNumber, email, web, text, contact, choice);
        
        System.out.println(name);
        System.out.println(text);
        
        
        
        try{
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.michael_Seminary_Work_war_1.0-SNAPSHOTPU");
            EntityManager em = emf.createEntityManager();
            EntityTransaction t = em.getTransaction();

            t.begin();

            em.persist(entity);

            t.commit();
            
            
            RequestDispatcher rd = request.getRequestDispatcher("/succes.html");
            rd.forward(request, response);
        }
        
        catch(Exception e){
            out.print(e);
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
