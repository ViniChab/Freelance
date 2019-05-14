hello = 'Hello world'

puts hello #Hello world

puts /world/ =~ hello #6

data = /world/.match(hello)
puts data #world

puts data.pre_match #World
#Ela ainda tem o resto da frase

puts data.post_match #nil
#Extremely useful
