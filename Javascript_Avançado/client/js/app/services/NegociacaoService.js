class NegociacaoService {
  obterNegociacoesDaSemana() {
    let xhr = new XMLHttpRequest()
    return new Promise((resolve, reject) => {
      xhr.open('GET', 'negociacoes/semana')
      xhr.onreadystatechange = () => {
        if (xhr.readyState == 4) {
          if (xhr.status == 200) {
            resolve(JSON.parse(xhr.responseText)
              .map(negociacao => new Negociacao(new Date(negociacao.data), negociacao.quantidade, negociacao.valor)))
          } else {
            resolve("Não foi possível obter as negociações")
            console.log(xhr.responseText)
          }
        }
      }
      xhr.send()
    })
  }

  obterNegociacoesDaSemanaAnterior() {
    let xhr = new XMLHttpRequest()
    return new Promise((resolve, reject) => {
      xhr.open('GET', 'negociacoes/anterior')
      xhr.onreadystatechange = () => {
        if (xhr.readyState == 4) {
          if (xhr.status == 200) {
            resolve(JSON.parse(xhr.responseText)
              .map(negociacao => new Negociacao(new Date(negociacao.data), negociacao.quantidade, negociacao.valor)))
          } else {
            resolve("Não foi possível obter as negociações")
            console.log(xhr.responseText)
          }
        }
      }
      xhr.send()
    })
  }

  obterNegociacoesDaSemanaRetrasada() {
    let xhr = new XMLHttpRequest()
    return new Promise((resolve, reject) => {
      xhr.open('GET', 'negociacoes/retrasada')
      xhr.onreadystatechange = () => {
        if (xhr.readyState == 4) {
          if (xhr.status == 200) {
            resolve(JSON.parse(xhr.responseText)
              .map(negociacao => new Negociacao(new Date(negociacao.data), negociacao.quantidade, negociacao.valor)))
          } else {
            resolve("Não foi possível obter as negociações")
            console.log(xhr.responseText)
          }
        }
      }
      xhr.send()
    })
  }
}