programa {
  funcao inicio() {
    const inteiro tamanho_vetor = 10
    inteiro vetor[tamanho_vetor], total = 0
    real media

    para (inteiro i = 0; i < tamanho_vetor; i++) {
      escreva("Digite o ",i+1,"º número do vetor: ")
      leia(vetor[i])
      limpa()
    }

    escreva("Elementos nos índices ímpares:\n")
    para (inteiro i=0; i < tamanho_vetor; i++) {
      se (i % 2 != 0) { escreva(vetor[i], " ") }
      total += vetor[i]
    }
    media = total/10
    
    escreva("\n\nElementos pares:\n")
    para (inteiro i=0; i < tamanho_vetor; i++) { se (vetor[i] % 2 == 0) { escreva(vetor[i]," ") } }
    escreva("\n\nSoma:\n", total)
    escreva("\n\nMédia:\n", media)
  }
}
