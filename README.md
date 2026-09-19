# 🛒 Sistema de Compras Online em Java

Um sistema interativo em linha de comando (CLI) desenvolvido em Java para gerenciamento de uma lista de compras. O projeto permite adicionar, visualizar, buscar e remover itens com tratamento de exceções para garantir a estabilidade durante a navegação.

---

## 📌 Sobre o Projeto

Este projeto foi desenvolvido como parte dos meus estudos de lógica de programação e fundamentos da linguagem Java. O objetivo principal foi criar um sistema de menu robusto, capaz de manipular coleções dinâmicas de dados e tratar erros de entrada do usuário sem interromper a execução do programa.

---

## 🚀 Funcionalidades

- **➕ Adicionar itens:** Permite a inserção contínua de produtos na lista até que o usuário decida voltar ao menu.
- **📋 Listar itens:** Exibe todos os itens cadastrados juntamente com seus respectivos índices de posição.
- **🔍 Buscar por índice:** Localiza e exibe o elemento correspondente à posição informada pelo usuário.
- **🗑️ Remover itens:** Permite a remoção de itens específicos da lista pelo nome.
- **🛡️ Tratamento de Erros (UX):** Captura de exceções (`InputMismatchException`) para evitar que o programa feche em caso de digitação de caracteres inválidos nos menus e buscas.

---

## 🛠️ Tecnologias Utilizadas

- **Linguagem:** Java (JDK 15 ou superior)
- **Coleções:** `ArrayList` / `List`
- **Entrada de Dados:** `Scanner`
- **Tratamento de Exceções:** `try-catch` (`InputMismatchException`)

-
## 💻 Como Executar o Projeto

### Pré-requisitos
- Ter o **Java Development Kit (JDK)** instalado em sua máquina (versão 15+ recomendada).
- Um terminal ou IDE de sua preferência (VS Code, IntelliJ IDEA, Eclipse, NetBeans).

### Passo a passo

1. **Clone o repositório:**
git clone [https://github.com/Ever1pdl/Sistema-de-lista-JAVA.git](https://github.com/Ever1pdl/Sistema-de-lista-JAVA.git)
2. **Navegue até o diretório do projeto:**
cd nome-do-repositorio
3. **Compile o código Java:**
javac Main.java
4. **Execute a aplicação:**
Java Main

## 🧠 Aprendizados e Desafios

Durante o desenvolvimento deste projeto, explorei conceitos fundamentais de desenvolvimento em Java:
- Manipulação de coleções dinâmicas com `ArrayList`.
- Gerenciamento de fluxo com estruturas condicionais (`switch`, `if/else`) e laços de repetição (`while`).
- Limpeza do buffer do `Scanner` (`nextLine()`) para evitar travamentos na leitura de dados.
- Implementação de um loop de validação contínuo com `try-catch` para garantir uma boa experiência do usuário.

---

## 👨‍💻 Autor

Desenvolvido por **[Ever1pdl/Lazaro H.]**  

