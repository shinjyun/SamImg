package ji.img.control;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ji.img.handler.ImgHandlerAdapter;

public interface ImgController {
	public ImgHandlerAdapter execute(HttpServletRequest request, HttpServletRequest response);

	ImgHandlerAdapter execute(HttpServletRequest request, HttpServletResponse response);
}
