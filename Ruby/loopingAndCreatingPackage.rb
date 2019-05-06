#Funções
def adicionarPacoteNoArrayDeDados(nome, idade, sexo) 
    dadosCliente = {
        "nome" => nome,
        "idade" => idade,
        "sexo" => sexo
    }

    $clientes.insert(-1, dadosCliente)
    #-1 add it for last
end
#Funções
####################################################

$clientes = []

index = 0
while index < 5 do
    puts "Entre com seu nome, idade e sexo:"
    nome = gets.chomp
    idade = gets.chomp
    sexo = gets.chomp

    adicionarPacoteNoArrayDeDados(nome, idade, sexo)
    index += 1
end

puts "OS clientes são: #{$clientes}"


