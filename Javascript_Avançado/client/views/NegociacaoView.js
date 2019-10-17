class NegociacaoView extends View {

  constructor(elemento) {
    super(elemento)
  }

  update(model, total) {
    this._elemento.innerHTML += this._template(model.negociacoes.pop())
    
    let valor_total = +total.innerHTML
    total.innerHTML = valor_total + +model.negociacoes.pop().valor
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