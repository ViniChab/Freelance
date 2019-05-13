valores = [1,2,3,4,5,6,7,8,9,10]

print "#{valores}\n\n"

numerosPares = valores.select do |valor|
    valor % 2 == 0 #If its true, its pushed inside numerosPares
end

print "#{numerosPares}\n"
