# Unysis
Aplicação para Dev Unisys @UnisysBrazil

App de validação para aplicação ao cargo de DEV
Execução (compilar): Botão direito no projeto, Selecionar opção Run AS, Acionar SpringBoot APP
O App de avaliação consiste em duas entidades com seus respectivos métodos CRUD expostos por meio da camada controller, a saber:

Entidade clientes:
método createOrUpdateCliente(), recebe por meio do body request os dados da entidade clienteEntity [POST] https://localhost:8080/clientes
método getAllClientes(), retorna todas as entidades clienteEntity [GET] https://localhost:8080/clientes
método getCliente(), retorno uma entidade clienteEntity com base no parametro {id} informado [GET] https://localhost:8080/clientes/{1}
método deleteCliente(), remove uma entidade clienteEntity com base no parametro {id} informado [DELETE] https://localhost:8080/clientes/{1}

Entidade Investimentos:
método createOrUpdateInvestimento(), recebe por meio do body request os dados da entidade investimentosEntity [POST] https://localhost:8080/investimentos
método getAllInvestimentos(), retorna todas as entidades investimentosEntity [GET] https://localhost:8080/investimentos
método getInvestimento(), retorno uma entidade investimentoEntity com base no parametro {id} informado [GET] https://localhost:8080/investimentos/{1}
método deleteInvestimento(), remove uma entidade investimentoEntity com base no parametro {id} informado [DELETE] https://localhost:8080/investimentos/{1}

Testes:
Execução: Acionar botão direito sobre a classe teste desejada, Selecionar Run-AS, acionar JUNIT Test 
ClienteDeletionTeste
ClienteGetAllTeste
ClientePersistenceTeste
InvestimentoDeletionTeste
InvestimentoGetAllTeste
InvestimentoPersistenceTeste

Aplicações front-end para chamada dos serviços
cliente_get
cliente_post
investimento_get
investimento_post

