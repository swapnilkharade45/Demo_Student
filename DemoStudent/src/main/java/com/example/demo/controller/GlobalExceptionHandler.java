package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.demo.exception.InvalidRollNumberException;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(InvalidRollNumberException.class)
	public ResponseEntity<?> invalidRollNumberExceptionHandler(InvalidRollNumberException e) {
		return ResponseEntity.status(700).body(e.getMessage());
	}
}
