package com.icia.ttt.dto;

import lombok.Data;

@Data
public class THEATER {
	private String the_Code;    //���� �з� �ڵ� 
	private String the_Loc2;    //���� ������
	private String the_Theater; //�󿵰�
	private String the_Name;	//��ȭ�̸�
	private String the_Type;    //��ȭ Ÿ�� 
	
	private String the_Day;		//��������
	private String the_Start;		//�������۽ð�
	private String the_End;		//�������ð�
	private String the_PosterName; //��ȭ������
	private String the_Age;      //��ȭ ������ 
	
	private int the_Allseet;	//��ü �¼�
	private int the_Seet;  		//���� �¼�. ���� ������ ���� �¼��� -1 ������Ʈ
}