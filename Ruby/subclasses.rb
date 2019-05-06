#<Funções e Classes>
class Pessoa
    @@allNames = []
    def initialize(name)
        @name = name
        @@allNames.insert(-1, @name)
    end
    def getNames()
        return @@allNames
    end
end

class Aluno < Pessoa
    @@codigoAluno = 2
    def initialize(name)
        @name = name
        @@allNames.insert(-1, {
            "Nome" => @name,
            "Código" => @@codigoAluno
        })
        @@codigoAluno += 1
    end

end
#<\Funções e Classes>

index = 0
while index < 4 do
    puts "Digite o nome do aluno: "
    nome = gets.chomp
    aluno = Aluno.new(nome)
    index += 1
end

puts "Os nomes cadastrados são #{aluno.getNames()}"
