package com.portfordev.pro.service;

import java.util.List;

import com.portfordev.pro.domain.Board;
import com.portfordev.pro.domain.Member;

public interface search_service {
	public List<Member>searchMember(String search);
	public List<Board> searchBoard(String search);

}
