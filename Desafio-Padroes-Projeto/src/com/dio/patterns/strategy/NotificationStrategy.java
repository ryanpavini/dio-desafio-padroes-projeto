package com.dio.patterns.strategy;

// A interface Strategy define o contrato para todos os algoritmos de notificação.
public interface NotificationStrategy {
    void send(String message);
}