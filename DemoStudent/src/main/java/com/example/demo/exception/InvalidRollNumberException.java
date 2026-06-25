package com.example.demo.exception;

public class InvalidRollNumberException extends RuntimeException {

	public InvalidRollNumberException(String msg) {
		super(msg);
	}
}
