require 'spec_helper'
require 'hero'

describe Hero do #Describe define um grupo de exemplos
    hero = Hero.new()
    context "that spawned" do #Just for context, has no effect
        it 'has a sword' do #basicamente o nome do método, ver se ter uma espada
            expect(hero.weapon).to eq("Sword") #Comparative, will return either true or false
        end
        it 'has more than 1000 hp' do 
            expect(hero.hp).to be > 1000 #be is used for other kinds of comparisions
        end
        it 'has a hero title' do 
            expect(hero.title).to match(/Hero of/) #using regex for checking string
        end
        it 'is a hero' do
            expect(hero).to be_a(Hero) #Check types
        end
        it 'is truthy' do
            expect(hero).to be_truthy #Not null and valid
        end
        it "isn't null" do
            expect(hero).to_not be_nil #Not null
        end
        ###All those are called matchers
    end
end
