package com.dio.aulas_beans;

public class ViaCepResponse {
    private String cep;
    private String logradouro;
    private String localidade;

    public String getCep(){return cep;}

    public void setCep(String cep){this.cep = cep;}

    public String getLogradour(){return logradouro;}

    public void setLogradour(String logradouro){this.logradouro = logradouro;}

    public String getLocalidade(){return localidade;}

    public void setLocalidade(String localidade){this.localidade= localidade;}


}
