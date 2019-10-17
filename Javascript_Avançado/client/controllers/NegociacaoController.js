class NegociacaoController {

  constructor() {
    let $ = document.querySelector.bind(document)
    var vm = this
    //Isso mantém a associação com documet (pq o queryselector tem o this dentro dele)
    this._inputData = $('#data')
    this._inputQtt = $('#quantidade')
    this._inputValor = $('#valor')
  
    this._listaNegociacao = new ListaNegociacao(function(model) {
      vm._negociacaoView.update(model)
    })

    this._negociacaoView = new NegociacaoView($('#innerTableBody'))
    this._mensagem = new Mensagem()
    this._mensagemView = new MensagemView($('#mensagemView'))
  }

  adiciona(event) {
    event.preventDefault()

    let negociacao = this._criaNegociacao()
    this._mensagem.texto = 'Mensagem adicionada com sucesso'
    this._mensagemView.update(this._mensagem)

    this._listaNegociacao.adiciona(negociacao)
    this._limpaFormulatio()
  }

  _criaNegociacao() {
    let data = DateHelper.textoParaData(this._inputData.value)
    return new Negociacao(
      data,
      this._inputQtt.value,
      this._inputValor.value
    )
  }

  _limpaFormulatio() {
    this._inputData.value = ''
    this._inputQtt.value = 1
    this._inputValor.value = 0.0
    this._inputData.focus()
  }

  apaga() {
    this._listaNegociacao.esvazia()

    this._mensagem.texto="Negociações apagadas com sucesso"
    this._mensagemView.update(this._mensagem)
  }
}