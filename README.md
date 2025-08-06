# Desafio de Padrões de Projeto com Java

Este projeto foi desenvolvido como solução para o desafio "Aprenda na Prática Programação Orientada a Objetos" da [Digital Innovation One](https://www.dio.me/).

O objetivo é demonstrar a aplicação prática de Padrões de Projeto (Design Patterns) em um cenário do mundo real.

## 🚀 Padrões Utilizados

Foram implementados dois padrões de projeto clássicos para criar um sistema de notificações flexível e bem estruturado:

### 1. Singleton
- **O que é:** Garante que uma classe tenha apenas uma instância e fornece um ponto de acesso global a ela.
- **Onde foi aplicado:** Na classe `NotificationService`. Independentemente de quantas vezes `NotificationService.getInstance()` for chamado, ele sempre retornará o mesmo objeto, garantindo um controlador central único para o envio de notificações.

### 2. Strategy
- **O que é:** Define uma família de algoritmos, encapsula cada um deles e os torna intercambiáveis. A Strategy permite que o algoritmo varie independentemente dos clientes que o utilizam.
- **Onde foi aplicado:** Na funcionalidade de envio de notificações.
    - `NotificationStrategy`: É a interface que define o contrato comum para todas as estratégias.
    - `EmailNotificationStrategy`, `SmsNotificationStrategy`, `PushNotificationStrategy`: São as implementações concretas, cada uma com sua própria lógica de envio.
    - O `NotificationService` recebe uma dessas estratégias e a utiliza para executar o envio, sem precisar conhecer os detalhes de implementação de cada uma.

## ⚙️ Como Executar

1. Clone este repositório:
   ```bash
   git clone [https://github.com/SEU-USUARIO/dio-desafio-padroes-projeto.git](https://github.com/SEU-USUARIO/dio-desafio-padroes-projeto.git)
   ```
2. Navegue até a pasta `src`:
   ```bash
   cd dio-desafio-padroes-projeto/src
   ```
3. Compile os arquivos Java:
   ```bash
   javac com/dio/patterns/Main.java com/dio/patterns/singleton/NotificationService.java com/dio/patterns/strategy/*.java
   ```
4. Execute a classe principal:
   ```bash
   java com.dio.patterns.Main
   ```

## ✅ Resultado Esperado

A execução do programa irá demonstrar que a instância do `NotificationService` é única (Singleton) e que diferentes métodos de notificação (Strategy) podem ser utilizados de forma intercambiável.
