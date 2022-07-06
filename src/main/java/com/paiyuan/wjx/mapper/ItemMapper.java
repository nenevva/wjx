package com.paiyuan.wjx.mapper;

import com.paiyuan.wjx.entity.Item;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ItemMapper {

    int itemAdd(Item item);
}
