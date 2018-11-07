package com.firminli.mapper;

import com.firminli.pojo.Comments;
import com.firminli.utils.MyMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CommentsMapper extends MyMapper<Comments> {
}