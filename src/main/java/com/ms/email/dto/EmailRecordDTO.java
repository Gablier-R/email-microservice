package com.ms.email.dto;

import java.util.UUID;

public record EmailRecordDTO(
        String emailTo,
        String subject,
        String text
) {}
