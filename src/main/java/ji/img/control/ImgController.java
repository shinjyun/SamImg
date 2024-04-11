package ji.img.control;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import ji.img.handler.ImgHandlerAdapter;

public interface ImgController {
	public ImgHandlerAdapter execute(HttpServletRequest request, HttpServletRequest response);
}
