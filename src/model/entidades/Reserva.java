package model.entidades;

import util.DateUtilFormat;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Reserva {
    private Integer numeroQuarto;
    private LocalDate dataEntrada;
    private LocalDate dataSaida;

    public Reserva() {
    }

    public Reserva(Integer numeroQuarto, LocalDate dataEntrada, LocalDate dataSaida) {
        this.numeroQuarto = numeroQuarto;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
    }

    public Integer getNumeroQuarto() {

        return numeroQuarto;
    }

    public void setNumeroQuarto(Integer numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public LocalDate getDataSaida() {
        return dataSaida;
    }
    public long duracao(){
        Period periodo = Period.between(dataEntrada, dataSaida);
        long dias = periodo.getDays();
        return dias;
    }
    public void atualizacaoDatas(LocalDate dataEntrada, LocalDate dataSaida){
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
    }

    @Override
    public String toString() {
        return "Reserva: Apartamento nº " +
                numeroQuarto +
                ", Data de Entrada: " + DateUtilFormat.formatDate(dataEntrada) +
                ", Data de Saida: " + DateUtilFormat.formatDate(dataSaida) +
                ", Diárias: " +
                duracao() +
                " noites";
    }
}
