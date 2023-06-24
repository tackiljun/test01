package org.zerock.test01.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.zerock.test01.dto.BoardDTO;
import org.zerock.test01.mappers.BoardMapper;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {

    private final BoardMapper boardMapper;

    public List<BoardDTO> boardList() {

        List<BoardDTO> list = boardMapper.boardList();

        return list;
    }

    public BoardDTO boardOne(Long bno) {

        BoardDTO boardOne = boardMapper.boardOne(bno);

        return boardOne;
    }
    
}
