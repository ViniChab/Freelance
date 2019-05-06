#<Funções e Classes>
class Aluno
    @@alunosArray =[]
    def setName(nome)
        @nome = nome
        @@alunosArray.insert(-1, @nome)
    end
    def getNomes ()
        return @@alunosArray
    end
end
#</Funções e Classes>

nome = nil
aluno = nil

print "Quantos alunos você deseja cadastrar?: "
qttRegistros = gets.chomp.to_i
print "\n"

index = 0
while index < qttRegistros do
    puts "Digite o nome do aluno:"
    nome = gets.chomp

    aluno = Aluno.new()
    aluno.setName(nome)
    index += 1
end

puts "Os alunos são: \n #{aluno.getNomes()}"

#implement example
