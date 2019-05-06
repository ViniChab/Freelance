print "Hello World" #For printing
puts "Hello World" #Prints AND breaks line
  #computes cosine
  puts Math.cos(0)
  #computes sine of the number
  puts Math.sin(0)
  #computes natural logrithm
  puts Math.log(1)
  #computes log of a base b in log(a,b)
  puts Math.log(100,10)
  #computes square root of given number
  puts Math.sqrt(2)
  #computes tangent of given number
  puts Math.tan(0)
#For Maths
name = gets.chomṕ.to_s #gets your name wit a toString
"#{rand(a .. b)}" #This will create a random number between a and b
until #Just like a loop, but it will break once the condtion is false
begin end while #Just like a do while()
a = (0 .. 15) #
  
  
#####Array functions
  
  b = (5 .. 100)
  puts b.to_a[3]
  #To Array, this will turn a range into an array of numbers
 
  a = [0,1,2,3,4,5,6,7,8]
  puts a.slice(3,7)
  #Classical slice
  
  a = [0,12,3]
  a.length
  #Classical length
  
  a = [[0,1,2], [9,8,7], ["a", "b", "c"] ]
  puts a[0][2]
  #Array 0, value in position 2
  
  a = [1,2,3,4,5,6]
  puts "#{a.reverse}"
  #Classical reverse
  
  a = [1,2,3]
  b = [4,5,6]
  puts "#{a+b}"
  #Classical Concat
  
  a = [1,2,3,4,5,6]
  b = [4,5,6]
  puts "#{a-b}"
  #Intersection
  
  a = [1,2,3,4,5,6]
  b = [4,5,6,7,8,9]
  puts "#{a|b}"
  #Piping will only show you the unique values inside the variable
  a = [1,2,3,4,5,6, 1, 1, 2, 2, 6]
  puts "#{a|a}"
  #Very useful
  
  a = [1,2,3,4,5,6]
  puts "#{a.delete(1)}"
  #Delete a value
  puts "#{a}"
  puts "#{a.delete_at(1)}"
  #Delete a value at a specific position
  
  a = [1,2,3,4,5,6]
  b = []
  puts "#{a.empty?}" #false
  puts "#{b.empty?}" #true
  #Check if array has value
  
  a = [12,23,12,4,31,23,34,13,34,21,21,32,43,5456,23,2323,23]
  puts "#{a.sort}"
  #Sorting, very useful
  
##########

100.times {
  puts "hey"
} #Does it a hundred times

marks = [78,98,50,37,45]
for i in marks
puts i
end
  ############# or
marks = [78,98,50,37,45]
marks.each do |m|
  puts m
end
#Very much like a .forEach, with the i as the e
  
marks = [78,98,50,37,45]
for i in marks
  puts marks.index(i)
end
#Getting the index on every puts
  
  
  
  
  
  
  
  
  
  
  
  
  
  
