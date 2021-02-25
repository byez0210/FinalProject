package kr.or.ddit.groupware.service;

import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.collections4.map.HashedMap;
import org.springframework.stereotype.Service;

import kr.or.ddit.common.model.PageVo;
import kr.or.ddit.groupware.model.EmpVo;
import kr.or.ddit.groupware.repository.EmpDao;

@Service("empService")
public class EmpService implements EmpServiceI{

	@Resource(name = "empDao")
	private EmpDao empDao;

	//�α���
	@Override
	public EmpVo selectUser(String emp_id) {
		return empDao.selectUser(emp_id);
	}
	
	//�λ����� ����Ʈ
	@Override
	public Map<String, Object> selectPagingUser(PageVo vo) {
		Map<String, Object> map = new HashedMap<String, Object>();
		
		map.put("userList", empDao.selectPagingUser(vo));
		map.put("userCnt", empDao.selectAllUserCount());
		map.put("pagination", (int)Math.ceil( (double)empDao.selectAllUserCount() / vo.getPageSize()));
		map.put("pageVo", vo);
		
		return map;
	}

	
	
}
