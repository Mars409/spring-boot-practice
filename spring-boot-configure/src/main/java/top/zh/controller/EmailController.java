package top.zh.controller;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import top.zh.entity.Mail;
import top.zh.service.EmailService;

@RestController
@AllArgsConstructor
public class EmailController {
    private EmailService emailService;

    @PostMapping("/mail")
    public void sendEmail(@RequestBody Mail mail) {
        emailService.sendSimpleEmail(mail.getTo(), mail.getSubject(), mail.getBody());
    }
}
