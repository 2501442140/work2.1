package sc.Servlet;

import sc.entity.book;
import sc.service.Impl.bookServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "bookServlet",urlPatterns = {"/bookServlet"})
public class bookServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        String comm = request.getParameter("comm");
        bookServiceImpl bsi=new bookServiceImpl();
        if(comm.equals("list")){
            try{
                List<book> list=bsi.bookfindstate();
                if(list!=null){
                    request.getSession().setAttribute("list",list);
                    response.sendRedirect("list.jsp");
                }

            } catch (Exception e) {
                e.printStackTrace();
            }

        }

        if(comm.equals("up")){
            try{
                String book_id=request.getParameter("book_id");
                int ids=Integer.parseInt(book_id);
                book bo=bsi.findbook_name(ids);
                System.out.println(bo);
                if(bo!=null){
                    request.getSession().setAttribute("bo",bo);
                    response.sendRedirect("update.jsp");
                }
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
        if(comm.equals("借阅")) {
            try {
                String lender = request.getParameter("lender");
                String book_id = request.getParameter("book_id");
                int ids = Integer.parseInt(book_id);
                book bo = new book();
                bo.setBook_id(ids);
                bo.setState(1);
                bo.setLender(lender);
                if (lender == null || lender == "") {
                    response.sendRedirect("upfaild.jsp");
                } else {
                    int x = bsi.bookupdate(bo);
                    if (x > 0) {
                        response.sendRedirect("upsuccess.jsp");
                    }
            }
            } catch(Exception e){
                e.printStackTrace();
            }
        }
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
