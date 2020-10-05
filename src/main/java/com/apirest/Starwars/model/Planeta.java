package com.apirest.Starwars.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class Planeta {

    @Id
    private String id;

//    @JsonProperty("")
    private String nome;

//    @JsonProperty("")
    private String clima;

//    @JsonProperty("")
    private String terreno;

    private int filmes;

    public Planeta(String id, String nome, String clima, String terreno) {
        this.id = id;
        this.nome = nome;
        this.clima = clima;
        this.terreno = terreno;
    }

    public Planeta() {
    }

    public int getFilmes() {
        return filmes;
    }

    public void setFilmes(int filmes) {
        this.filmes = filmes;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public String getTerreno() {
        return terreno;
    }

    public void setTerreno(String terreno) {
        this.terreno = terreno;
    }

//    public List<String> getFilmes() {
//        return filmes;
//    }
//
//    public void setFilmes(List<String> filmes) {
//        this.filmes = filmes;
//    }

//    public int getAparicoesFilmes(){
//        if(filmes != null){
//            return filmes.size();
//        }else{
//            return 0;
//        }
//    }


}
