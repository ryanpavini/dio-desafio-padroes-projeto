package com.dio.patterns.strategy;

public class SmsNotificationStrategy implements NotificationStrategy {
    @Override
    public void send(String message) {
        // Lógica real para enviar um SMS iria aqui (ex: integrando com um gateway de SMS)
        System.out.println("Enviando por SMS: " + message);
    }
}