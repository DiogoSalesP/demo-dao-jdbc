# Projeto Demo-DAO-JDBC

Este é um projeto de demonstração que utiliza Java e JDBC para realizar operações CRUD (Create, Read, Update, Delete) em um banco de dados MySQL. Ele serve como um exemplo simples de como criar um aplicativo Java que se conecta a um banco de dados relacional e executa operações básicas.

## Pré-requisitos

Antes de executar este projeto, você precisará ter o seguinte instalado em sua máquina:

- Java Development Kit (JDK)
- MySQL Server
- MySQL Connector/J (uma biblioteca JDBC para MySQL)

Certifique-se de configurar seu MySQL Server com as configurações apropriadas (como nome de usuário, senha e banco de dados) antes de prosseguir.

## Configuração

1. Clone este repositório para sua máquina local usando o seguinte comando:

   ```bash
   git clone https://github.com/DiogoSalesP/demo-dao-jdbc.git
2. Abra o projeto em sua IDE de escolha (por exemplo, Eclipse, IntelliJ IDEA, etc.).

3. Certifique-se de adicionar o MySQL Connector/J ao seu projeto como uma biblioteca externa.

4. Configure as informações de conexão com o banco de dados no arquivo src/main/resources/db.properties. Insira seu nome de usuário, senha, URL do banco de dados e outras informações relevantes.

# Executando o Projeto
Após configurar o projeto e o banco de dados, você pode executar o aplicativo para realizar operações CRUD simples. O projeto já inclui algumas classes de exemplo para demonstrar como usar o JDBC para:

Inserir um novo registro no banco de dados.
Atualizar um registro existente.
Consultar dados do banco de dados.
Excluir um registro do banco de dados.
Você pode executar as classes de exemplo da sua IDE ou construir um programa Java personalizado para interagir com o banco de dados de acordo com suas necessidades.

# Contribuindo
Se você deseja contribuir para este projeto, sinta-se à vontade para fazer um fork e criar uma solicitação pull. Também estamos abertos a sugestões e melhorias.

# Licença
Este projeto está licenciado sob a Licença MIT.
