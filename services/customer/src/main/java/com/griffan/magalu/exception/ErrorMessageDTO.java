package com.griffan.magalu.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ErrorMessageDTO {
    private String field;
    private String message;
}
