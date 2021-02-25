package kr.or.ddit.groupware.repository;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import kr.or.ddit.common.model.PageVo;
import kr.or.ddit.groupware.model.EmpVo;

@Repository("empDao")
public class EmpDao implements EmpDaoI{

	@Resource(name = "sqlSessionTemplate")
	private SqlSessionTemplate template;
	
	//로그인
	@Override
	public EmpVo selectUser(String emp_id) {
		return template.selectOne("emp.selectUser", emp_id);
	}
	
	//인사정보 사원리스트 페이징
	@Override
	public List<EmpVo> selectPagingUser(PageVo vo) {
		return template.selectList("emp.selectPagingUser", vo);
	}

	//인사정보 사원수
	@Override
	public int selectAllUserCount() {
		return template.selectOne("emp.selectAllUserCount");
	}


}
