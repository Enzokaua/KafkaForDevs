# lib-kafkaDevs - Biblioteca para Integração com Apache Kafka

> A **lib-kafkaDevs** é uma biblioteca desenvolvida para simplificar a configuração e o uso do **Apache Kafka** e **Zookeeper**, fornecendo métodos prontos para envio e consumo de mensagens em tópicos. A biblioteca utiliza **Spring Framework (versão 3.3.3)** e **SLF4J** para registro de logs, garantindo uma implementação limpa e de fácil manutenção.
> Essa biblioteca foi projetada seguindo os princípios de **Clean Code**, com métodos reutilizáveis e configuráveis via arquivos `.properties`. A ideia é oferecer uma solução padronizada e funcional para desenvolvedores que desejam integrar seus sistemas ao Kafka de forma rápida e eficiente.

## Principais Dependências
- Spring Framework 3.3.3: Para configuração de listeners e producers.
- SLF4J: Para registro de logs de mensagens e operações.
- Configurações dinâmicas via arquivos .properties, como:
- kafka.topic.name: Nome do tópico Kafka.
- kafka.consumer.group: Nome do grupo do consumidor.

A biblioteca fornece os seguintes métodos principais:

### 💻 Pré-requisitos

Antes de integrar a biblioteca ao seu projeto, certifique-se de ter configurado o ambiente corretamente:
```properties
kafka.topic.name=seu-topico
kafka.consumer.group=seu-grupo
spring.kafka.bootstrap-servers=localhost:9092
```

### 🚀 Sobre a biblioteca

O objetivo da lib-kafkaDevs é abstrair a complexidade da configuração de Kafka, oferecendo métodos prontos para consumo e envio de mensagens. A biblioteca inclui logs detalhados para monitoramento e depuração, e foi projetada para ser facilmente extensível.
Se você deseja otimizar o consumo e produção de mensagens no Kafka com foco em boas práticas de desenvolvimento, essa biblioteca é uma excelente opção.


### :coffee: Como Usar

1- Adicione a biblioteca ao seu projeto:
Caso esteja em um repositório Maven, adicione a dependência no pom.xml:
```xml
<dependency>
    <groupId>com.enzo.kafka</groupId>
    <artifactId>lib-kafkaDevs</artifactId>
    <version>1.0.0</version>
</dependency>
```
2- Configure seu arquivo .properties: Certifique-se de fornecer os valores corretos para os tópicos e servidores Kafka.

3- Utilize os métodos prontos:

```java
/**
 * Para consumir mensagens
 */
consumerMessage(record);


/**
 * Para produzir mensagens
 */
sendMessage("nome-do-topico", "sua-mensagem");
```

Se você tiver dúvidas ou sugestões, sinta-se à vontade para entrar em contato. Boas integrações! 🚀
