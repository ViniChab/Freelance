require 'spec_helper'
require 'hero'

describe Hero do
    hero = Hero.new()
    it 'has a sword' do #basicamente o nome do método, ver se ter uma espada
        expect(hero.weapon).to eq("Sword")
    end
    it 'has more than 1000 hp' do 
        expect(hero.hp).to be > 1000
    end
end