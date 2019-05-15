#First, you want to generate the controller and model with:
rails g controller nameofController //For generating controllers
rails g model Post title:string body:text #This will create the model with the strucutre

#Next is creting the view page
#manually create a index.html.erb

#Now, you want to create the route for that component
get 'main', to: 'users#index'


#or, just generate evrything with this command
rails g scaffold ComponentName attr:string anotherAttr:text
