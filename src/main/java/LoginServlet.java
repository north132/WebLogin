import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException
    {
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        String checkCode = request.getParameter("validCode");
        String trueCode = (String)request.getSession().getAttribute("checkCode");

        response.setCharacterEncoding("gb2312");
        response.setContentType("text/html;charset=gb2313");
        PrintWriter out = response.getWriter();

        UserCheck user = new UserCheck();
        if(!trueCode.equals(checkCode)){//先验证验证码
            out.println("验证码错误。");
        }else {
            if (user.isValidUser(name, password)) {//验证账户密码
                out.println("登录成功。");
            } else {
                out.println("用户名或密码错误，请重试。");
            }
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException
    {
        doGet(request,response);
    }
}
