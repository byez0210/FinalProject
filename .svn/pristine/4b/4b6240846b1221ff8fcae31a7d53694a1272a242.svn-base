package kr.or.ddit.groupware.contoller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import kr.or.ddit.common.model.PageVo;
import kr.or.ddit.groupware.model.EmpVo;
import kr.or.ddit.groupware.service.EmpService;

@Controller
@RequestMapping("empController")
public class EmpController {

	@Resource(name="empService")
	private EmpService empService;
	
	//로그인화면
	@RequestMapping("loginView")
	public String loginView() {
		return "admin/login";
	}
	
	//로그인
	@RequestMapping(path="loginProcess", method = RequestMethod.POST)
	public String loginProcess(EmpVo empVo, HttpSession session, RedirectAttributes ra, Model model, PageVo pageVo) {
		
		EmpVo dbUser = empService.selectUser(empVo.getEmp_id());
		
		if(dbUser != null && empVo.getPass().equals(dbUser.getPass())) {
			session.setAttribute("S_USER", dbUser);
			model.addAttribute("userList", empService.selectPagingUser(pageVo));
//			return "test/main";
			return "redirect:/test/main";
		}else {	
			return "redirect:/empController/loginView";
		}
	}
	
	//인사정보 리스트
	@RequestMapping("empinformation")
	public String empinformation(PageVo pageVo, Model model) {
		
		Map<String, Object> map = empService.selectPagingUser(pageVo);
		
		List<EmpVo> userList = (List<EmpVo>)map.get("userList");
		int userCnt = (int)map.get("userCnt");
	    int pagination = (int)Math.ceil((double)userCnt/pageVo.getPageSize());
		
		model.addAttribute("userList", userList);
		model.addAttribute("pagination", pagination);
		model.addAttribute("pageVo", pageVo);
		
		return "tiles.admin.userlist";
		
	}
	
	//인사정보 페이징AjaxHtml
	@RequestMapping("pagingUserAjaxHtml")
	public String pagingUserAjaxHtml(@RequestParam(defaultValue = "1") int page,
									@RequestParam(defaultValue = "10") int pageSize,
									Model model) {
		
		PageVo pageVo = new PageVo(page, pageSize);
		
		model.addAllAttributes(empService.selectPagingUser(pageVo));
			
		return "/admin/pagingUserAjaxHtml";
	}
	
	//인사정보 상세조회Ajax
	
	
	
}
