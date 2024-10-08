package com.allclearwaiting.waiting.global.apiPayload.code.status;

import com.allclearwaiting.waiting.global.apiPayload.ApiResponse;
import org.springframework.http.HttpStatus;

public interface BaseErrorCode {

    HttpStatus getHttpStatus();

    String getCode();

    String getMessage();

    ApiResponse<Void> getErrorResponse();
}
