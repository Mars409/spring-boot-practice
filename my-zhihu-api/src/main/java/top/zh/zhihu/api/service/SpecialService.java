package top.zh.zhihu.api.service;

import top.zh.zhihu.api.enity.Special;

import java.util.List;
/**
 * @author
 * @date
 * @description
 * */
public interface SpecialService {
    List<Special> selectAll();
    List<Special> getByPage(int limit ,  int offset);
}
