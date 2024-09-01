## Fala Pessoal! Meu nome é Enzo, e eu sou desenvolvedor Java Backend :coffee:

### Kafka Library
<p align="left">
No decorrer dos meus projetos com micro-serviços, encontrava códigos que não agradavam visualmente quando era feita a configuração do kafka. Para remediar este problema, criei uma biblioteca que faria o trabalho da configuração automaticamente.
Como que esta lib trabalharia? Ela pega as propriedades da conexão diretamente dos seus arquivos de aplicação, então dados como o nome do consumidor e o tópico inferido, ela consegue captar diretamente dos arquivos yaml. Está em fase de desenvolvimento este processo, mas até então trabalhariamos com conversões simples de valores, esperando um body T na entrada do método que será convertido em um JSON e enviado ao tópico.
Alguns modelos específicos de conversão (como Protocol Buffers) ainda não estão disponíveis nessa versão.
Introduzi um modelo de JAVADOC dentro dos métodos, então o CONTROL + Q deve ajudar a tirar dúvidas referente a como os métodos se comportam.

Em caso de dúvida ou alterações, estou a disposição. Abraços! 👋
