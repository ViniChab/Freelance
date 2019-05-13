#gem install os

require 'os'

def whatOsAmIUsing()
    if OS.windows?
        return "Windows"
    elsif OS.linux?
        return "Linux"
    elsif OS.mac
        return "MacOS"
    end
end

puts "Sua OS é " + whatOsAmIUsing()
