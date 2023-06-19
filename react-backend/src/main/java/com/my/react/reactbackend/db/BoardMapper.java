package com.my.react.reactbackend.db;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.my.react.reactbackend.board.entity.BoardEntity;

@Mapper
public interface BoardMapper {
    
    List<BoardEntity> getBoardList();
}
