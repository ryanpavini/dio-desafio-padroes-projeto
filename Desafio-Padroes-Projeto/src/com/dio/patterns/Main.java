package com.dio.patterns;

import com.dio.patterns.singleton.NotificationService;
import com.dio.patterns.strategy.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Demonstração dos Padrões de Projeto Singleton e Strategy ---");

        // --- Padrão Singleton ---
        // Obtendo a instância única do serviço de notificação.
        // Todas as chamadas a getInstance() retornarão o MESMO objeto.
        NotificationService notificationService = NotificationService.getInstance();
        NotificationService anotherInstance = NotificationService.getInstance();

        // Verificando se ambas as referências apontam para o mesmo objeto na memória.
        if (notificationService == anotherInstance) {
            System.out.println("Singleton confirmado: Ambas as variáveis apontam para a mesma instância.");
        } else {
            System.out.println("Erro no Singleton: As instâncias são diferentes.");
        }

        // --- Padrão Strategy ---
        System.out.println("\n--- Enviando notificações usando diferentes estratégias ---");

        // Criando as diferentes estratégias de notificação
        NotificationStrategy email = new EmailNotificationStrategy();
        NotificationStrategy sms = new SmsNotificationStrategy();
        NotificationStrategy push = new PushNotificationStrategy();

        // Usando o serviço (Singleton) para enviar notificações com diferentes estratégias
        notificationService.sendNotification(email, "Bem-vindo! Confira nossas novas ofertas.");
        notificationService.sendNotification(sms, "Seu código de verificação é 12345.");
        notificationService.sendNotification(push, "Você tem uma nova mensagem!");

        System.out.println("\n--- Demonstração concluída ---");
    }
}