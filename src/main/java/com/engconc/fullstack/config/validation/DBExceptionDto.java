package com.engconc.fullstack.config.validation;

public class DBExceptionDto {
  private String error;
  private boolean success;

  public DBExceptionDto(String error, boolean success) {
    this.error = error;
    this.success = success;
  }

  public String getError() {
    return error;
  }

  public boolean getSuccess() {
    return success;
  }
}
