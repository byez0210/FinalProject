package kr.or.ddit.groupware.repository;

import java.util.List;

import kr.or.ddit.common.model.PageVo;
import kr.or.ddit.groupware.model.EmpVo;

public interface EmpDaoI {

	//�α���
	EmpVo selectUser(String emp_id);

	//�λ����� ��� ����¡ list
	List<EmpVo> selectPagingUser(PageVo vo);
	
	//�λ����� ��ü��� ��
	int selectAllUserCount();
	
	
	
}
