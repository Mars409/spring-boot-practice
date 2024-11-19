package top.zh.zhihu.api.mapper;

import org.apache.ibatis.annotations.Param;
import top.zh.zhihu.api.enity.Special;

import java.util.List;

public interface SpecialMapper {
    List<Special> selectAll();
    List<Special> selectByPage(@Param("limit")int limit, @Param("offset")int offset);

}
