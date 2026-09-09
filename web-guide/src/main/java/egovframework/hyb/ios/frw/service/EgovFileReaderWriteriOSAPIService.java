/**
 * 
 */
package egovframework.hyb.ios.frw.service;

import java.util.List;

/**  
 * @Class Name : EgovFileReaderWriteriOSAPIService.java
 * @Description : EgovFileReaderWriteriOSAPIService
 * @
 * @  수정일                 수정자                 수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2012. 7. 10.  서준식                   최초생성
 * 
 * @author 디바이스 API 실행환경 개발팀
 * @since 2012. 7. 10.
 * @version 1.0
 * @see
 * 
 *  Copyright (C) by MOPAS All right reserved.
 */
public interface EgovFileReaderWriteriOSAPIService {
	
	/**
	 * 파일  정보를 입력한다.
	 * @param fileVO - 파일 정보가 담긴 FileReaderWriteriOSAPIVO 
	 */	
	public void insertFileInfo(FileReaderWriteriOSAPIVO vo);
	
	/**
	 * 업로드 된 파일의 상세 정보를 저장한다.
	 * @param fileVO - 파일 정보가 담긴 FileReaderWriteriOSAPIVO 
	 */
	public void insertFileDetailInfo(FileReaderWriteriOSAPIVO vo);
	
	/**
	 * 파일 정보리스트를 조회한다.
	 * @param fileVO - 파일 정보가 담긴 FileReaderWriteriOSAPIVO 
	 */
	public FileReaderWriteriOSAPIVO selectFileInfo(FileReaderWriteriOSAPIVO vo);
	
	/**
	 * 파일 정보를 조회한다.
	 * @param fileVO - 파일 정보가 담긴 FileReaderWriteriOSAPIVO 
	 */
	public List<?> selectFileInfoList(FileReaderWriteriOSAPIVO vo);
	
	/**
	 * 파일 정보를 삭제한다.
	 * @param fileVO - 파일 정보가 담긴 FileReaderWriteriOSAPIVO 
	 */
	public void deleteFileInfo(FileReaderWriteriOSAPIVO vo);
	
	
	/**
	 * 파일 디테일 정보를 삭제한다.
	 * @param fileVO - 파일 정보가 담긴 FileReaderWriteriOSAPIVO 
	 */
	public void deleteFileDetailInfo(FileReaderWriteriOSAPIVO vo);
}
