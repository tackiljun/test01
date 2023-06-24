package org.zerock.test01.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;
import org.zerock.test01.dto.BoardDTO;

@Transactional
public interface BoardService {

    List<BoardDTO> boardList();

    BoardDTO boardOne(Long bno);

    
    
}
