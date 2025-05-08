#  rabbitmq-test-backend-api

Este projeto é uma API desenvolvida com Java e Spring Boot, designada para Gerenciamento de Clientes

## Tecnologias Utilizadas

- **Java 17**: Versão do Java utilizada no projeto.
- **Spring Boot**: Framework principal para a criação de aplicações Spring.

````shell
docker-compose up --build
````

## RabbitMQ
http://localhost:15672/
- guest / guest

### Queues
- pagamento-request-queue
- pagamento-response-queue

### Exchange
- pagamento-request-exchange
- pagamento-response-exchange

### Routing key (binding in Exchange)
- pagamento-request-rout-key
- pagamento-response-rout-key

## Postman
localhost:8080/pagamentos
````
{
"numeroPedido":123,
"valor":100,
"produto":"Tenis"
}
````
## Portas configuradas

App: http://localhost:8080

## Git
https://github.com/jorgepontilho/rabbitmq-test-backend-api