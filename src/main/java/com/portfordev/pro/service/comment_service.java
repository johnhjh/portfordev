package com.portfordev.pro.service;

import java.util.List;

import com.portfordev.pro.domain.Comment;

public interface comment_service {
		//글의 갯수 구하기
		public int getListCount(int BOARD_ID);
		public List<Comment> get_list(int BOARD_ID);
}
