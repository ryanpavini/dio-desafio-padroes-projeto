package com.dio.patterns.singleton;

import com.dio.patterns.strategy.NotificationStrategy;

// A classe de serviço que usa o padrão Singleton.
public class NotificationService {

    // 1. A instância estática e privada da própria classe.
    private static NotificationService instance;

    // 2. Um construtor privado para impedir a criação de instâncias fora da classe.
    private NotificationService() {
        // Construtor privado para garantir que seja um singleton.
    }

    // 3. Um método público e estático para obter a única instância da classe.
    public static NotificationService getInstance() {
        if (instance == null) {
            instance = new NotificationService();
        }
        return instance;
    }

    // Método que utiliza uma Strategy para realizar a ação.
    public void sendNotification(NotificationStrategy strategy, String message) {
        strategy.send(message);
    }
}