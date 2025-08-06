package com.dio.patterns.strategy;

public class EmailNotificationStrategy implements NotificationStrategy {
    @Override
    public void send(String message) {
        // Lógica real para enviar um email iria aqui (ex: usando JavaMail API)
        System.out.println("Enviando por Email: " + message);
    }
}