package ob.cochelper;

import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.types.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author omer
 */
public class FBLogin extends HttpServlet {

   @Override
   protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      String accessToken = req.getParameter("accessToken");

      DefaultFacebookClient defaultFacebookClient = new DefaultFacebookClient(accessToken);
      User me = defaultFacebookClient.fetchObject("me", User.class);



      resp.getWriter().write(me.getEmail());

   }
}