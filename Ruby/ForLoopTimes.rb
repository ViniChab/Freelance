array = [{"number" => 4}, {"number" => 3}, {"number" => 2}]
for number in array
    puts number
end

###########################################################

counter = 0;
loop do 
    counter += 1
    break if counter > 1000
    puts counter
end

###########################################################

puts "Enter a value"
value = gets.chomp.to_i
value.times do 
    puts "You entered a value"
end
