package com.icia.ttt.controller;

import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.icia.ttt.dto.MEMBER;
import com.icia.ttt.service.MService;

@Controller
public class MController {

	private ModelAndView mav = new ModelAndView();

	@Autowired
	private MService msvc;

	@Autowired
	private HttpSession session;

	// mJoinForm : ȸ������ ������
	@RequestMapping(value = "/mJoinForm", method = RequestMethod.GET)
	public String mJoinForm() {
		return "M_Join";
	}

	// mLoginForm: �α��� ������
	@RequestMapping(value = "/mLoginForm", method = RequestMethod.GET)
	public String mLoginForm() {
		return "M_Login";
	}

	// mPwForm: ��й�ȣ ã�� Ȩ��������
	@RequestMapping(value = "/mPwForm", method = RequestMethod.GET)
	public String mPwForm() {
		return "M_Pw";
	}

	// mJoin : ȸ������
	@RequestMapping(value = "/mJoin", method = RequestMethod.POST)
	public ModelAndView mJoin(@ModelAttribute MEMBER member) throws IllegalStateException, IOException {

		mav = msvc.mJoin(member);
		return mav;
	}

	// idoverlap : ���̵� �ߺ�üũ ajax
	@RequestMapping(value = "/idoverlap", method = RequestMethod.POST)
	public @ResponseBody String idoverlap(@RequestParam("memId") String memId) {

		System.out.println("ajax�� �Ѿ�� memId : " + memId);
		String result = msvc.idoverlap(memId);

		System.out.println("db���� Ȯ���� result�޼��� : " + result);
		return result;
	}

	// mCheckEmail : �̸���Ȯ��
	@RequestMapping(value = "/mCheckEmail", method = RequestMethod.POST)
	public @ResponseBody String checkEmail(@RequestParam("memEmail") String memEmail) {
		System.out.println("memEmail : " + memEmail);
		String uuid = msvc.checkEmail(memEmail);
		System.out.println("uuid : " + uuid);
		return uuid;
	}

	// mLogin : �α���
	@RequestMapping(value = "/mLogin", method = RequestMethod.POST)
	public ModelAndView mLogin(@ModelAttribute MEMBER member) {

		mav = msvc.mLogin(member);
		return mav;
	}

	// mLogout : �α׾ƿ�
	@RequestMapping(value = "/mLogout", method = RequestMethod.GET)
	public String mLogout() {
		session.invalidate();

		return "index";
	}

	// mModiForm : ȸ������ ������
	@RequestMapping(value = "/mModiForm", method = RequestMethod.GET)
	public ModelAndView mModiForm(@RequestParam("memId") String memId) {
		mav = msvc.mModiForm(memId);
		return mav;
	}

	// mPwChange : ��й�ȣ ����
	@RequestMapping(value = "/mPwChange", method = RequestMethod.POST)
	public ModelAndView mPwChange(@ModelAttribute MEMBER member) {
		System.out.println("controller");
		mav = msvc.mPwChange(member);
		return mav;
	}

	// myPage : ����������
	@RequestMapping(value = "/myPage", method = RequestMethod.GET)
	public ModelAndView mView(@RequestParam("memId") String memId) {
		mav = msvc.mView(memId);
		return mav;
	}

	// mDelete : ȸ������
	@RequestMapping(value = "/mDelete", method = RequestMethod.GET)
	public ModelAndView mDelete(@RequestParam("memId") String memId) {
		mav = msvc.mDelete(memId);

		return mav;
	}

	// mList : ȸ�����
	@RequestMapping(value = "/mList", method = RequestMethod.GET)
	public ModelAndView mList() {

		mav = msvc.mList();
		return mav;
	}

}
