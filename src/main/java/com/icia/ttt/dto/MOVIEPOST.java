package com.icia.ttt.dto;

import java.sql.Date;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class MOVIEPOST {
	private String mp_Id;	    //���̵�
	private String mp_PosterName;   //������
	private String mp_Content;  //����
	private String mp_Mvname;   //��ȭ�̸�
	private String mp_Title;    //����
	
	private Date mp_Time;       //�ۼ��ð�
	private MultipartFile mp_Poster;
	
	private int mp_Like;        //���ƿ�
	private int mp_Seq;			//������ ��ȣ

}
