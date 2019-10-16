class NegociacaoController {

  constructor() {
    let $ = document.querySelector.bind(document)
    //Isso mantém a associação com documetn (pq o queryselector tem o this dentro dele)
    this._inputData = $('#data')
    this._inputQtt = $('#quantidade')
    this._inputValor = $('#valor')

  }
  adiciona(event) {
    event.preventDefault()

    let data = DateHelper.textoParaData(this._inputData.value)

    let negociacao = new Negociacao(
      data,
      this._inputQtt.value,
      this._inputValor.value
    )

    let diaMesAno = DateHelper.dataParaTexto(negociacao.data)

  }
}