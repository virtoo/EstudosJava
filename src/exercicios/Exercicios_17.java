package exercicios;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.Formatter;
import java.math.*;
public class Exercicios_17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        ====== notas válidas ======
//        boolean valid = false;
//        do {
//        System.out.println("Entre com um valor de 0 até 10");
//        int n = scan.nextInt();
//       if (n >= 0 && n <= 10){
//           valid = true;
//           System.out.println("Você entrou com o número: " + n);
//       } else {
//           valid = false;
//           System.out.println("Valor inválido! Entre com outro número");
//           }
//        } while (!valid);

//        ====== nome de usuario e senha ======
//        boolean valid = false;
//        do {
//        System.out.println("Entre com o nome de usuário: ");
//        String usuario = scan.next();
//        System.out.println("Entre com a senha: ");
//        String senha = scan.next();
//            if (senha.equalsIgnoreCase(usuario)){
//                System.out.println("A senha não pode ser igual ao nome de usuario! Digite novamente!");
//            } else {
//                valid = true;
//                System.out.println("Senha correta!");
//            }
//        } while (!valid);

//        ====== nome, idade, salario, sexo... ======
//        boolean valid = false;
//        String nome;
//        int idade;
//        double salario;
//        String genero;
//        String estadoCivil;
//
//        do {
//            System.out.println("Entre com o seu nome");
//            nome = scan.next();
//            if (nome.length() <= 3){
//                System.out.println("Nome deve ter no mínimo três letras");
//            } else {
//                valid = true;
//                System.out.println("Nome válido!");
//            }
//        } while (!valid);
//
//         valid = false;
//
//         do {
//             System.out.println("Entre com a sua idade");
//             idade = scan.nextInt();
//             if (idade < 0 || idade > 150){
//                 System.out.println("Idade precisa ser entre 0 e 150");
//             } else {
//                 valid= true;
//             }
//         } while (!valid);
//
//         valid = false;
//
//         do {
//             System.out.println("Entre com o seu salário");
//             salario = scan.nextDouble();
//             if (salario <= 0){
//                 System.out.println("Digite novamente o seu salário");
//             } else {
//                 valid = true;
//             }
//         } while (!valid);
//
//         valid = false;
//
//        do {
//            System.out.println("Entre com o seu sexo");
//            genero = scan.next();
//            switch (genero){
//                case "f":
//                case "m":
//                    valid = true;
//                    break;
//                default:
//                    System.out.println("Informação inválida!");
//            }
//        } while(!valid);
//
//        valid = false;
//
//        do {
//            System.out.println("Entre com o seu Estado Civil");
//            estadoCivil = scan.next();
//            switch (estadoCivil){
//                case "s":
//                case "c":
//                case "d":
//                case "v":
//                    valid = true;
//                    break;
//                default:
//                    System.out.println("Informação inválida!");
//            }
//        } while (!valid);
//        System.out.println("Seu nome: " + nome);
//        System.out.println("Sua idade: " + idade);
//        System.out.println("Sseu salário: " + salario);
//        System.out.println("Seu genero: " + genero);
//        System.out.println("Seu Estado Civil: " + estadoCivil);

//        ====== população ======
//        int popA = 80000;
//        int popB = 200000;
//        int cont = 0;
//        while (popA < popB){
//            popA += (popA / 100) * 3;
//            popB += (popB/ 100) * 1.5;
//           cont++;
//        }
//        System.out.println("População A: " + popA);
//        System.out.println("População B: " + popB);
//    System.out.println("Quantidade de anos: " + cont);

//        ====== população 2.0 ======
//        double popA, popB, taxaA, taxaB;
//        boolean valid = false;
//        do {
//            System.out.println("Entre com a população A:");
//            popA = scan.nextDouble();
//            if (popA > 0){
//                valid = true;
//            } else {
//                System.out.println("Valor inválido!");
//            }
//        } while (!valid);
//
//        valid = false;
//        do {
//            System.out.println("Entre com a população B:");
//            popB = scan.nextDouble();
//            if (popB > 0){
//                valid = true;
//            } else {
//                System.out.println("Valor inválido!");
//            }
//        } while (!valid);
//        System.out.println("Entre com a taxa de crescimento da População A");
//        taxaA = scan.nextDouble();
//        System.out.println("Entre com a taxa de crescimento da População B");
//        taxaB = scan.nextDouble();
//
//        int cont = 0;
//        while (popA < popB){
//            popA += (popA / 100) * taxaA;
//            popB += (popB/ 100) * taxaB;
//           cont++;
//        }
//        System.out.println("População A: " + popA);
//        System.out.println("População B: " + popB);
//    System.out.println("Quantidade de anos: " + cont);

//        ====== 1 a 20 ======
//        for (int i = 1; i <= 20; i++){
//            System.out.println(i);
//        }for (int i = 1; i <= 20; i++){
//            System.out.print(i + " ");
//        }

//        ====== numero de 1 a 5 ======
//        int num;
//        int maior = Integer.MIN_VALUE;
//        for(int i = 0; i < 5;i++){
//            System.out.println("Entre com um número:");
//            num = scan.nextInt();
//            if (num > maior){
//                maior = num;
//            }
//        }
//        System.out.println("O maior número digitado é: " + maior);

//        ====== media de 5 numeros ======
//        int num;
//        double media;
//        int soma = 0;
//        for (int i = 0; i < 5; i++){
//            System.out.println("Entre com um número: ");
//            num = scan.nextInt();
//            soma += num;
//        }
//        media = soma / 5;
//        System.out.printf("A média dos números é: " + media);

//        ====== numeros impares de 1 a 50 ======
//        for (int i = 1; i < 50; i++){
//            if (i % 2 != 0){
//                System.out.println(i);
//            }
//        }

//        ====== numeros inteiros ======
//        int n1,n2;
//        int soma = 0;
//            System.out.println("Entre com o primeiro número: ");
//            n1 = scan.nextInt();
//            System.out.println("Entre com o segundo número: ");
//            n2 = scan.nextInt();
//        for (int i = n1; i<= n2; i++){
//            System.out.println("" + i);
//            soma += i;
//        }
//        System.out.println("A soma dos números é: " + soma);

//        ====== tabuada ======
//        System.out.println("Entre com um número da tabuada:");
//        int num = scan.nextInt();
//        System.out.println("Tabuada do número: " + num);
//        for (int i = 0; i <= 10; i++){
//                System.out.println(num + " x " + i + " = " + (i*num));
//        }

//        ====== exponecial ======
//        System.out.println("Entre com o número da base: ");
//        int base = scan.nextInt();
//        System.out.println("Entre com o número expoente: ");
//        int expo = scan.nextInt();
//        int result = base;
//        for (int i = 0; i < expo; i++){
//            System.out.println(result);
//            result *= base;
//        }

//        ====== qntd de impar e par ======
//        int impar = 0;
//        int par = 0;
//        int num;
//        for (int i = 0; i < 10; i++){
//            System.out.println("Entre com um número: ");
//            num = scan.nextInt();
//            if (num % 2 == 0){
//                par++;
//            } else {
//                impar++;
//            }
//        }
//        System.out.println("Números pares: " + par);
//        System.out.println("Números ímpares: " + impar);

//        ====== fibonacci sequence ======
//        System.out.println("Entre com o n-ésimo número");
//        int n = scan.nextInt();
//        int primeiro = 1;
//        int segundo = 1;
//        int proximo;
//        for (int i = 3; i <= n; i++) {
//            proximo = primeiro + segundo;
//            primeiro = segundo;
//            segundo = proximo;
//            System.out.println(proximo);
//        }

//        ====== fibonacci sequence until 500 ======
//        int primeiro = 1;
//        int segundo = 1;
//        int proximo = 0;
//        System.out.println(primeiro);
//        System.out.println(segundo);
//        while(proximo < 500) {
//            proximo = primeiro + segundo;
//            primeiro = segundo;
//            segundo = proximo;
//            System.out.println(proximo);
//        }

//        ====== fatorial ======
//        System.out.println("Entre com um número:");
//        int num = scan.nextInt();
//        int fatorial = 1;
//
//        int in = num;
//        while (in > 1){
//            in--;
//            fatorial *= in;
//            System.out.println(in);
//        }
//
//        for (int i = num; i > 0; i--){
//            fatorial *= i;
//            System.out.print( i + " * ");
//        }
//        System.out.println("= " + fatorial);

//        ====== numero primo ======
//        System.out.print("Entre com um número: ");
//        int num = scan.nextInt();
//        boolean primo = true;
//        for (int i = 2; i < num; i++){
//            if (num % i == 0){
//                System.out.println("Não é primo!");
//                primo = false;
//            }
//        }
//        if(primo){
//            System.out.println("É número primo!");
//        }

//        ====== media aritmetica de n notas ======
//        System.out.println("Entre com o número de notas: ");
//        int notas = scan.nextInt();
//        double soma = 0;
//        double media;
//        double nota;
//        for (int i = 1; i <= notas; i++){
//            System.out.println("Entre com a Nota: ");
//            nota = scan.nextDouble();
//            soma += nota;
//        }
//        media = soma / notas;
//        System.out.println("Média das notas: " + media);

//        ====== media de idade ======
//        System.out.println("Entre com a quantidade de pessoas: ");
//        int pessoas = scan.nextInt();
//        int soma = 0;
//        int media;
//        int idade;
//        for (int i = 0; i < pessoas; i++){
//            System.out.println("Entre com a idade: ");
//            idade = scan.nextInt();
//            soma += idade;
//        }
//        media = soma / pessoas;
//        if (media >= 0 && media <= 25){
//            System.out.println("Jovem");
//        } else if (media > 26 && media <= 60) {
//            System.out.println("Adulta");
//        } else if (media > 60) {
//            System.out.println("Idosa");
//        }
//        System.out.println("Média: " + media);

//        ====== media de turmas ======
//        System.out.println("Entre com a quantidade de turmas: ");
//        int turmas = scan.nextInt();
//        int soma = 0;
//        int media;
//        int qtdAlunos;
//        boolean invalido = true;
//        for (int i = 1; i <= turmas; i++){
//            invalido = true;
//            do {
//                System.out.println("Entre com a quantidade de alunos da turma: " + i);
//                qtdAlunos = scan.nextInt();
//                if (qtdAlunos <= 40) {
//                    invalido = false;
//                } else {
//                    System.out.println("A turma não pode ter mais de 40 alunos!");
//                }
//            } while (invalido);
//            soma += qtdAlunos;
//        }
//        media = soma / turmas;
//        System.out.println("Turmas: " + turmas);
//        System.out.println("Alunos: " + soma);
//        System.out.println("Média: " + media);

//        ====== valor de gastos com cds ======
//        System.out.println("Entre com a quantidade de CDs da coleção: ");
//        int cds = scan.nextInt();
//        double valorCd;
//        double soma = 0;
//        for (int i = 1; i <= cds; i++){
//            System.out.println("Entre com o valor do CD " + i);
//            valorCd = scan.nextDouble();
//            soma += valorCd;
//        }
//        double media = soma / cds;
//        System.out.printf("Total: R$ %.2f%n", soma);
//        System.out.printf("Média: R$ %.2f", media);

//        ====== loja de 1,99 ======
//        System.out.println("Loja Quase Dois - Tabela de Preços");
//        double valor = 1.99;
//        for (int i = 1; i <= 50; i++){
//        System.out.println(i + " - R$ " + (valor * i));
//        }

//        ====== panificadora ======
//        System.out.println("Preço do pão R$ 0,18");
//        System.out.println("Panificadora Peter Pão - Tabela de Preços");
//        double valPao = 0.18;
//        for (int i = 1; i <= 50; i++){
//            System.out.printf(i + " - R$ %.2f%n", (valPao * i));
//        }

//        ====== caixa ======
//        int compra;
//        double valor;
//        double total = 0;
//        double dinheiro;
//        double troco;
//        boolean finalizada = false;
//        String continuarCompra;
//        String output;

//        for (int i;;){
//            i = 1;
//            finalizada = false;
//            System.out.println("Lojas Tabajara");
//            do {
//                System.out.printf("Produto " + i++ + ": R$ ");
//                valor = scan.nextDouble();
//                total += valor;
//                if (valor == 0){
//                    finalizada = true;
//                }
//            }while (!finalizada);
//            System.out.printf("Total: R$ %.2f%n", total);
//            dinheiro = scan.nextDouble();
//            troco = dinheiro - total;
//            System.out.printf("Dinheiro: R$ %.2f%n", dinheiro);
//            System.out.printf("Troco: R$ %.2f%n", troco);
//            System.out.println("-----------------------");

//        do {
//            System.out.println("Deseja informar uma nova compra? S/N");
//            continuarCompra = scan.next();
//            if (continuarCompra.equalsIgnoreCase("s")){
//                output = "Lojas Tabajara \n";
//                System.out.println("Informe a quantidade de itens comprados");
//                compra = scan.nextInt();
//                total = 0;
//                for (int i = 1; i <= compra; i++){
//                    System.out.println("Informe o valor do Produto " + i);
//                    valor = scan.nextDouble();
//                    total += valor;
//                    output += "Produto " + i + ": R$ " + valor + "\n";
//                }
//                output += "Total: R$ " + total + "\n";
//                System.out.println("Total: R$ " + total);
//                System.out.println("Informe o pagamento: ");
//                dinheiro = scan.nextDouble();
//                output += "Dinheiro: R$ " + dinheiro + "\n";
//                troco = dinheiro - total;
//                output += "Troco: R$ " + troco;
//                System.out.println(output);
//            } else {
//                finalizada = true;
//            }
//        } while (!finalizada);

//        ====== fatorial ======
//        System.out.println("Entre com um número:");
//        int num = scan.nextInt();
//        int fatorial = 1;
//        System.out.println("Fatorial de " + num);
//        System.out.print(num + "! = ");
//        for (int i = num; i > 1; i--){
//            fatorial *= i;
//            System.out.print(i + " . " );
//        }
//        System.out.println(" 1 = " + fatorial);

//        ====== temperaturas ======
//        System.out.println("Entre com a quantidade de Temperaturas: ");
//        int qtdTemperaturas = scan.nextInt();
//        double temperatura;
//        double maior = Integer.MIN_VALUE;
//        double menor = Integer.MAX_VALUE;
//        double soma = 0;
//        for (int i = 1; i <= qtdTemperaturas; i++){
//            System.out.println("Temperatura " + i + " - ");
//            temperatura = scan.nextDouble();
//            soma += temperatura;
//            if (temperatura > maior){
//                maior = temperatura;
//            } else if (temperatura < menor) {
//                menor = temperatura;
//            }
//        }
//        double media = soma / qtdTemperaturas;
//        System.out.println("Maior: " + maior);
//        System.out.println("Menor: " + menor);
//        System.out.println("Média: " + media);

//        ====== numeros primos ======
//        System.out.println("Entre com um número:");
//        int num = scan.nextInt();
//        System.out.println("Números Primos até " + num);
//        boolean primo = true;
//
//        for (int i = 1; i <= num; i++){
//            primo = true;
//            for (int j = 2; j < i; j++){
//                if (i % j == 0){
//                    primo = false;
//                }
//            }
//            if (primo){
//                System.out.println(i);
//            }
//        }

//        ====== tabuada ======
//        System.out.println("Entre com um número: ");
//        int num = scan.nextInt();
//        int inicio, fim;
//        boolean invalido = true;
//        do {
//            System.out.println("Entre com o inicio da tabuada:");
//            inicio = scan.nextInt();
//            System.out.println("Entre com o final da tabuada:");
//            fim = scan.nextInt();
//            if(fim > inicio){
//                invalido = false;
//            }
//        } while (invalido);
//
//        System.out.println("Começar por: " + inicio);
//        System.out.println("Terminar por: " + fim);
//        System.out.println("Tabuada de " + num + " começando em " + inicio + " e terminando em " + fim +":");
//        for (int i = inicio; i <= fim; i++){
//                System.out.println(num + " * " + i + " = " + num*i);
//        }

//        ====== aumento salarial por ano ======
//        double salario = 1000;
//        double percentualAumento = 1.5;
//        int anoTrabalho = 1995;
//        DecimalFormat format = new DecimalFormat("###,###.##");
//        System.out.println("Ano em que foi contratado: 1995");
//        System.out.println("Salário inicial: R$ 1.000");
//        for (int i = anoTrabalho; i <= 2023; i++){
//            System.out.println(i + ": R$ " + format.format(salario));
//            salario += (salario / 100) * percentualAumento;
//            percentualAumento *= 2;
//        }

//        ====== lanchonete ======
//        System.out.println("Especificaçâo     Código   Preço");
//        System.out.println("Cachorro Quente   100      R$ 1,20");
//        System.out.println("Bauru Simples     101      R$ 1,30");
//        System.out.println("Bauru com ovo     102      R$ 1,50");
//        System.out.println("Hambúrguer        103      R$ 1,20");
//        System.out.println("Cheeseburguer     104      R$ 1,30");
//        System.out.println("Refrigerante      105      R$ 1,00");
//        String confirmPedido;
//        int cod, qtd;
//        double total = 0;
//        String output = "";
//        boolean finalizado = false;
//        do {
//            System.out.println("Digite o código e a quantidade do item. Digite 0 0 para finalizar o pedido.");
//            cod = scan.nextInt();
//            qtd = scan.nextInt();
//            if (cod == 0 && qtd == 0){
//                       finalizado = true;
//                       output += "Total a pagar: R$ " + total;
//            } else {
//                switch (cod){
//                    case 100:
//                        output += "Cachorro Quente -> 1,20 * " + qtd;
//                        output += " = " + (1.2 * qtd) + "\n";
//                        total += 1.2 * qtd;
//                        break;
//                    case 101:
//                        output += "Bauru Simples -> 1,30 * " + qtd;
//                        output += " = " + (1.3 * qtd) + "\n";
//                        total += 1.3 * qtd;
//                        break;
//                    case 102:
//                        output += "Bauru com ovo -> 1,50 * " + qtd;
//                        output += " = " + (1.5 * qtd) + "\n";
//                        total += 1.5 * qtd;
//                        break;
//                    case 103:
//                        output += "Hambúrguer -> 1,20 * " + qtd;
//                        output += " = " + (1.2 * qtd) + "\n";
//                        total += 1.2 * qtd;
//                        break;
//                    case 104:
//                        output += "Cheeseburguer -> 1,30 * " + qtd;
//                        output += " = " + (1.3 * qtd) + "\n";
//                        total += 1.3 * qtd;
//                        break;
//                    case 105:
//                        output += "Refrigerante -> 1,00 * " + qtd;
//                        output += " = " + (qtd) + "\n";
//                        total += qtd;
//                        break;
//                }
//            }
//        } while (!finalizado);
//        System.out.println(output);

//        ====== n - 1 | m - 2
//        System.out.println("Entre com o valor de n:");
//        int n = scan.nextInt();
//        double soma = 0;
//        System.out.print("s = ");
//        for (int i = 1, j = 1; i <= n; i++, j+=2){
//            System.out.print(i + "/" + j + " + ");
//            soma += i/j;
//        }
//        System.out.println(" = " + soma);

//        ====== 1 / n ======
        System.out.println("Digite o valor de n:");
        int n = scan.nextInt();
        double soma = 0;
        for (int i = 1; i <=n ; i++){
            System.out.print("1/" + i + " + ");
            soma += 1/i;
        }
        System.out.println(" = " + soma);
    }
}
