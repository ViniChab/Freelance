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

    let data = this._inputData.value.split('-')
    data = new Date(data[0], data[2], data[1])
    console.log(data)
    
    let negociacao = new Negociacao(
      data,
      this._inputQtt.value,
      this._inputValor.value
    )

    console.log(negociacao)
  }
}