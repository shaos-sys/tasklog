
# 📋 TaskLog - Lista de tarefas em Java.
Projeto pessoal criado para estudo e prática de Java, com foco em manipulação de arquivos, orientação a objetos e organização de código em camadas.

# ✨ Funcionalidades:
```
• Adicionar, remover e listar tarefas via menu no console.
• Gerar automaticamente um arquivo .txt com todas as tarefas do dia.
• Nome do arquivo gerado dinamicamente com a data atual (Tarefas do dia AAAA-MM-DD.txt).
• Arquivo salvo diretamente na Área de Trabalho do usuário.
```
# 🛠️ Tecnologias e conceitos aplicados
```
• Java (sem dependências externas).
• ArrayList para armazenamento das tarefas.
• FileWriter para geração do arquivo .txt
• LocalDate para nomear o arquivo com a data do dia.
• Interfaces e encapsulamento, aplicados na separação entre contrato (interface) e implementação (ListaTasks).
• Organização em pacotes, separando responsabilidades:
  model → interface e classe de gerenciamento das tarefas.
  view → classe Menu, responsável pela interação com o usuário.
```
# 📁 Estrutura do projeto
```
src/
  model/
    GerenciadorTarefas.java   (interface)
    ListaTasks.java
  view/
    Menu.java
  Main.java
```
# ▶️ Como executar
```
Compile os arquivos .java do projeto
Execute a classe Main
Use o menu para adicionar suas tarefas
Ao final, o sistema gera um arquivo .txt com todas as tarefas do dia, salvo na Área de Trabalho
```
# 🖥️ Exemplo de uso 
```
No terminal, o usuário encontra as seguintes opções:

[1] Adicionar tarefas.
[2] Remover tarefas.
[3] Exibir lista de tarefas.
[4] Gerar arquivo de tarefas.
[5] Sair.

O usuário seleciona a opção desejada, e quando o arquivo é gerado na área de trabalho dessa maneira, por exemplo:

Tarefas do dia 2026-08-18.txt

====================TAREFAS DO DIA====================
Data de hoje: 18/08/2026

Estudar POO (continuar aula do curso de Java POO - parei na aula 08)
Fazer lista de exercícios Java de POO
Fazer exercício de matemática computacional para aula de hoje
Academia (treinar peito e tríceps)
Arrumar fechadura da porta do quarto
=====================================================       
```
# 🚀 Possíveis melhorias futuras
```
Persistência de dados entre execuções (ex: salvar em um arquivo próprio e recarregar ao iniciar)
Marcar tarefas como concluídas
Interface gráfica
```

Projeto desenvolvido por Hélio Souza para fins de estudo e prática de Java.
