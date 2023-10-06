/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package src;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Eduardo Pereira Moreira
 */

public final class TrabalhoDia21
{
    private final List<Double> listaNotas;
    private boolean listaPreenchida;
    private double media;
    private String resultado;
    
    public TrabalhoDia21(){
        this.listaNotas = new ArrayList<>();
        this.listaPreenchida = false;
        this.media = 0;
    }
    public TrabalhoDia21(Double[] arrayNotas){
        this.listaNotas = new ArrayList<>();
        this.listaNotas.addAll(Arrays.asList(arrayNotas));
        this.listaPreenchida = true;
        calcularMedia();
    }
    public TrabalhoDia21(List<Double> listaNotas){
        this.listaNotas = listaNotas;
        this.listaPreenchida = true;
        calcularMedia();
    }
    
    public Double[] getListaNotasComoArray(){
        var listaNotasArray = new Double[this.listaNotas.size()];
        for(int i = 0; i < listaNotasArray.length; i++)
        {
            listaNotasArray[i] = this.listaNotas.get(i);
        }
        return listaNotasArray;
    }
    public List<Double> getListaNotas(){
        return listaNotas;
    }
    public void setListaNotas(Double[] arrayNotas){
        this.listaNotas.clear();
        this.listaNotas.addAll(Arrays.asList(arrayNotas));
        if(!this.listaPreenchida)
            this.listaPreenchida = true;
        calcularMedia();
    }
    public void setListaNotas(List<Double> listaNotas){
        this.listaNotas.clear();
        this.listaNotas.addAll(listaNotas);
        if(!this.listaPreenchida)
            this.listaPreenchida = true;
        calcularMedia();
    }
    
    public boolean isListaPreenchida(){
        return listaPreenchida;
    }

    public double getMedia(){
        return media;
    }

    public String getResultado(){
        return resultado;
    }
    
    private void calcularMedia(){
        if(!listaNotas.isEmpty())
        {
            double somaNotas = 0;
            for(double nota : listaNotas)
            {
                somaNotas += nota;
            }

            this.media = somaNotas / listaNotas.size();
            definirResultado();
        }
        else
        {
            System.out.println("Erro: Lista de notas está vazia, impossivel calcular a média");
            this.media = 0.0;
        }
    }
    private void definirResultado(){
        if(this.media < 5)
            this.resultado = "Reprovado";
        else if(this.media < 7)
            this.resultado = "Recuperação";
        else
            this.resultado = "Aprovado";
    }
}
