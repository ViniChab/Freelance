array = [{"number" => 4}, {"number" => 3}, {"number" => 2}]
for number in array
    puts number
end

###########################################################

counter = 0;
loop do 
    counter += 1
    if counter > 1000
        break
    end
    puts counter
end
