bundle exec rspec #actually starting rspec for test
rails generate model user #Generates both the model and the test files
rails generate rspec:request User #Generating the test files for a model that already exists
rails g migration add_info name: string, game: string, numOfAdventures: number #For creating a new migrate file
rails db:migrate #For updating the db
