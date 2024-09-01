## Fala Pessoal! Meu nome é Enzo, e eu sou desenvolvedor Java Backend :coffee:

### Kafka Library
<p align="left">
No decorrer dos meus projetos com micro-serviços, encontrava códigos que não agradavam visualmente quando era feita a configuração do kafka. Para remediar este problema, criei uma biblioteca que faria o trabalho da configuração automaticamente.
Como que esta lib trabalharia? Ela pega as propriedades da conexão diretamente dos seus arquivos de aplicação, então dados como o nome do consumidor e o tópico inferido, ela consegue captar diretamente dos arquivos yaml. 
Por qual razão usá-la, ao invés das configurações padrões do Kafka? Não seria mais necessário criar classes específicas para os consumidores e os produtores de mensagem, agora, tudo estaria encapsulado em um único método, deixando o código bem mais limpo e compactado. Além de, usar SLF4J enjessado nos métodos, deixando o tracing de erro já encapsulado sem a necessidade de configuração adicional. Está em fase de desenvolvimento este processo, mas, também trabalhariamos com conversões simples de valores, esperando um body T na entrada do método que será convertido em um JSON e enviado ao tópico.
Alguns modelos específicos de conversão (como Protocol Buffers) ainda não estão disponíveis nessa Release.
Introduzi um modelo de JAVADOC dentro dos métodos, então o CONTROL + Q deve ajudar a tirar dúvidas referente a como os métodos se comportam.

Em caso de dúvida ou alterações, estou a disposição. Abraços! 👋
