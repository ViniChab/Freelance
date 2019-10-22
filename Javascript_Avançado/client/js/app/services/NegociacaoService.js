class NegociacaoService {
  obterNegociacoesDaSemana(callback) {
    let xhr = new XMLHttpRequest()
    xhr.open('GET', 'negociacoes/semana')
    xhr.onreadystatechange = () => {
      if (xhr.readyState == 4) {
        if (xhr.status == 200) {
          callback(null, JSON.parse(xhr.responseText)
            .map(negociacao => new Negociacao(new Date(negociacao.data), negociacao.quantidade, negociacao.valor)))
        } else {
          callback("Não foi possível obter as negociações", null)
          console.log(xhr.responseText)
        }
      }
    }
    xhr.send()
  }
}