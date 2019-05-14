require 'rails_helper'
require 'user.rb'
require 'ffaker'

RSpec.describe User, type: :model do
  user = User.create(
    name: FFaker::Name.first_name, 
    game: %i[OOT, TP, BOTW, MM, SS, WW].sample,
    numOfAdventures: FFaker::Random.rand(1..10)
    );

  it "Is valid" do
    expect(user).to be_valid
  end
  it "Has the correct title" do
    expect(user.title()).to eq("#{user.name}, from #{user.game}, has adventured #{user.numOfAdventures} times")
  end
end

