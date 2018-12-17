
      toJavascriptDate(time){

        var hora : number = this.toNumber(time);
        var ArrayHora = ("" + hora).split("");
        var pri: number = this.toNumber(ArrayHora[0]) * 36000000;
        var seg: number = this.toNumber(ArrayHora[1]) * 3600000;
        var ter: number = this.toNumber(ArrayHora[2]) * 600000;
        var qua: number = this.toNumber(ArrayHora[3]) * 1000;
        var horaCompleta: number = pri + seg + ter + qua + 10800000;

        return horaCompleta;
        
      }
}
