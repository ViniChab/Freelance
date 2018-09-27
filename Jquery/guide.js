
	//Declaração de uma função
	function color(in_out)
	{
		if ( in_out == 1 )
		{

			document.getElementById("parag_1").style.color="red";
			document.getElementById("parag_1").innerHTML="Hello there"; 
			//Inner vai substituir texto no arquivo

		}

		else
		{

			document.getElementById("parag_1").style.color="white";
			document.getElementById("parag_1").innerHTML="General Kenobi";

		}

	}

	//Declaração de variáveis, comparação para retornar true/false e saída com quebra de linha
	var x = 10, y = 4;
	document.write((x == y) + "<br><br>");

	//Declaração e saída de um array
	var array = ["Batata", "azul", "da", "morte", 2];
	for ( var a = 0 ; a < 5 ; a++ )
		document.write(array[a] + " ");

	//null
	var test = "all my important stuff";
	document.write("<br><br>" + test);
	test = null;
	document.write("<br><br>" + test);

	//Declaração de um objeto
	var caneta = 
	{ 
		tampada: false, 
		corTubo: "azul", 
		porcentagemCarga: 90,
		marcaCaneta: "BIC",
		tamanhoPonta: 0.5,
		function() //função teste
		{
			return this.tampada + ", " + 
			this.corTubo + ", " + 
			this.porcentagemCarga + "%, " + 
			this.marcaCaneta + ", " + 
			this.tamanhoPonta;
		},
		rabiscar: function() //primeiro método
		{
			if ( this.tampada == false )
			{
				if ( this.porcentagemCarga > 0 )
				{
					this.porcentagemCarga -= 1;
					return "isso é um rabisco";
				}
				else	
				{
					return "erro, sem carga"
				}
			}
			else
			{
				return "erro, destampe a caneta"
			}
		}
	};

	//como checar uma propriedade do objeto
	document.write("<br><br>"+ caneta.porcentagemCarga + "%");

	//checando mais propriedades
	document.write("<br><br>" + caneta.function());

	//chamando um objeto 
	document.write("<br><br>" + caneta.rabiscar());

	//craindo uma função objeto
	function pessoa ( nome, altura, corOlhos, telefone )
	{
    	this.nome = nome;
   	 	this.altura = altura;
    	this.corOlhos = corOlhos;
    	this.telefone = telefone;
	}

	//declarando nova pessoa
	var pai = new pessoa( "thiago", 171, "castanho", "(41)99999-9999" );
	document.write("<br><br>" + pai.nome);

