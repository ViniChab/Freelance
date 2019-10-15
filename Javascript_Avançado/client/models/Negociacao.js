class Negociacao {
  constructor(data = new Date(), quantidade = 1, valor = 0) {
    this._data = data
    this._quantidade = quantidade
    this._valor = valor
    Object.freeze(this)
  }

  setData(data = new Date()) {
    return this._data = data
  }

  setQuantidade(quantidade = 1) {
    if (quantidade < 1) return false
    return this._quantidade = quantidade
  }

  setValor(valor = 0) {
    if (valor < 0) return false
    return this._valor = valor
  }

  get volume() {
    return this._quantidade * this._valor
  }

  get data() {
    return new Date(this._data.getTime())
  }

  get quantidade() {
    return this._quantidade
  }

  get valor() {
    return this._valor
  }
}