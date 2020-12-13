package com.vti.exception;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.vti.config.MessageProperty;

//Khai báo 1 thằng exception Global
//@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

	@Autowired
	private MessageProperty messageProperty;

	@ExceptionHandler({ Exception.class })
	public ResponseEntity<?> handleAll(Exception exception) {
		ApiErrorRespone error = new ApiErrorRespone(HttpStatus.INTERNAL_SERVER_ERROR,
				"Đã có lỗi từ server. Liên hệ Duyn03@gmai.com", exception.getMessage());
		return new ResponseEntity<>(error, error.getStatus());
	}

	// Not found entity
	@ExceptionHandler({ EntityNotFoundException.class })
	public ResponseEntity<?> handlExceptionNotFound(EntityNotFoundException exception) {
		ApiErrorRespone error = new ApiErrorRespone(HttpStatus.NOT_FOUND, "Không tìm thấy tài nguyên bạn yêu cầu",
				exception.getMessage());
		return new ResponseEntity<>(error, error.getStatus());
	}

	@Override
	protected ResponseEntity<Object> handleMissingServletRequestParameter(
			MissingServletRequestParameterException exception, HttpHeaders headers, HttpStatus status,
			WebRequest request) {
		ApiErrorRespone error = new ApiErrorRespone(HttpStatus.BAD_REQUEST, "Kiểm tra lại parameter",
				exception.getMessage());
		return new ResponseEntity<>(error, error.getStatus());
	}

	@Override
	protected ResponseEntity<Object> handleServletRequestBindingException(ServletRequestBindingException exception,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		ApiErrorRespone error = new ApiErrorRespone(HttpStatus.BAD_REQUEST, "Kiểm tra lại parameter",
				exception.getMessage());
		return new ResponseEntity<>(error, error.getStatus());
	}

}
