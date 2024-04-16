package ji.img.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import ji.img.control.ImgController;
import ji.img.dao.ImgDAO;
import ji.img.dto.ImgDTO;
import ji.img.handler.ImgHandlerAdapter;

public class ImgInsertController implements ImgController{
	private static Log log = LogFactory.getLog(ImgInsertController.class);
	
	@Override
	public ImgHandlerAdapter execute(HttpServletRequest request, HttpServletResponse response) {
		// img_number 파라미터의 값이 null인 경우를 처리하기 위해 변수 선언
        int img_number = 0;
        String imgNumberParameter = request.getParameter("img_number");
        if(imgNumberParameter != null) {
            // img_number 파라미터가 null이 아닌 경우에만 파싱하여 변수에 저장
            img_number = Integer.parseInt(imgNumberParameter);
        } else {
            // img_number 파라미터가 null인 경우에 대한 처리
            // 예를 들어, 기본값을 설정하거나 오류 처리를 수행할 수 있습니다.
            log.error("img_number parameter is null");
            // 기본값 설정 예시:
            // img_number = 0; // 또는 다른 기본값 설정
        }
		
		String img_upload = request.getParameter("img_upload");
		log.info(img_upload);
		
		String img_update = request.getParameter("img_update");
		log.info(img_update);
		
		String img_url = request.getParameter("img_url");
		log.info(img_url);
		
		ImgDAO imgDao = new ImgDAO();
		ImgDTO imgDTO = new ImgDTO();
		ArrayList<ImgDTO> arrayList = new ArrayList<ImgDTO>();
		
		arrayList = imgDao.imgSelectAll();
		log.info(arrayList);
		request.setAttribute("arrayList", arrayList);
		
		imgDTO.setImg_number(img_number);
		imgDTO.setImg_upload(img_upload);
		imgDTO.setImg_update(img_update);
		imgDTO.setImg_url(img_url);
		
		imgDTO = imgDao.imgInsert(imgDTO);
		log.info(imgDTO);
		request.setAttribute("imgDTO", imgDTO);
		log.info("이미지 정보 등록");
		
		ImgHandlerAdapter imgHandlerAdapter = new ImgHandlerAdapter();
		
		imgHandlerAdapter.setPath("./image/img_insert_view.jsp");
		
		return imgHandlerAdapter;
	}

}
