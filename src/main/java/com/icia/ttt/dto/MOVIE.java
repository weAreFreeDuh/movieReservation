package com.icia.ttt.dto;

import java.sql.Date;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class MOVIE {
	private String mv_Name; 		//��ȭ�̸�
	private String mv_Head;			//�Ұ��� �Ӹ���
	private String mv_Content;		//�Ұ��� ��ü
	private String mv_Director;		//����
	private String mv_Actor;		//���
	private String mv_Type;			//��Ÿ��
	private String mv_Genre;		//�帣
	private String mv_Review;		//������ �ּ�
	private String mv_Age;			//���(all/����)
	
	private int mv_Res;				//������
	private int mv_Aud;				//����������
	private int mv_Time;			//�ѽð�
	private int mv_Point;			//����
	private int mv_Like;			//���ƿ�
	
	private Date mv_Openday;		//��������
	private int mv_Notice;          //����(�ڽ����ǽ��� �󿵿����� ����)
	private MultipartFile mv_Poster;       //������ �ɷ����� ��ȭ �߰��� ���
	private String mv_PosterName;   //���� ������ ���� �̸�

}
