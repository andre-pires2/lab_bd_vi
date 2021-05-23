# Pratica 02 - TDD com análise de valores limites

Valores limites = -100 e 100 

Partiçao 1: 0

    Caso de teste 1
    <[0-0], 0>

Partiçao 2: 1 a 100

    Caso de teste 2
    <[(+ 0.11) - (+ 0.1)], 0.01>
    Caso de teste 3
    <[(+ 99.99) - (+ 99.98)], 0.01>

Partiçao 3: -1 a -100

    Caso de teste 4
    <[(- 0.11) - (- 0.1)], - 0.01>
    Caso de teste 5
    <[(- 99.99) - (- 99.98)], - 0.01>
