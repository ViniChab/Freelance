require "time"

nome = "Cludlelsdlane Silva"
idade = 48
sexo = 'F'
nacionalidade = "Brasileira"
nascimento = DateTime.now
teamCap = false

pacoteDados = {
    "nome" => nome,
    "idade" => idade,
    "sexo" => sexo,
    "nacionalidade" => nacionalidade,
    "nascimento" => nascimento,
    "teamCap" => teamCap
}

print "PacoteDados: #{pacoteDados["nome"]}\n"

=begin
  Here, we're building a package with data for the API
=end
