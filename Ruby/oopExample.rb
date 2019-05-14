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

##########################################################################################################

class BankAccount
    @@NumberAccounts = 0
    def open(nome, senha) 
        @@NumberAccounts += 1
        @IdAccount = @@NumberAccounts
        @Senha = senha
        @Nome = nome
    end
    def getInfo()
        values = {
            'ID' => @IdAccount, 
            'Nome' => @Nome, 
            'Senha'=> @Senha
        }
        return values
    end
end

##Functions  and methods##

puts "Digite seu nome: " 
nome = gets.chomp.to_s
puts "Defina  uma senha: "
senha = gets.chomp.to_s

conta = BankAccount.new()
conta.open(nome, senha)

puts "Suas informações são: #{conta.getInfo()}"


############################################################################################ Method Missing

class Fish
    def method_missing(method_name)
        puts "Fishes cannot #{method_name}"
    end
    def swim()
        puts "GlubGlubGlub"
    end
end

fish = Fish.new();
fish.swim();
fish.walk();
