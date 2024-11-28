package com.inventario.producto;

import java.time.LocalDate;

public class MessageDto {
    private LocalDate date;
    private String message;

    public MessageDto(LocalDate date, String message) {
        this.date = date;
        this.message = message;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}