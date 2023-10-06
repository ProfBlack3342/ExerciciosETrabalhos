/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author dudup
 */
public class ExerciciosETrabalhos
{
    private static double scannerDouble(){
        double retorno = 0.0;
        var entrada = new Scanner(System.in);
        
        boolean lendo = true;
        do
        {
            try
            {
                retorno = entrada.nextDouble();
                lendo = false;
            }
            catch(IllegalStateException | NoSuchElementException | NullPointerException erro)
            {
                entrada = new Scanner(System.in);
            }
        }
        while(lendo);
        
        return retorno;
    }
    private static String scannerString(){
        String retorno = "";
        var entrada = new Scanner(System.in);
        
        boolean lendo = true;
        do
        {
            try
            {
                retorno = entrada.next();
                lendo = false;
            }
            catch(IllegalStateException | NoSuchElementException | NullPointerException erro)
            {
                entrada = new Scanner(System.in);
            }
        }
        while(lendo);
        
        return retorno;
    }
    private static int scannerInt(){
        int retorno = 0;
        var entrada = new Scanner(System.in);
        
        boolean lendo = true;
        do
        {
            try
            {
                retorno = entrada.nextInt();
                lendo = false;
            }
            catch(IllegalStateException | NoSuchElementException | NullPointerException erro)
            {
                entrada = new Scanner(System.in);
            }
        }
        while(lendo);
        
        return retorno;
    }
    
    private static void loopExercicioSet28_09_23()
    {
        var exercicio = new ExercicioSet28_09_23();
        
        boolean loop = true;
        do
        {
            System.out.println("Exercício Set - 28/09/2023");
            System.out.println("Descrição do Exercício:");
            System.out.println("Filtragem de Elementos: Implemente um exercício no qual você tenha uma lista de palavras e");
            System.out.println("precise filtrá-la para incluir apenas aquelas que começam com uma letra específica fornecida pelo usuário");
            System.out.println("\nEscolha uma opção:");
            if(exercicio.getListaOriginal().isEmpty())      // Lista de palavras ainda não digitada
            {
                System.out.println("1 - Digitar uma lista de palavras para filtragem");
                if(exercicio.isFiltroVazio())                   // Lista de palavras ainda não digitada + letra filtro não digitada
                {
                    System.out.println("2 - Digitar uma letra filtro");
                }
                else                                            // Lista de palavras ainda não digitada + letra filtro já digitada
                {
                    System.out.println("\nLetra filtro atual: " + exercicio.getLetraFiltro());
                    System.out.println("2 - Digitar uma nova letra filtro");
                }
            }
            else                                            // Lista de palavras já digitada
            {
                System.out.println("\nLista de palavras atual: " + Arrays.toString(exercicio.getListaOriginalComoArray()));
                System.out.println("1 - Digitar uma nova lista de palavras para filtragem");
                if(exercicio.isFiltroVazio())                   // Lista de palavras já digitada + letra filtro não digitada
                {
                    System.out.println("2 - Digitar uma letra para filtrar a lista");
                }
                else                                            // Lista de palavras já digitada + letra filtro já digitada; lista filtrada existe
                {
                    System.out.println("\nLetra filtro atual: " + exercicio.getLetraFiltro());
                    System.out.println("2 - Digitar uma nova letra para filtrar a lista");
                    System.out.println("\nLista de palavra com o filtro aplicado: " + Arrays.toString(exercicio.getListaFiltradaArray()));
                }
            }
            System.out.println("Ou digite qualquer outro valor para voltar ao menu:");
            int entrada = scannerInt();
            
            switch(entrada)
            {
                case 1:
                {
                    System.out.println("Digite as palavras da lista, uma por vez; digite 0 para encerrar a entrada:");
                    
                    List<String> novaLista = new ArrayList<>();
                    String novaPalavra;
                    
                    boolean loopTexto = true;
                    do
                    {
                        novaPalavra = scannerString();
                        if(novaPalavra.equals("0"))
                        {
                            loopTexto = false;
                        }
                        else
                        {
                            novaLista.add(novaPalavra);
                        }
                    }
                    while(loopTexto);
                    
                    exercicio.setListaOriginal(novaLista);
                    break;
                }
                case 2:
                {
                    System.out.println("Digite a letra para servir de filtro");
                    
                    String novoFiltro;
                    
                    boolean loopTexto = true;
                    do
                    {
                        novoFiltro = scannerString();
                        if(novoFiltro.length() != 1)
                            System.out.println("Erro: Digite apenas UMA letra:");
                        else
                            loopTexto = false;
                    }
                    while(loopTexto);
                    
                    exercicio.setLetraFiltro(novoFiltro);
                    break;
                }
                default:
                {
                    loop = false;
                    break;
                }
            }
        }
        while(loop);
    }
    
    private static void menu()
    {
        int opcaoMenu;
        boolean loop = true;
        do
        {
            System.out.println("Menu de exercícios");
            System.out.println("1 - Exercício Set");
            System.out.println("Digite qualquer outro valor para encerrar o programa");
            
            opcaoMenu = scannerInt();
            switch(opcaoMenu)
            {
                case 1:
                {
                    loopExercicioSet28_09_23();
                    break;
                }
                default:
                {
                    loop = false;
                    break;
                }
            }
        }
        while(loop);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        System.out.print("Args:");
        for(String arg : args)
        {
            System.out.print(" " + arg);
        }
        System.out.println("\n");
        
        menu();
    }
}
