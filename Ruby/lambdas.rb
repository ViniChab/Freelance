erro_500 = lambda { puts "Ocorreu um erro na conexão com o servidor, por favor tente novamente mais tarde" };

printArray = lambda {
    array = [0,1,2,3,4,5];
    array.each do |value|
        puts value
    end
}

erro_500.call
printArray.call

#Lambdas will store any instruction (block)
