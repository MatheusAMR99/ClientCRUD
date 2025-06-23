🧩 Desafio: CRUD de Clientes - Formação Desenvolvedor Moderno
Projeto desenvolvido como parte da Formação Desenvolvedor Moderno - Back end, no capítulo sobre API REST, camadas, CRUD, exceções e validações, da DevSuperior.
🚀 Sobre o Projeto
Aplicação Spring Boot que implementa um CRUD completo para gerenciamento de clientes, com cinco operações REST básicas:
- 🔍 Busca paginada de clientes
- 🔎 Busca de cliente por ID
- ➕ Inserção de novo cliente
- ✏️ Atualização de cliente existente
- ❌ Deleção de cliente
O sistema utiliza banco de dados em memória H2, Maven como gerenciador de dependências e Java 17 como linguagem principal.
🧪 Funcionalidades adicionais
- Validações de dados:
- Nome não pode ser vazio
- Data de nascimento deve ser uma data passada ou presente
- Tratamento de exceções personalizadas:
- Código 404 para recurso não encontrado
- Código 422 para erros de validação com mensagens específicas por campo
- Seed automático de 10 clientes com dados reais e significativos
- Padrão camelCase → snake_case aplicado corretamente para compatibilidade JPA / banco de dados
🧰 Tecnologias utilizadas
- Java
- Spring Boot
- Spring Data JPA
- H2 Database
- Maven
- Bean Validation

📫 Como executar
- Clone o repositório
- Importe na sua IDE (IntelliJ / Eclipse)
- Execute a aplicação
- Teste as funcionalidades via Postman com as rotas definidas
