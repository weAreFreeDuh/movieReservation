package com.icia.ttt.dto;

import java.sql.Date;

import lombok.Data;

//�α��ξ��̵� ��¥ ��ȭ�̸� �����̸� �󿵰� Ÿ�� ������/���� �ð� ���ο� � û�ҳ� ��� �����ݾ� �����¼�

@Data
public class RESERVATION {
	
	private int res_Seq; //����� �� �ʿ�
	//private String res_Code; //�¼� ������
	
	private String res_Id;		//���̵�	
	private String res_Mvname;	//��ȭ�̸�
	private String res_Day;		//��������
	private String res_Loc2;	//���� ������
	private String res_Theater; //�󿵰�
	
	private String res_Start;		//���� ���� �ð�
	private String res_End;		//���� �� �ð�
	
	private int res_Person;		//���� �ο�
	private int res_Price;		//�����ݾ�
	private String res_Seet;    //������ �¼�
	private String res_Type;    //������ ��ȭ�� Ÿ��(2d, 3d)
	
	private int res_Adult;      //���� ��
	private int res_Youth;		//û�ҳ� ��
	private int res_Child;		//��� ��
}