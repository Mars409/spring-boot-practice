package top.zh.controller;

import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import top.zh.entity.Special;
import top.zh.mapper.SpecialMapper;

import java.util.List;

@RestController
public class SpecialController {
    @Resource
    private SpecialMapper specialMapper;

    @GetMapping("/specials")
    public List<Special> getSpecials() {
        return specialMapper.findAll();
    }
}
