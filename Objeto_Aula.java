package objeto;
class Caneta 
{ //Classe é o molde de um objeto, sua representação em forma de codígo;
    
    //As primeiras coisas a serem adicionadas, são as características/atributos
    //da classe/objeto:
    
    char modelo;
    char cor;
    float tamanho_da_ponta;
    int quantidade_de_carga;
    boolean tampada;
    
    //Agora, o que meu objeto faz? Isso são seus métodos;
    Método Rabiscar()
    {
        //Aqui está a rotina de rabiscar, o algorítmo;
        if (tampada == true )
            System.out.println("ERRO");//pois precisa estar destampada;
        if (quantidade_de_carga > 0)
            System.out.println("RABISCO");
        else
            System.out.println("ERRO"); //Pois ela precisa de carga
    }
    Método Tampar() // O parênteses indica que o método PODE receber parâmetros;
    {
        //Aqui está a rotina de tampar;
        if (tampada == true )
            tampada = false;
        
        else
            tampada = true; 
    //Assim ele tampa ou destampa a caneta toda vez que esse método for ativado
        
    }
    
    
    //Agora se define o estado do objeto, que pode VARIAR com o momento;
    
    //Destampada, com 90% de carga, é azul, ponta 0.5........
    

    //Depois, eu posso instanciar esse objeto (Criar ele);
    c1 = new Caneta;
    c1.cor = Azul; //Dando características;
   
    
    
} //Fecha a classe

// A classe define as características e métodos do objeto;
// A classe é utilizada pra gerar objetos;

// O objeto é a classe "em forma física", ou uma instância dela;
// O objeto é único, tem os mesmo atributos, mas com valores diferentes;
// Os objetos compartilham dos mesmos métodos;

