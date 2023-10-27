package com.ms.email.consumer;

import com.ms.email.dto.EmailRecordDTO;
import com.ms.email.entity.Email;
import com.ms.email.service.EmailService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.BeanUtils;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class EmailConsumer {

    final EmailService emailService;

    public EmailConsumer(EmailService emailService) {
        this.emailService = emailService;
    }

    @RabbitListener(queues = "${broker.queue.email.name}")
    public void listenEmailQueue(@Payload EmailRecordDTO emailRecordDTO){

        var emailModel = new Email();
        BeanUtils.copyProperties(emailRecordDTO, emailModel);

        //sendEmail
        emailService.sendEmail(emailModel);
    }

}
