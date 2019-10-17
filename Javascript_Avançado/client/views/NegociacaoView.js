class NegociacaoView extends View {

  constructor(elemento) {
    super(elemento)
  }

  update(model) {
    let $ = document.querySelector.bind(document)
    let total = $('#somaTotal')
    if (model.negociacoes.length) {
      this._elemento.innerHTML += this._template(model.negociacoes.pop())
      let valor_total = +total.innerHTML
      return total.innerHTML = valor_total + +model.negociacoes.pop().valor
    }
    this._elemento.innerHTML = ''
    total.innerHTML = ''
  }

  _template(model) {
    return `
      ${
      `
          <tr>
            <td>${DateHelper.dataParaTexto(model.data)}</td>
            <td>${model.quantidade}</td>
            <td>${model.valor}</td>
            <td>${model.volume}</td>
          </tr>
        `
      }
    `
  }
}