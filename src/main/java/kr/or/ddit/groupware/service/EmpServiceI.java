package kr.or.ddit.groupware.service;

import java.util.Map;

import kr.or.ddit.common.model.PageVo;
import kr.or.ddit.groupware.model.EmpVo;

public interface EmpServiceI {

	//�α���
	EmpVo selectUser(String emp_id);
	
	//�λ������������Ʈ
	Map<String, Object> selectPagingUser(PageVo vo);
	
}
