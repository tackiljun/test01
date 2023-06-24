package org.zerock.test01.mappers;

import java.util.List;

import org.zerock.test01.dto.BoardDTO;

public interface BoardMapper {

    List<BoardDTO> boardList();

    BoardDTO boardOne(Long bno);
    
}
