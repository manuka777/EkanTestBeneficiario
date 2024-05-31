A aplicacao foi desenvolvimento utilizando de Spring Boot 3.0 utilizando como banco de dados Embedded o Apache Derby sob Java 17 e Eclipse.
Utilizei swaggard para gerar a documentacao sobre as API Rest
Utilizei JPA
EW foi testado utilizando a ferramenta SOAP UI

Temos os seguintes endpoints:

PUT  /beneficiario/atualizar
POST  /beneficiario/cadastrar
GET  /beneficiario/listarAll
GET  /beneficiario/listar/{id}
GET  /beneficiario/listaDoctos/{id}
DELETE  /beneficiario/remover/{id}

Para execucao de testes criei a massa abaixo:

{
"nome":"Vani",
"telefone":"963364767",
"dtNascimento":"",
"dtInclusao":"",
"dtAtualizacao":"",
"documentos":[
	{
		"tipoDocto":"",
		"descricao":"",
		"dtInclusao":"",
		"dtAlteracao":""
	},
	{
		"tipoDocto":"",
		"descricao":"",
		"dtInclusao":"",
		"dtAlteracao":""
	}
	]
}

em caso de alteracao deve-se incluir antes do nome: "id": [numero de registro],
