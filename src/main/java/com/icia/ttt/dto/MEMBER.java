package com.icia.ttt.dto;

import java.sql.Date;

import lombok.Data;

@Data
public class MEMBER {

	private String memId;			//���̵�
	private String memPw;			//��й�ȣ
	private String memName;			//�̸�
	private String memPhone;		//����ó
	private String memEmail;		//�̸���
	private String memTheater1;		//��ȣ��ȭ��1
	private String memTheater2;		//��ȣ��ȭ��2
	
	private Date memBirth;			//�������
}
