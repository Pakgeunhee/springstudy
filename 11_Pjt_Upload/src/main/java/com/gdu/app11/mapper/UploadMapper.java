package com.gdu.app11.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.gdu.app11.domain.AttachDTO;
import com.gdu.app11.domain.UploadDTO;

@Mapper
public interface UploadMapper {
	// getUploadList
	public List<UploadDTO> getUploadList();
	
	// addUpload
	public int addUpload(UploadDTO uploadDTO);
	public int addAttach(AttachDTO attachDTO);
	
	// getUploadByNo
	public UploadDTO getUploadByNo(int uploadNo);
	public List<AttachDTO> getAttachList(int uploadNo);	
	
	// display, download
	public AttachDTO getAttachByNo(int attachNo);
	
	// download
	public int increaseDownloadCount(int attachNo);
	
	// downloadAll
	// public List<AttachDTO> getAttachList(int uploadNo);	
	
	// remobeUpload
	public int removeUpload(int uploadNo);
	
	// RemoveWrongfileScheduler
	public List<AttachDTO> getAttachListInYesterday();
}
