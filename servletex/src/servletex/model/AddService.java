package servletex.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddService implements MyService{

	@Override
	public String service(HttpServletRequest req, HttpServletResponse resp) {
		if(req.getMethod().equals("GET")) {
			return "/view/add.jsp";
		} else {
			int n1 = Integer.parseInt(req.getParameter("n1"));
			int n2 = Integer.parseInt(req.getParameter("n2"));
			int ret = n1 + n2;
			req.setAttribute("ret", ret);
			return "/view/ret.jsp";
		}
	}

}
