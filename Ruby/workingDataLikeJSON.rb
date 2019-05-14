def getValues (values)
    puts values[0]['Nome']
end

values = []

values.insert(0, {
    "Nome" => "Maria",
    "Idade" => "22",
    "Altura" => "165"
})
values.insert(0, {
    "Nome" => "José",
    "Idade" => "34",
    "Altura" => "172"
})
values.insert(0, {
    "Nome" => "João",
    "Idade" => "27",
    "Altura" => "184"
})

getValues(values)

#Valid implementation
