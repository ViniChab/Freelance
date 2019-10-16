class DateHelper {

  constructor() {
    throw new Error('DateHelper não pode ser instanciado')
  }

  static textoParaData(texto) {
    return new Date(
      ...texto
        .split('-')
        .map((item, i) => { return i == 1 ? item - 1 : item })
    )
  }

  static dataParaTexto(data) {
    return data.getDate() + '/' +
      (data.getMonth() + 1) + '/' +
      data.getFullYear()
  }
}