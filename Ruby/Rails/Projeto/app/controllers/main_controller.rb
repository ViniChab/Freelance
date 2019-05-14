class MainController < ApplicationController
    def index
        @produto = Produto.order(nome: :desc)
        @produto_promocao = Produto.order(:preco).limit(1)

    end

    def create
    end
end