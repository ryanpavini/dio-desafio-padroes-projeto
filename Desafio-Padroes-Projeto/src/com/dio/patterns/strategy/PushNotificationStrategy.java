package com.dio.patterns.strategy;

public class PushNotificationStrategy implements NotificationStrategy {
    @Override
    public void send(String message) {
        // Lógica real para enviar uma notificação Push iria aqui (ex: usando Firebase Cloud Messaging)
        System.out.println("Enviando por Push Notification: " + message);
    }
}