
	document.write("<br><br>O quão aleatória é a função rand<br><br>");

	var x, str = [ ];
	var zero   = 0, 
	um     = 1, 
	dois   = 2, 
	tres   = 3, 
	quatro = 4, 
	cinco  = 5, 
	seis   = 6, 
	sete   = 7, 
	oito   = 8, 
	nove   = 9,
	zero_cont   = 0, 
	um_cont     = 0, 
	dois_cont   = 0, 
	tres_cont   = 0, 
	quatro_cont = 0, 
	cinco_cont  = 0, 
	seis_cont   = 0, 
	sete_cont   = 0, 
	oito_cont   = 0, 
	nove_cont   = 0;
  
	for ( var b = 0 ; b < 10000 ; b++)
	{
		x = Math.random()*10;
		if ( x.toFixed(0) == 10 ) x /= 10;
		str.push(x.toFixed(0));
		document.write(" " + str[b]);
	}

	for ( var b = 0 ; b < 10000 ; b++)
	{
		if ( str[b] == zero )
			zero_cont++;

		if ( str[b] == um )
			um_cont++;

		if ( str[b] == dois )
			dois_cont++;

		if ( str[b] == tres )
			tres_cont++;

		if ( str[b] == quatro )
			quatro_con++;

		if ( str[b] == cinco )
			cinco_cont++;

		if ( str[b] == seis )
			seis_cont++;

		if ( str[b] == sete )
			sete_cont++;

		if ( str[b] == oito )
			oito_cont++;

		if ( str[b] == nove )
			nove_cont++;
	}

	function get()
	{

	document.getElementById("idon").innerHTML = "<br><br>" + zero_cont +
						    "<br><br>" + um_cont +
						    "<br><br>" + dois_cont +
						    "<br><br>" + tres_cont +
						    "<br><br>" + quatro_cont +
						    "<br><br>" + cinco_cont +
						    "<br><br>" + seis_cont +
						    "<br><br>" + sete_cont +
						    "<br><br>" + oito_cont +
						    "<br><br>" + nove_cont;

	}
