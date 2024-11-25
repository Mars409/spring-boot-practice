package top.zh.zhihu.api.controller;


import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import top.zh.zhihu.api.service.SpecialService;
import top.zh.zhihu.api.common.ResponseResult;
import top.zh.zhihu.api.enity.Special;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/special")
public class SpecialController {
    @Resource
    private SpecialService specialService;

    @GetMapping("/all")
    public ResponseResult getAll() {
        List<Special> all = specialService.selectAll();
        return ResponseResult.builder()
                .code(200)
                .msg("数据获取成功")
                .data(all)
                .build();
    }
    @GetMapping("/page")
    public ResponseResult getByPage(@RequestParam int limit, @RequestParam int offset) {
        Map<String,Object> map = new HashMap<>();
        List<Special> specials = specialService.getByPage(limit, offset);
        map.put("specials",specials);
        map.put("total",specialService.selectAll().size());
        return ResponseResult.builder()
                .code(200)
                .msg("数据获取成功")
                .data(map)
                .build();
    }

}