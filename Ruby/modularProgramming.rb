module CadastroCliente
    class Cliente 
        def initialize(nome, valor1, valor2)
            @nome = nome
            @valor1 = valor1
            @valor2 = valor2
        end
        def getValor1() 
            return @valor1
        end
        def getValor2() 
            return @valor2
        end
        def getNome()
            return @nome
        end
    end
    def self.soma (x1, x2)
        return (x1+x2)
    end
end

cliente = CadastroCliente::Cliente.new("José", 3, 4)
puts cliente.getNome()
puts CadastroCliente::soma(cliente.getValor1, cliente.getValor2)
