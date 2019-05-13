valores = [1,2,3,4,5,6,7,8,9,10]

valores.map! do |valor|
    puts valor
    valor += valor
end

print "#{valores}\n"

##You need to do something with every value of the array, or it turns nil
