# Prática 02: Lab VI BD - 2021.1
- ### Aluna: Leticia Macedo Prudente de Carvalho
- ### RA: 1460281813024
- ### Professor: Fabrício Galende
_________________________________

#### Descrição da Prática 02: TDD com análise de valores limites

- ###### Instruções:

        Repita a Prática 01 (mesmos requisitos de vídeo, código com build, git etc.) mas agora utilizando o critério de análise de valores limites para especificar os casos de teste. Em seu trabalho assegure-se de:
            Colocar todos os arquivos de seu sistema no mesmo repositório do Git/GitHub mas em uma pasta denominada de pratica_02;
            Utilizar um arquivo README.MD dentro de pratica_02 para documentar/descrever as partições de equivalência utilizadas nas especificação dos casos de teste;
            Para o caso de dados potencialmente muito grandes (ex. limites muito grandes para as partições), defina um limite "razoável" ou dentro de uma faixa de interesse para seu componente da calculadora. Especifique, também, uma tolerância para o cálculo dos valores nas vizinhanças das partições quando utilizar números de ponto flutuante (e.g.: 0.01, 0.001, etc..).
        
        Caso você entregue essa tarefa sem falhas graves e corrigindo os problemas apontados na Prática 1, sua nota na prática 1 poderá sofrer upgrade de até 50 pts, numa escala de 0 a 100.


#### Tema Escolhido: Cáculo do Inverso

```Exemplo: ao receber x, retornar 1/x```

Análise de Valores Limites

> Partição válida fictícia 1: x >= 1 e x <= 10.000
    CT1: <[1], 1> ; <[10.000], 0,0001]>

> Partição inválida fictícia 1:
    CT3: <[0], tratamento de erro>

> Partição inválida fictícia 2: x > 10.0001
    CT3: < [10.001], 9.99900009999>

Valores utilizados para teste de valor limite fictício:
    ```{0, 1 , 10.000, 10.001}```

