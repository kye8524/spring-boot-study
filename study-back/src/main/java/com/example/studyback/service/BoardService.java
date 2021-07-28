package com.example.studyback.service;

import com.example.studyback.entity.Board;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface BoardService {
    List<Board>getBoards(Sort sort)throws Exception;
    Board findById(Long Id) throws Exception;
}
