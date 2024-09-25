package top.zh.util;

import cn.hutool.jwt.JWTUtil;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;
import top.zh.config.JwtConfig;

import java.util.Date;
import java.util.Map;

@Component
public class JwtUtil {

    @Resource
    private JwtConfig jwtConfig;

    public String generateToken(Map<String, Object> claims){
        claims.put("exp",new Date(System.currentTimeMillis()+jwtConfig.getExpiration()));
        return JWTUtil.createToken(claims,jwtConfig.getSecret().getBytes());
    }
//    public boolean validateToken(String token){
//        return jwtUtil.verify(token,jwtConfig.getSecret().getBytes());
//    }
}
