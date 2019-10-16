class DateHelper {

  constructor() {
    throw new Error('DateHelper não pode ser instanciado')
  }

  static textoParaData(texto) {
    //digito de 4 números
    //digito de 2 números
    //digito de 2 números
    if(!/\d{4}-\d{2}-\d{2}/.test(texto))
      throw new Error('Deve estar no padrão')

    return new Date(
      ...texto
        .split('-')
        .map((item, i) => { return i == 1 ? item - 1 : item })
    )
  }

  static dataParaTexto(data) {
    return `${data.getDate()}/${(data.getMonth() + 1)}/${data.getFullYear()}`
  }
}