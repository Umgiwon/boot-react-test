package com.my.react.reactbackend.board.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.my.react.reactbackend.board.entity.BoardEntity;
import com.my.react.reactbackend.db.BoardMapper;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class BoardController {
    private final BoardMapper boardMapper;
    
    @GetMapping("/board")
    List<BoardEntity> getBoardList() {
        return boardMapper.getBoardList();
    }
}
