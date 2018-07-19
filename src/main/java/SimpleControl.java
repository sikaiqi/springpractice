import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2018/7/18 0018.
 */
public class SimpleControl implements Controller{

    public ModelAndView getName(HttpServletRequest req, HttpServletResponse resp){
       ModelAndView mmv =  new ModelAndView("userView");
       mmv.addObject("name","刘德华");
       return mmv;
    }

    @Override
    public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        return getName(req,resp);
    }
}
