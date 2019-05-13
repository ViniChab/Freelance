puts "Entre com um valor entre 1 e 5"
valor = gets.chomp.to_i;
case valor
when 1..3
    puts "Seu numero está entre 1 e 3"
when 4
    puts "seu numero é 4"
when 5
    puts "seu numero é 5"
else
    puts "Não foi o que mandei"
end
