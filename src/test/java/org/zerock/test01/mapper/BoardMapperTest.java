package org.zerock.test01.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.zerock.test01.mappers.BoardMapper;

import lombok.extern.log4j.Log4j2;

@SpringBootTest
@Log4j2
public class BoardMapperTest {

    @Autowired(required = false)
    private BoardMapper boardMapper;
    
    @Test
    public void testList(){
        boardMapper.boardList();
    }

}
