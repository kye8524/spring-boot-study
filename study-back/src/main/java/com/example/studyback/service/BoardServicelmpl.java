package com.example.studyback.service;

import com.example.studyback.entity.Board;
import com.example.studyback.repository.BoardRepository;
import net.bytebuddy.TypeCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServicelmpl implements BoardService {

    @Autowired
    private BoardRepository boardRepository;

    @Override
    public List<Board>getBoards(Sort sort) throws Exception{
        return boardRepository.findAll(sort);
    }
    @Override
    public Board findById(Long Id) throws Exception {
        return boardRepository.findById(Id).orElse(new Board());
    }
}
