package com.icia.ttt.dto;

import java.sql.Date;

import lombok.Data;

@Data
public class COMMENT {
	private String cmt_Id;		//���̵�
	private String cmt_Point;	//����
	private String cmt_Comment; //������
	private String cmt_Mvname;  //��ȭ�̸�
	
	private int cmt_Like;  //���ƿ�
	private Date cmt_Time; //�ۼ� �ð�
}
