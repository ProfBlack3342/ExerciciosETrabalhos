/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Descrição do Exercício:
 * Filtragem de Elementos: Implemente um exercício no qual você tenha uma lista de palavras e
 * precise filtrá-la para incluir apenas aquelas que começam com uma letra específica fornecida pelo usuário
 * 
 * @author dudup
 */
public final class ExercicioSet28_09_23
{
    private final List<String> listaOriginal;
    private String letraFiltro;
    private boolean filtroVazio;
    private final List<String> listaFiltrada;

    public ExercicioSet28_09_23(){
        this.listaOriginal = new ArrayList<>();
        this.filtroVazio = true;
        this.listaFiltrada = new ArrayList<>();
    }
    public ExercicioSet28_09_23(String[] listaOriginal){
        this.listaOriginal = new ArrayList<>();
        this.listaOriginal.addAll(Arrays.asList(listaOriginal));
        this.filtroVazio = true;
        this.listaFiltrada = new ArrayList<>();
    }
    public ExercicioSet28_09_23(ArrayList<String> listaOriginal){
        this.listaOriginal = listaOriginal;
        this.filtroVazio = true;
        this.listaFiltrada = new ArrayList<>();
    }
    public ExercicioSet28_09_23(String letraFiltro){
        this.listaOriginal = new ArrayList<>();
        this.letraFiltro = letraFiltro;
        this.filtroVazio = false;
        this.listaFiltrada = new ArrayList<>();
    }
    public ExercicioSet28_09_23(String[] listaOriginal, String letraFiltro){
        this.listaOriginal = new ArrayList<>();
        this.listaOriginal.addAll(Arrays.asList(listaOriginal));
        this.letraFiltro = letraFiltro;
        this.filtroVazio = false;
        this.listaFiltrada = new ArrayList<>();
        filtrarLista();
    }
    public ExercicioSet28_09_23(ArrayList<String> listaOriginal, String letraFiltro){
        this.listaOriginal = listaOriginal;
        this.letraFiltro = letraFiltro;
        this.filtroVazio = false;
        this.listaFiltrada = new ArrayList<>();
        filtrarLista();
    }

    public String[] getListaOriginalComoArray(){
        var listaOriginalArray = new String[this.listaOriginal.size()];
        for(int i = 0; i < listaOriginalArray.length; i++)
        {
            listaOriginalArray[i] = this.listaOriginal.get(i);
        }
        return listaOriginalArray;
    }
    public List<String> getListaOriginal(){
        return listaOriginal;
    }
    public void setListaOriginal(String[] listaOriginal){
        this.listaOriginal.clear();
        this.listaOriginal.addAll(Arrays.asList(listaOriginal));
        if(!this.filtroVazio)
            filtrarLista();
    }
    public void setListaOriginal(List<String> listaOriginal){
        this.listaOriginal.clear();
        this.listaOriginal.addAll(listaOriginal);
        if(!this.filtroVazio)
            filtrarLista();
    }
    
    public String getLetraFiltro(){
        return letraFiltro;
    }
    public void setLetraFiltro(String letraFiltro){
        this.letraFiltro = letraFiltro;
        this.filtroVazio = false;
        if(!this.listaOriginal.isEmpty())
            filtrarLista();
    }
    public boolean isFiltroVazio(){
        return filtroVazio;
    }

    public String[] getListaFiltradaArray(){
        var listaFiltradaArray = new String[this.listaFiltrada.size()];
        for(int i = 0; i < listaFiltradaArray.length; i++)
        {
            listaFiltradaArray[i] = this.listaFiltrada.get(i);
        }
        return listaFiltradaArray;
    }
    public List<String> getListaFiltrada(){
        return listaFiltrada;
    }
    
    private void filtrarLista()
    {
        if(!this.listaFiltrada.isEmpty())
            this.listaFiltrada.clear();
        
        for(String palavra : this.listaOriginal)
        {
            if(palavra.toLowerCase().startsWith(this.letraFiltro.toLowerCase()))
                this.listaFiltrada.add(palavra);
        }
    }
}
