/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package src;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author Eduardo Pereira Moreira
 */

public class ExercíciosDia0310
{
    // Exercícios If
    public static void exerciciosIf(int exercicio)
    {
        switch(exercicio)
        {
            case 1:
            {
                exercicioIf1();
                break;
            }
            case 2:
            {
                exercicioIf2();
                break;
            }
            case 3:
            {
                exercicioIf3();
                break;
            }
            case 4:
            {
                exercicioIf4();
                break;
            }
            default:
                break;
        }
    }
    // •Problema 1: Faça um programa que peça ao usuário um número e informe se ele é par ou ímpar.
    public static void exercicioIf1()
    {
        System.out.println("Digite um número inteiro: ");
        int valor = leituraInt();
        
        if((valor % 2) == 0)
        {
            if(valor != 0)
                System.out.println("O valor informado é par.");
            else
                System.out.println("O valor informado é zero.");
        }
        else
        {
            System.out.println("O valor informado é ìmpar.");
        }
    }
    // •Problema 2: Faça um programa que peça ao usuário uma letra e informe se ela é maiúscula ou minúscula.
    public static void exercicioIf2()
    {
        String entrada;
        System.out.println("Digite uma letra: ");
        
        boolean leitura = true;
        do
        {
            entrada = leituraString();
            if(entrada.length() != 1)
            {
                System.out.println("Texto não contém somente uma letra, digite novamente: ");
            }
            else
            {
                leitura = false;
            }
        }
        while(leitura);
        
        if(entrada.equals(entrada.toLowerCase()))
        {
            System.out.println("A letra digitada é minúscula.");
        }
        else
        {
            System.out.println("A letra digitada é maiúscula.");
        }
    }
    // •Problema 3: Faça um programa que peça ao usuário um número e informe se ele é múltiplo de 3.
    public static void exercicioIf3()
    {
        System.out.println("Digite um número inteiro: ");
        int valor = leituraInt();
        
        if((valor % 3) == 0)
        {
            if(valor != 0)
                System.out.println("O valor informado é múltiplo de 3.");
            else
                System.out.println("O valor informado é zero.");
        }
        else
        {
            System.out.println("O valor informado não é múltiplo de 3.");
        }
    }
    // •Problema 4: Faça um programa que peça ao usuário um número e informe se ele é primo.
    public static void exercicioIf4()
    {
        System.out.println("Digite um número inteiro: ");
        int valor = leituraInt();
        
        boolean primo = true;
        for(int i = 2; i < valor; i++)
        {
            if((valor % i) == 0)
            {
                primo = false;
                break;
            }
        }
        
        if(primo)
        {
            System.out.println("O valor informado é primo.");
        }
        else
        {
            System.out.println("O valor informado não é primo.");
        }
    }
    
    
    // Exercícios If-Else
    public static void exerciciosIfElse(int exercicio)
    {
        switch(exercicio)
        {
            case 1:
            {
                exercicioIfElse1();
                break;
            }
            case 2:
            {
                exercicioIfElse2();
                break;
            }
            case 3:
            {
                exercicioIfElse3();
                break;
            }
            case 4:
            {
                exercicioIfElse4();
                break;
            }
            default:
                break;
        }
    }
    // •Problema 1: Faça um programa que peça ao usuário um número e informe se ele é positivo, negativo ou zero.
    public static void exercicioIfElse1()
    {
        System.out.println("Digite um número inteiro: ");
        int valor = leituraInt();
        
        if(valor > 0)
            System.out.println("O valor informado é positivo.");
        else if(valor < 0)
            System.out.println("O valor informado é negativo.");
        else
            System.out.println("O valor informado é zero.");
    }
    // •Problema 2: Faça um programa que peça ao usuário um número e informe se ele é par ou ímpar. Caso seja par, informe também se ele é múltiplo de 4.
    public static void exercicioIfElse2()
    {
        System.out.println("Digite um número inteiro: ");
        int valor = leituraInt();
        
        if((valor % 2) == 0)
        {
            if(valor != 0)
            {
                if((valor % 4) == 0)
                {
                    System.out.println("O valor é par e múltiplo de 4.");
                }
                else
                {
                    System.out.println("O valor é par e não múltiplo de 4.");
                }
            }
            else
            {
                System.out.println("O valor informado é zero.");
            }
        }
        else
        {
            System.out.println("O valor informado é ímpar.");
        }
    }
    // •Problema 3: Faça um programa que peça ao usuário um número e informe se ele é divisível por 3 e por 5.
    public static void exercicioIfElse3()
    {
        System.out.println("Digite um número inteiro: ");
        int valor = leituraInt();
        
        if(valor != 0)
        {
            if((valor % 3) == 0)
            {
                if((valor % 5) == 0)
                {
                    System.out.println("O valor digitado é divisivel por 3 e 5.");
                }
                else
                {
                    System.out.println("O valor digitado é divisivel por 3.");
                }
            }
            else if((valor % 5) == 0)
            {
                System.out.println("O valor digitado é divisivel por 5.");
            }
            else
            {
                System.out.println("O valor digitado não é divisivel por 3 nem 5.");
            }
        }
        else
        {
            System.out.println("O valor digitado é zero.");
        }
    }
    // •Problema 4: Faça um programa que peça ao usuário um número e informe se ele é um número de Fibonacci.
    public static void exercicioIfElse4()
    {
        System.out.println("Digite um número inteiro: ");
        int valor = leituraInt();
        
        if(valor > 1)
        {
            int f1 = 1;
            int f2 = 1;
            int temp;
            
            boolean achou = false;
            do
            {
                temp = f2;
                f2 = f2 + f1;
                f1 = temp;
                
                if(valor == f2)
                    achou = true;
            }
            while(f2 < valor);
            
            if(achou)
                System.out.println("O valor digitado é um número de Fibonacci.");
            else
                System.out.println("O valor digitado não é um número de Fibonacci.");
        }
        else if(valor < 0)
        {
            System.out.println("O valor digitado é negativo.");
        }
        else
        {
            System.out.println("O valor digitado é zero.");
        }
    }
    
    // Exercícios If-Else-If-Else
    public static void exerciciosIfElseIfElse(int exercicio)
    {
        switch(exercicio)
        {
            case 1:
            {
                exercicioIfElseIfElse1();
                break;
            }
            case 2:
            {
                exercicioIfElseIfElse2();
                break;
            }
            case 3:
            {
                exercicioIfElseIfElse3();
                break;
            }
            case 4:
            {
                exercicioIfElseIfElse4();
                break;
            }
            default:
                break;
        }
    }
    // •Problema 1: Faça um programa que peça ao usuário um número de 1 a 7 e informe qual é o dia da semana correspondente.
    public static void exercicioIfElseIfElse1()
    {
        System.out.println("Digite um número inteiro de 1 a 7: ");
        int valor;
        
        boolean leitura = true;
        do
        {
            valor = leituraInt();
            if((valor < 1) || valor > 7)
            {
                System.out.println("Valor inválido, digite novamente:");
            }
            else
            {
                leitura = false;
            }
        }
        while(leitura);
        
        switch(valor)
        {
            case 1:
            {
                System.out.println("1 = Domingo");
                break;
            }
            case 2:
            {
                System.out.println("2 - Segunda");
                break;
            }
            case 3:
            {
                System.out.println("3 - Terça");
                break;
            }
            case 4:
            {
                System.out.println("4 - Quarta");
                break;
            }
            case 5:
            {
                System.out.println("5 - Quinta");
                break;
            }
            case 6:
            {
                System.out.println("6 - Sexta");
                break;
            }
            case 7:
            {
                System.out.println("7 - Sábado");
                break;
            }
        }
    }
    // •Problema 2: Faça um programa que peça ao usuário um número de 1 a 12 e informe qual é o mês correspondente.
    public static void exercicioIfElseIfElse2()
    {
        System.out.println("Digite um número inteiro de 1 a 12: ");
        int valor;
        
        boolean leitura = true;
        do
        {
            valor = leituraInt();
            if((valor < 1) || valor > 12)
            {
                System.out.println("Valor inválido, digite novamente:");
            }
            else
            {
                leitura = false;
            }
        }
        while(leitura);
        
        switch(valor)
        {
            case 1:
            {
                System.out.println("1 - Janeiro");
                break;
            }
            case 2:
            {
                System.out.println("2 - Fevereiro");
                break;
            }
            case 3:
            {
                System.out.println("3 - Março");
                break;
            }
            case 4:
            {
                System.out.println("4 - Abril");
                break;
            }
            case 5:
            {
                System.out.println("5 - Maio");
                break;
            }
            case 6:
            {
                System.out.println("6 - Junho");
                break;
            }
            case 7:
            {
                System.out.println("7 - Julho");
                break;
            }
            case 8:
            {
                System.out.println("8 - Agosto");
                break;
            }
            case 9:
            {
                System.out.println("9 - Setembro");
                break;
            }
            case 10:
            {
                System.out.println("10 - Outubro");
                break;
            }
            case 11:
            {
                System.out.println("11 - Novembro");
                break;
            }
            case 12:
            {
                System.out.println("12 - Dezembro");
                break;
            }
        }
    }
    // •Problema 3: Faça um programa que peça ao usuário um número de 1 a 10 e informe qual é o seu valor por extenso.
    public static void exercicioIfElseIfElse3()
    {
        System.out.println("Digite um número inteiro de 1 a 10: ");
        int valor;
        
        boolean leitura = true;
        do
        {
            valor = leituraInt();
            if((valor < 1) || valor > 10)
            {
                System.out.println("Valor inválido, digite novamente:");
            }
            else
            {
                leitura = false;
            }
        }
        while(leitura);
        
        switch(valor)
        {
            case 1:
            {
                System.out.println("1 - Um");
                break;
            }
            case 2:
            {
                System.out.println("2 - Dois");
                break;
            }
            case 3:
            {
                System.out.println("3 - Três");
                break;
            }
            case 4:
            {
                System.out.println("4 - Quatro");
                break;
            }
            case 5:
            {
                System.out.println("5 - Cinco");
                break;
            }
            case 6:
            {
                System.out.println("6 - Seis");
                break;
            }
            case 7:
            {
                System.out.println("7 - Sete");
                break;
            }
            case 8:
            {
                System.out.println("8 - Oito");
                break;
            }
            case 9:
            {
                System.out.println("9 - Nove");
                break;
            }
            case 10:
            {
                System.out.println("10 - Dez");
                break;
            }
        }
    }
    // •Problema 4: Faça um programa que peça ao usuário um número de 1 a 100 e informe se este é um primo ou não.
    public static void exercicioIfElseIfElse4()
    {
        System.out.println("Digite um número inteiro de 1 a 100: ");
        int valor;
        
        boolean leitura = true;
        do
        {
            valor = leituraInt();
            if((valor < 1) || valor > 100)
            {
                System.out.println("Valor inválido, digite novamente:");
            }
            else
            {
                leitura = false;
            }
        }
        while(leitura);
        
        boolean primo = true;
        for(int i = 2; i < valor; i++)
        {
            if((valor % i) == 0)
            {
                primo = false;
                break;
            }
        }
        
        if(primo)
        {
            System.out.println("O valor digitado é primo");
        }
        else
        {
            System.out.println("O valor digitado não é primo");
        }      
    }
    
    // Exercícios While
    public static void exerciciosWhile(int exercicio)
    {
        switch(exercicio)
        {
            case 1:
            {
                exercicioWhile1();
                break;
            }
            case 2:
            {
                exercicioWhile2();
                break;
            }
            case 3:
            {
                exercicioWhile3();
                break;
            }
            default:
                break;
        }
    }
    // •Problema 1: Faça um programa que realize uma contagem regressiva a partir do número fornecido pelo usuário até 1.
    public static void exercicioWhile1()
    {
        System.out.println("Digite um número inteiro: ");
        int valor = leituraInt();
        
        System.out.print(valor);
        boolean loop = true;
        while(loop)
        {
            valor--;
            System.out.print(", " + valor);
            if(valor == 1)
                loop = false;
        }
    }
    // •Problema 2: Faça um programa que calcule a soma dos dígitos de um número inteiro fornecido pelo usuário.
    public static void exercicioWhile2()
    {
        System.out.println("Digite um número inteiro: ");
        int valor = leituraInt();
        
        System.out.println("Valor digitado: " + valor);
        int soma = 0;
        
        boolean calculando = true;
        while(calculando)
        {
            soma += valor % 10;
            valor = valor / 10;
            
            if(valor == 0)
                calculando = false;
        }
        System.out.println("Soma dos dígitos desse valor: " + soma);
    }
    // •Problema 3: Faça um programa onde o usuário informa um número e imprima todos os números primos de 0 até esse número.
    public static void exercicioWhile3()
    {
        int valor = 0;
        
        boolean leitura = true;
        while(leitura)
        {
            System.out.println("Digite um número inteiro: ");
            valor = leituraInt();
            
            if(valor > 0);
                leitura = false;
        }
        
        int cont = 2;
        while(cont <= valor)
        {
            boolean primo = true;
            for(int i = 2; i < cont; i++)
            {
                if((cont % i) == 0)
                {
                    primo = false;
                    break;
                }
            }
            
            if(primo)
                System.out.print(cont + " ");
            
            cont++;
        }
    }
    
    // Exercícios Do-While
    public static void exerciciosDoWhile(int exercicio)
    {
        switch(exercicio)
        {
            case 1:
            {
                exercicioDoWhile1();
                break;
            }
            case 2:
            {
                exercicioDoWhile2();
                break;
            }
            case 3:
            {
                exercicioDoWhile3();
                break;
            }
            default:
                break;
        }
    }
    // •Problema 1: Faça um programa que peça ao usuário um número e imprima todos os números ímpares de 0 até esse número.
    public static void exercicioDoWhile1()
    {
        int valor;
        
        boolean leitura = true;
        do
        {
            System.out.println("Digite um número inteiro: ");
            valor = leituraInt();
            
            if(valor > 0);
                leitura = false;
        }
        while(leitura);
        
        System.out.print(0);
        int cont = 1;
        do
        {
            if((cont % 2) != 0)
                System.out.print(", " + cont);
            
            cont++;
        }
        while(cont <= valor);
    }
    // •Problema 2: Faça um programa que peça ao usuário um número e imprima a tabuada desse número.
    public static void exercicioDoWhile2()
    {
        System.out.println("Digite um número inteiro: ");
        int valor = leituraInt();
        
        int cont = 1;
        do
        {
            System.out.println(valor * cont);
            cont++;
        }
        while(cont <= 10);
    }
    // •Problema 3: Faça um programa que solicite ao usuário que insira suas notas e calcule a média delas. Continue pedindo notas até que o usuário deseje encerrar a entrada de notas
    public static void exercicioDoWhile3()
    {
        int valor;
        
        int media = 0;
        int quant = 0;
        boolean leitura = true;
        do
        {
            System.out.println("Digite a nota #" + (quant + 1) + ", ou digite um valor negativo para encerrar a entrada de notas");
            valor = leituraInt();
            if(valor >= 0)
            {
                media += valor;
                quant++;
            }
            else
            {
                leitura = false;
            }
        }
        while(leitura);
        
        if(quant != 0)
        {
            media = media / quant;
            System.out.println("A sua média com base nessas notas é: " + media);
        }
        else
        {
            System.out.println("Nenhuma nota digitada");
        }
    }
    
    // Exercícios For
    public static void exerciciosFor(int exercicio)
    {
        switch(exercicio)
        {
            case 1:
            {
                exercicioFor1();
                break;
            }
            case 2:
            {
                exercicioFor2();
                break;
            }
            case 3:
            {
                exercicioFor3();
                break;
            }
            default:
                break;
        }
    }
    // •Problema 1: Faça um programa que imprima todos os números pares de 0 até 100.
    public static void exercicioFor1()
    {
        for(int i = 0; i <= 100; i++)
        {
            if((i % 2) == 0)
                System.out.print(i + " ");
        }
    }
    // •Problema 2: Faça um programa que peça ao usuário um número e imprima a tabuada desse número.
    public static void exercicioFor2()
    {
        System.out.println("Digite um número inteiro: ");
        int valor = leituraInt();
        
        for(int i = 1; i <= 10; i++)
        {
            System.out.println(valor * i);
        }
    }
    // •Problema 3: Faça um programa que peça ao usuário um número e imprima todos os números primos de 0 até esse número.
    public static void exercicioFor3()
    {
        System.out.println("Digite um número inteiro: ");
        int valor = leituraInt();
        
        for(int i = 0; i <= valor; i++)
        {
            boolean primo = true;
            for(int j = 2; j < i; j++)
            {
                if((i % j) == 0)
                {
                    primo = false;
                    break;
                }
            }
            if(primo)
                System.out.print(i + " ");
        }
    }
    
    
    public static void menu()
    {
        boolean repetir = true;
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

            int escolha = leituraInt();

            boolean pergunta = true;
            switch(escolha)
            {
                case 1:
                {
                    System.out.println("\nDigite uma das opções:");
                    System.out.println("•Problema 1: Faça um programa que peça ao usuário um número e informe se ele é par ou ímpar.");
                    System.out.println("•Problema 2: Faça um programa que peça ao usuário uma letra e informe se ela é maiúscula ou minúscula.");
                    System.out.println("•Problema 3: Faça um programa que peça ao usuário um número e informe se ele é múltiplo de 3.");
                    System.out.println("•Problema 4: Faça um programa que peça ao usuário um número e informe se ele é primo.");
                    System.out.println("Ou digite qualquer outro valor para voltar ao menu anterior");
                    
                    int exercicio = leituraInt();
                    exerciciosIf(exercicio);
                    
                    if((exercicio < 1) || (exercicio > 4))
                        pergunta = false;
                    
                    break;
                }
                case 2:
                {
                    System.out.println("\nDigite uma das opções:");
                    System.out.println("•Problema 1: Faça um programa que peça ao usuário um número e informe se ele é positivo, negativo ou zero.");
                    System.out.println("•Problema 2: Faça um programa que peça ao usuário um número e informe se ele é par ou ímpar. Caso seja par, informe também se ele é múltiplo de 4.");
                    System.out.println("•Problema 3: Faça um programa que peça ao usuário um número e informe se ele é divisível por 3 e por 5.");
                    System.out.println("•Problema 4: Faça um programa que peça ao usuário um número e informe se ele é um número de Fibonacci.");
                    System.out.println("Ou digite qualquer outro valor para voltar ao menu anterior");
                    
                    int exercicio = leituraInt();
                    exerciciosIfElse(exercicio);
                    
                    if((exercicio < 1) || (exercicio > 4))
                        pergunta = false;

                    break;
                }
                case 3:
                {
                    System.out.println("\nDigite uma das opções:");
                    System.out.println("•Problema 1: Faça um programa que peça ao usuário um número de 1 a 7 e informe qual é o dia da semana correspondente.");
                    System.out.println("•Problema 2: Faça um programa que peça ao usuário um número de 1 a 12 e informe qual é o mês correspondente.");
                    System.out.println("•Problema 3: Faça um programa que peça ao usuário um número de 1 a 10 e informe qual é o seu valor por extenso.");
                    System.out.println("•Problema 4: Faça um programa que peça ao usuário um número de 1 a 100 e informe se este é um primo ou não.");
                    System.out.println("Ou digite qualquer outro valor para voltar ao menu anterior");
                    
                    int exercicio = leituraInt();
                    exerciciosIfElseIfElse(exercicio);
                    
                    if((exercicio < 1) || (exercicio > 4))
                        pergunta = false;

                    break;
                }
                case 4:
                {
                    System.out.println("\nDigite uma das opções:");
                    System.out.println("•Problema 1: Faça um programa que realize uma contagem regressiva a partir do número fornecido pelo usuário até 1.");
                    System.out.println("•Problema 2: Faça um programa que calcule a soma dos dígitos de um número inteiro fornecido pelo usuário.");
                    System.out.println("•Problema 3: Faça um programa onde o usuário informa um número e imprima todos os números primos de 0 até esse número.");
                    System.out.println("Ou digite qualquer outro valor para voltar ao menu anterior");
                    
                    int exercicio = leituraInt();
                    exerciciosWhile(exercicio);
                    
                    if((exercicio < 1) || (exercicio > 3))
                        pergunta = false;

                    break;
                }
                case 5:
                {
                    System.out.println("\nDigite uma das opções:");
                    System.out.println("•Problema 1: Faça um programa que peça ao usuário um número e imprima todos os números ímpares de 0 até esse número.");
                    System.out.println("•Problema 2: Faça um programa que peça ao usuário um número e imprima a tabuada desse número.");
                    System.out.println("•Problema 3: Faça um programa que solicite ao usuário que insira suas notas e calcule a média delas. Continue pedindo notas até que o usuário deseje encerrar a entrada de notas");
                    System.out.println("Ou digite qualquer outro valor para voltar ao menu anterior");
                    
                    int exercicio = leituraInt();
                    exerciciosDoWhile(exercicio);
                    
                    if((exercicio < 1) || (exercicio > 3))
                        pergunta = false;

                    break;
                }
                case 6:
                {
                    System.out.println("\nDigite uma das opções:");
                    System.out.println("•Problema 1: Faça um programa que imprima todos os números pares de 0 até 100.");
                    System.out.println("•Problema 2: Faça um programa que peça ao usuário um número e imprima a tabuada desse número.");
                    System.out.println("•Problema 3: Faça um programa que peça ao usuário um número e imprima todos os números primos de 0 até esse número.");
                    System.out.println("Ou digite qualquer outro valor para voltar ao menu anterior");
                    
                    int exercicio = leituraInt();
                    exerciciosFor(exercicio);
                    
                    if((exercicio < 1) || (exercicio > 3))
                        pergunta = false;

                    break;
                }
                default:
                {
                    repetir = false;
                    pergunta = false;
                    break;
                }
            }
            
            while(pergunta)
            {
                System.out.println("\nDeseja verificar outro exercício?");
                System.out.println("1 - Sim");
                System.out.println("2 - Não");
                int resp = leituraInt();
                
                if(resp == 2)
                {
                    repetir = false;
                    pergunta = false;
                }
                else if(resp == 1)
                {
                    pergunta = false;
                }
            }
        }
        while(repetir);
    }
}
