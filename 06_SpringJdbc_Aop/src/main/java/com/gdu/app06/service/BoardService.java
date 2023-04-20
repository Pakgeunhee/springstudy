package com.gdu.app06.service;

import java.util.List;

import com.gdu.app06.domain.BoardDTO;

public interface BoardService {
	public List<BoardDTO> selectBoarList();
	public BoardDTO selectBoardByNo(int board_no);
	public int intsertBoard(BoardDTO board);
	public int updateBoard(BoardDTO board);
	public int deleteBoard(int board_no);
	public void testTx();
}
