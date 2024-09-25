package top.zh.util;

import com.aliyun.oss.OSS;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
import top.zh.config.OssConfig;

import java.io.InputStream;
import java.util.UUID;

@Component
public class OssUtill {

    @Resource
    private OSS ossClient;

    @Resource
    private OssConfig ossConfig;

    public String uploadFile(MultipartFile file) {
        try {
            String originalFilename=file.getOriginalFilename();
            if(originalFilename==null){
                throw new IllegalArgumentException("文件名称不能为空");
            }
            String fileName= UUID.randomUUID().toString()+"_"+originalFilename;
            InputStream inputStream=file.getInputStream();
            ossClient.putObject(ossConfig.getBucketName(),fileName,inputStream);
            return"https://"+ossConfig.getBucketName()+"."+ossConfig.getEndpoint().replace("https://","")+"/"+fileName;
        } catch (Exception e) {
            throw new RuntimeException("文件上传失败",e);
        }
    }
}
