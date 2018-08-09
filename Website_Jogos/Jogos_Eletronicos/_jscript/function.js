
		var controle, slide, slide_aux;
		var sld_amt = 4;

		function fotoMuda(foto)
		{
			//1:Nintendo 2:Sony 3:Sega 4:Atari 5:Microsoft

			if(foto==1)
			{
				controle= "_images/nintendo.png";
			}

			if(foto==2)
			{
				controle= "_images/ps4.png";
			}

			if(foto==3)
			{
				controle= "_images/Scast.png";
			}

			if(foto==4)
			{
				controle= "_images/atari_controller.png";
			}

			if(foto==5)
			{
				controle= "_images/xone.png";
			}

			document.getElementById("controle").src=controle;
		}

		function changeSlide(button)
		{

			if( button == 1 )
			{

				if ( sld_amt == 3 )
				{ 
					slide = document.getElementById("parag_4"); 
					slide_aux = document.getElementById("parag_8"); 
					sld_amt++; 
					slide.style.left = "-330px";
					slide_aux.style.left = "-4000px";
				}

			    if ( sld_amt == 2 )
				{ 
					slide = document.getElementById("parag_3"); 
					slide_aux = document.getElementById("parag_7"); 
					sld_amt++;  
					slide.style.left = "-450px";
					slide_aux.style.left = "-4000px";
				}

			    if ( sld_amt == 1 )
				{ 
					slide = document.getElementById("parag_2"); 
					slide_aux = document.getElementById("parag_6"); 
					sld_amt++; 
					slide.style.left = "-420px";
					slide_aux.style.left = "-4000px";
				}
				if ( sld_amt == 0 )
				{ 
					slide = document.getElementById("parag_1"); 
					slide_aux = document.getElementById("parag_5"); 
					sld_amt++; 
					slide.style.left = "150px";
					slide_aux.style.left = "-4000px";
			    }

			}

			else
			{

				if ( sld_amt == 1 )
				{ 
					slide = document.getElementById("parag_1");
					slide_aux = document.getElementById("parag_5"); 
					sld_amt--;  
					slide.style.left = "-4000px";
					slide_aux.style.left = "150px";
				}

			    if ( sld_amt == 2 )
				{ 
					slide = document.getElementById("parag_2");
					slide_aux = document.getElementById("parag_6"); 
					sld_amt--;   
					slide.style.left = "-4000px";
					slide_aux.style.left = "-450px";
				}

			    if ( sld_amt == 3 )
				{ 
					slide = document.getElementById("parag_3"); 
					slide_aux = document.getElementById("parag_7"); 
					sld_amt--;  
					slide.style.left = "-4000px";
					slide_aux.style.left = "-350px";
				}

			   	if ( sld_amt == 4 )
				{ 
					slide = document.getElementById("parag_4"); 
					slide_aux = document.getElementById("parag_8"); 
					sld_amt--;  
					slide.style.left = "-4000px";
					slide_aux.style.left = "-330px";
				}

			}
		
		}
