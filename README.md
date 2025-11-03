## Simulador de Carro (Car Simulator)
[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)](https://www.java.com/) [![Status](https://img.shields.io/badge/Status-Concluído-green?style=for-the-badge)](#)

--- 

Este é um projeto de simulação de controle de um veículo em Java, desenvolvido como exercício
de programação orientada a objetos. O simulador permite interagir com um carro virtual através
de um menu interativo, respeitando regras realistas como limites de velocidade por marcha e 
condições para ligar/desligar.

--- 

## Descrição (Description)
#### Português (pt-BR)
Este projeto implementa um simulador simples de carro em Java, onde o usuário pode controlar 
funções básicas de um veículo através de um menu no console. O foco está na aplicação de 
conceitos de POO (Programação Orientada a Objetos), validações de estado e regras de negócio.

#### English
This project implements a simple car simulator in Java, allowing users to control basic 
vehicle functions through an interactive console menu. It emphasizes OOP 
(Object-Oriented Programming) concepts, state validations, and business rules. 

--- 

## Funcionalidades (Features)
#### Português (pt-BR)
+ Ligar/Desligar o carro: Só é possível desligar se estiver em ponto morto (marcha 0) e velocidade 0.
+ Acelerar/Frear: Incremento/decremento de velocidade com limites por marcha (até 120 km/h).
+ Virar: Apenas se velocidade estiver entre 1-40 km/h.
+ Trocar marcha: Sequencial (não pula marchas), respeitando faixas de velocidade.
+ Verificar velocidade: Exibe a velocidade atual.
+ Menu interativo: Usando switch-case para navegação fácil.
+ Validações: Carro deve estar ligado para ações; limites de velocidade por marcha (ex.: marcha 1: 0-20 km/h).

#### English

+ Start/Stop the car: Can only stop if in neutral (gear 0) and speed 0.
+ Accelerate/Brake: Speed increment/decrement with gear limits (up to 120 km/h).
+ Turn: Only if speed is between 1-40 km/h.
+ Shift gears: Sequential (no skipping gears), respecting speed ranges.
+ Check speed: Displays current speed.
+ Interactive menu: Using switch-case for easy navigation.
+ Validations: Car must be on for actions; speed limits per gear (e.g., gear 1: 0-20 km/h).

--- 

## Como Usar (How to Use)

#### Português (pt-BR)

Pré-requisitos: Java 8+ instalado.
Clone o repositório: git clone https://github.com/caiqso/simulador-carro.git
Compile: javac Main.java Carro.java
Execute: java Main
Interaja: Use o menu numérico para controlar o carro (ex.: 1 para ligar, 3 para acelerar).

#### English

Prerequisites: Java 8+ installed.
Clone the repository: git clone https://github.com/caiqso/simulador-carro.git
Compile: javac Main.java Carro.java
Run: java Main
Interact: Use the numeric menu to control the car (e.g., 1 to start, 3 to accelerate).

--- 

## Estrutura do Projeto (Project Structure)

Estrutura de pastas e arquivos do projeto:

```text
FuncoesCarroJava/
│ ├──src/
│ ├── Carro.java   # Classe principal com lógica do carro
│ ├── Main.java    # Classe com menu interativo
│
└── README.md      # Este arquivo   
```

---

## Exemplos de Uso (Usage Examples)

#### Português (pt-BR)

Ligue o carro (opção 1), troque para marcha 1 (opção 7), acelere até 20 km/h (opção 3), 
vire para esquerda (opção 5), freie e desligue (opção 2).
Cenário de erro: Tente acelerar sem ligar. O sistema informa que não é possível.

#### English
Start the car (option 1), shift to gear 1 (option 7), accelerate to 20 km/h (option 3), 
turn left (option 5), brake, and stop (option 2).
Error scenario: Try to accelerate without starting. The system notifies it's not possible.

## Regras de Negócio (Business Rules)

#### Português (pt-BR)

+ Carro começa desligado, em marcha 0 e velocidade 0.
+ Aceleração: +1 km/h por vez, limitada pela marcha.
+ Marchas: 0 (ponto morto) a 6, com faixas de velocidade específicas.
+ Desligar: Apenas em marcha 0 e velocidade 0.
+ Virar: Velocidade 1-40 km/h.

#### English

+ Car starts off, in gear 0, and speed 0.
+ Acceleration: +1 km/h at a time, limited by gear.
+ Gears: 0 (neutral) to 6, with specific speed ranges.
+ Stop: Only in gear 0 and speed 0.
+ Turn: Speed 1-40 km/h. 


---

## Contribuição (Contributing)

#### Português (pt-BR)
Contribuições são bem-vindas! Abra uma issue ou pull request no GitHub. Siga boas práticas de código.

#### English
Contributions are welcome! Open an issue or pull request on GitHub. Follow good coding practices.

## Autor (Author)

#### Português (pt-BR)

Desenvolvido por Caíque Soares.

#### English
Developed by Caíque Soares.

[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/caiquesoaress/)
[![Gmail](https://img.shields.io/badge/Gmail-D14836?style=for-the-badge&logo=gmail&logoColor=white)](mailto:caiquesoaressilva13@gmail.com)
[![GitHub](https://img.shields.io/badge/GitHub-000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/caiqso)

--- 
_Projeto criado para fins educacionais e portfólio. Divirta-se simulando!_ 🚗

_Project created for educational purposes and portfolio. Enjoy simulating!_ 🚗