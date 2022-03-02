package com.sample.restaurantmanagementsystem.exception;

public class ItemConflictException extends ConflictException{
    public ItemConflictException(String message) {
        super(message);
    }
}
