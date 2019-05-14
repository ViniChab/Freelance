hello = 'Hello world'

puts hello #Hello world

puts /world/ =~ hello #6

data = /world/.match(hello)
puts data #world

puts data.pre_match #World
#Ela ainda tem o resto da frase

puts /[1..5]/.match('9,8,7,6,6,7,8,9') #nil, se ele acha ele pr

puts /[a-z]/.match('Oi') #i, é minúsculo

puts /[A-Z]/.match('Oi') #O, é maiúsculo

puts data.post_match #nil
#Extremely useful
