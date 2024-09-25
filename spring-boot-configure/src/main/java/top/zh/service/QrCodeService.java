package top.zh.service;

import cn.hutool.extra.qrcode.QrCodeUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.File;

@Service
@Slf4j
public class QrCodeService {
    @Value("${custom.qrcode.content}")
    private String qrCodeContent;

    public void generateCode() {
        QrCodeUtil.generate(qrCodeContent,300,300,new File("qrcode.png"));
        log.info("二维码生成成功！");
    }
}
