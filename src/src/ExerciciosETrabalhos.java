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
 * @author Eduardo Pereira Moreira
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
    
    private static void loopTrabalhoDia21_09_2023()
    {
        var exercicio = new TrabalhoDia21();
        boolean lerNotas = true;
        
        boolean loop = true;
        do
        {
            if(lerNotas)
            {
                int repetir;
                do
                {
                    System.out.println("Notas Digitadas: " + Arrays.toString(exercicio.getListaNotasComoArray()));
                    System.out.println("Media: " + exercicio.getMedia());
                    System.out.println("Resultado: " + exercicio.getResultado());
                    System.out.println("\nDeseja digitar as notas novamente?");
                    System.out.println("1 - Sim");
                    System.out.println("2 - Não");
                    repetir = scannerInt();
                    if(repetir == 1)
                        lerNotas = true;
                    else if(repetir == 2)
                        loop = false;
                }
                while(repetir != 1 || repetir != 2);
            }
            else
            {
                System.out.println("Digite as notas para calcular a média, uma por vez; digite um valor negativo para finalizar a entrada");
                
                List<Double> notas = new ArrayList<>();
                double nota;
                do
                {
                    nota = scannerDouble();
                    if(nota >= 0.0)
                        notas.add(nota);
                        
                }
                while(nota >= 0.0);
                
                if(notas.isEmpty())
                {
                    int repetir;
                    do
                    {
                        System.out.println("Nenhuma nota digitada, deseja tentar novamente?");
                        System.out.println("1 - Sim");
                        System.out.println("2 - Não");
                        repetir = scannerInt();
                        if(repetir == 2)
                            loop = false;
                    }
                    while(repetir != 1 || repetir != 2);
                }
                else
                {
                    exercicio.setListaNotas(notas);
                    lerNotas = false;
                }
            }
        }
        while(loop);
    }
    
    private static void loopExercicioSet28_09_23(){
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
    
    private static void exerciciosIf(){
        boolean loop = true;
        do
        {
            System.out.println("\nDigite uma das opções:");
            System.out.println("Problema 1: Faça um programa que peça ao usuário um número e informe se ele é par ou ímpar.");
            System.out.println("Problema 2: Faça um programa que peça ao usuário uma letra e informe se ela é maiúscula ou minúscula.");
            System.out.println("Problema 3: Faça um programa que peça ao usuário um número e informe se ele é múltiplo de 3.");
            System.out.println("Problema 4: Faça um programa que peça ao usuário um número e informe se ele é primo.");
            System.out.println("Ou digite qualquer outro valor para voltar ao menu anterior");
            
            int escolha = scannerInt();
            switch(escolha)
            {
                case 1:
                {
                    
                    break;
                }
                case 2:
                {
                    
                    break;
                }
                case 3:
                {
                    
                    break;
                }
                case 4:
                {
                    
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
    private static void exerciciosIfElse(){
        boolean loop = true;
        do
        {
            System.out.println("\nDigite uma das opções:");
            System.out.println("Problema 1: Faça um programa que peça ao usuário um número e informe se ele é positivo, negativo ou zero.");
            System.out.println("Problema 2: Faça um programa que peça ao usuário um número e informe se ele é par ou ímpar. Caso seja par, informe também se ele é múltiplo de 4.");
            System.out.println("Problema 3: Faça um programa que peça ao usuário um número e informe se ele é divisível por 3 e por 5.");
            System.out.println("Problema 4: Faça um programa que peça ao usuário um número e informe se ele é um número de Fibonacci.");
            System.out.println("Ou digite qualquer outro valor para voltar ao menu anterior");
            
            int escolha = scannerInt();
            switch(escolha)
            {
                case 1:
                {
                    
                    break;
                }
                case 2:
                {
                    
                    break;
                }
                case 3:
                {
                    
                    break;
                }
                case 4:
                {
                    
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
    private static void exerciciosIfElseIfElse(){
        boolean loop = true;
        do
        {
            System.out.println("\nDigite uma das opções:");
            System.out.println("Problema 1: Faça um programa que peça ao usuário um número de 1 a 7 e informe qual é o dia da semana correspondente.");
            System.out.println("Problema 2: Faça um programa que peça ao usuário um número de 1 a 12 e informe qual é o mês correspondente.");
            System.out.println("Problema 3: Faça um programa que peça ao usuário um número de 1 a 10 e informe qual é o seu valor por extenso.");
            System.out.println("Problema 4: Faça um programa que peça ao usuário um número de 1 a 100 e informe se este é um primo ou não.");
            System.out.println("Ou digite qualquer outro valor para voltar ao menu anterior");
            
            int escolha = scannerInt();
            switch(escolha)
            {
                case 1:
                {
                    
                    break;
                }
                case 2:
                {
                    
                    break;
                }
                case 3:
                {
                    
                    break;
                }
                case 4:
                {
                    
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
    private static void exerciciosWhile(){
        boolean loop = true;
        do
        {
            System.out.println("\nDigite uma das opções:");
            System.out.println("Problema 1: Faça um programa que realize uma contagem regressiva a partir do número fornecido pelo usuário até 1.");
            System.out.println("Problema 2: Faça um programa que calcule a soma dos dígitos de um número inteiro fornecido pelo usuário.");
            System.out.println("Problema 3: Faça um programa onde o usuário informa um número e imprima todos os números primos de 0 até esse número.");
            System.out.println("Ou digite qualquer outro valor para voltar ao menu anterior");
            
            int escolha = scannerInt();
            switch(escolha)
            {
                case 1:
                {
                    
                    break;
                }
                case 2:
                {
                    
                    break;
                }
                case 3:
                {
                    
                    break;
                }
                case 4:
                {
                    
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
    private static void exerciciosDoWhile(){
        boolean loop = true;
        do
        {
            System.out.println("\nDigite uma das opções:");
            System.out.println("Problema 1: Faça um programa que peça ao usuário um número e imprima todos os números ímpares de 0 até esse número.");
            System.out.println("Problema 2: Faça um programa que peça ao usuário um número e imprima a tabuada desse número.");
            System.out.println("Problema 3: Faça um programa que solicite ao usuário que insira suas notas e calcule a média delas. Continue pedindo notas até que o usuário deseje encerrar a entrada de notas");
            System.out.println("Ou digite qualquer outro valor para voltar ao menu anterior");
            
            int escolha = scannerInt();
            switch(escolha)
            {
                case 1:
                {
                    
                    break;
                }
                case 2:
                {
                    
                    break;
                }
                case 3:
                {
                    
                    break;
                }
                case 4:
                {
                    
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
    private static void exerciciosFor(){
        boolean loop = true;
        do
        {
            System.out.println("\nDigite uma das opções:");
            System.out.println("Problema 1: Faça um programa que imprima todos os números pares de 0 até 100.");
            System.out.println("Problema 2: Faça um programa que peça ao usuário um número e imprima a tabuada desse número.");
            System.out.println("Problema 3: Faça um programa que peça ao usuário um número e imprima todos os números primos de 0 até esse número.");
            System.out.println("Ou digite qualquer outro valor para voltar ao menu anterior");
            
            
        }
        while(loop);
    }
    private static void loopExerciciosDia03_10_2023(){
        boolean loop = true;
        do
        {
            System.out.println("\nDigite uma das opções:");
            System.out.println("1 - Exercícios If");
            System.out.println("2 - Exercícios If-Else");
            System.out.println("3 - Exercícios If-Else-If-Else");
            System.out.println("4 - Exercícios While");
            System.out.println("5 - Exercícios Do-While");
            System.out.println("6 - Exercícios For");
            System.out.println("Ou qualquer outro valor para encerrar o programa");

            int escolha = scannerInt();
            switch(escolha)
            {
                case 1:
                {
                    exerciciosIf();
                    break;
                }
                case 2:
                {
                    exerciciosIfElse();
                    break;
                }
                case 3:
                {
                    exerciciosIfElseIfElse();
                    break;
                }
                case 4:
                {
                    exerciciosWhile();
                    break;
                }
                case 5:
                {
                    exerciciosDoWhile();
                    break;
                }
                case 6:
                {
                    exerciciosFor();
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
    
    private static void menu(){
        boolean loop = true;
        do
        {
            System.out.println("Menu de exercícios");
            System.out.println("1 - Trabalho - 21/09/2023");
            System.out.println("2 - Exercicios \"Set\" Dia 28/09/2023");
            System.out.println("3 - Exercicio Dia 03/10/2023");
            System.out.println("Ou digite qualquer outro valor para encerrar o programa");
            
            int opcaoMenu = scannerInt();
            switch(opcaoMenu)
            {
                case 1:
                {
                    loopTrabalhoDia21_09_2023();
                    break;
                }
                case 2:
                {
                    loopExercicioSet28_09_23();
                    break;
                }
                case 3:
                {
                    loopExerciciosDia03_10_2023();
                    break;
                }
                default:
                {
                    System.out.println("Encerrando o programa...");
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
    public static void main(String[] args){
        System.out.print("Args:");
        for(String arg : args)
        {
            System.out.print(" " + arg);
        }
        System.out.println("\n");
        
        menu();
    }
}
