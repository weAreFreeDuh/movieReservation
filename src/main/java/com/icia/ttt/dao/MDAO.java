package com.icia.ttt.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.icia.ttt.dto.MEMBER;
import com.icia.ttt.dto.RESERVATION;

@Repository
public class MDAO {
	
	@Autowired
	SqlSessionTemplate sql;
	
	//���̵� Ȯ��
	public String idCheck(String memId) {
		return sql.selectOne("Member.idCheck", memId);
	}
	
	//ȸ������
	public int mJoin(MEMBER member) {		
		return sql.insert("Member.mJoin", member);
	}

	//�α���
	public String mLogin(MEMBER member) {
		return sql.selectOne("Member.mLogin", member);
	}

	//ȸ�� ������
	public MEMBER mView(String memId) {
		return sql.selectOne("Member.mView", memId);
	}
	
	//ȸ������ ����
	public int mModify(MEMBER member) {
		return sql.update("Member.mPwchan", member);
	}

	public int mDelete(String memId) {
		return sql.delete("Member.mDelete", memId);
	}

	public List<MEMBER> mList() {
		return sql.selectList("Member.mList");
	}

	public List<RESERVATION> Ticketing() {
		return sql.selectList("Member.Ticketing");
	}

	public List<RESERVATION> myTicket(String memId) {
		return sql.selectList("Member.myTicket", memId);
	}

	
	

}
