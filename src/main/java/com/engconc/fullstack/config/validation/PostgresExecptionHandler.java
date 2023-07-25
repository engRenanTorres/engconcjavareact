package com.engconc.fullstack.config.validation;

import org.springframework.core.NestedExceptionUtils;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class PostgresExecptionHandler {


    @ExceptionHandler(DataIntegrityViolationException.class)
    public DBExceptionDto conflict(DataIntegrityViolationException e) {

      String message = NestedExceptionUtils.getMostSpecificCause(e).getMessage();
      DBExceptionDto error = new DBExceptionDto(message, false);
      return error;
    }

}
