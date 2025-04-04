programa {
  funcao inicio() {
    inteiro vetor[10] = {6, 4, 10, 3, 5, 9, 7, 8, 1, 2}
    inteiro maior

    para (inteiro i = 0; i < 10; i++) {
      maior = vetor[i]
      para (inteiro j = i+1; j < 10; j++) {
        se (maior < vetor[j]) {
          maior = vetor[j]
          vetor[j] = vetor[i]
          vetor[i] = maior
        }
      }
    }
    escreva(vetor)
  }
}
