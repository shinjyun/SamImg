package ji.img.dao;

import java.util.ArrayList;
import java.util.logging.Logger;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import ji.img.dto.ImgDTO;
import ji.img.service.ImgService;

public class ImgDAO implements ImgService{
	private static Log log = LogFactory.getLog(ImgDAO.class);

	@Override
	public ArrayList<ImgDTO> imgSelectAll() {
		return null;
	}

	@Override
	public ImgDTO imgSelect(int img_number) {
		return null;
	}

	@Override
	public ImgDTO imgInsert(ImgDTO imgDTO) {
		return null;
	}

	@Override
	public ImgDTO imgUpdate(ImgDTO imgDTO) {
		return null;
	}

	@Override
	public ImgDTO deptDelete(int img_number) {
		return null;
	}
	
	
}
