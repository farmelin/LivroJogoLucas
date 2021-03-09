/*AUTOR: LUCAS CARDOSO DE OLIVEIRA
 *NOME DO JOGO: TrabalhadorBrasileiro: Versão São Paulo
 *Atividade realizada no módulo de Lógica de Programação da imersão Java Xpert 
 */

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class JogoDoTrabalhadorBrasileiro {

	public static void began() {
		System.out.println("");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("É isso " + nome + " eu também amo as segundas feiras, sendo assim espero que durma e bem e descanse, porque amanhã vocÊ sabera o inferno que é trabalhar em São Paulo... Nos vemos amanhã!");
		System.out.println("");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("                             Z             ");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("                       Z                   ");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("        .,.,        z           ");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("      (((((())    z             ");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("     ((('_  _`) '               ");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("     ((G   \' |)                 ");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("     (((`   \"                   ");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("     .((\'.:~:          .--------------.    ");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("     __.| `\'\"'.__      | \'              |     ");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("  .~~   `---'   ~.    |  .             :     ");
		TimeUnit.SECONDS.sleep(1);
		System.out.println(" /                `   |   `-.__________)     ");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("|             ~       |  :             :   ");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("|                     |  :  |              ");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("|    _                |     |   [ ##   :   ");
		TimeUnit.SECONDS.sleep(1);
		System.out.println(" \'    ~~-.            |  ,   oo_______.'   ");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("  `_   ( \') _____/~~~~ `--___              ");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("  | ~`-)  ) `-.   `---   ( - a:f -         ");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("  |   '///`  | `-.                         ");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("  |     | |  |    `-.                      ");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("  |     | |  |       `-.                   ");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("  |     | |\' |                             ");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("  |     | | \'|                             ");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("   `-.  | |  |                             ");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("      `-| '");
	}

	
	
	public static void reg () {
		System.out.println("1 - Zona Norte");
		System.out.println("2 - Zona Sul");
		System.out.println("3 - Zona Leste");
		System.out.println("4 - Zona Oeste");
	}
	
	public static void zs () {
	System.out.println("Ótimo, você escolheu Zona Norte, sendo assim o seu local de trabalho será na Zona Sul.");
	localTrabalho = "Zona Sul";
	}
	
	public static void zn () {
	System.out.println("Ótimo, você escolheu Zona Zul, sendo assim o seu local de trabalho será na Zona Norte.");
	localTrabalho = "Zona Norte";
	}
	
	public static void zo () {
	System.out.println("Ótimo, você escolheu Zona Leste, sendo assim o seu local de trabalho será na Zona Oeste.");
	localTrabalho = "Zona Oeste";
	}
	
	public static void zl () {
	System.out.println("Ótimo, você escolheu Zona Oeste, sendo assim o seu local de trabalho será na na Zona Leste.");
	localTrabalho = "Zona Leste";
	}
	
	public static void transporte () 
	{
		System.out.println("Por favor, selecione algum transporte abaixo: ");
		
		System.out.println("1 - Ônibus");
		System.out.println("2 - Metrô");
		System.out.println("3 - Carro");	
	}
	
	
	
	
	public static void main(String[] args) throws InterruptedException {
		String nome;
		String amoSegundaFeira;
		int regiaoResidencia = 0;
		int menuTransporte = 0;
		int menuSolucao = 0;
		int menuDesculpa =0;
		String desculpa;
		String solucao = null;
		String localTrabalho = null;
		String meioTransporte = null;
		String hora = "05:30";

		
		int horario;
		
		Scanner leitor = new Scanner (System.in);
		
		System.out.println("Olá brasileirinho, hoje é domingo de noite e amanhã é dia de trabalhar!");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("");
		System.out.println("Espero que você esteja feliz por amanhã ser segunda-feira!");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("");
		System.out.println("Para comerçarmos, por favor digite o seu nome: ");
		TimeUnit.SECONDS.sleep(1);
		nome = leitor.nextLine();
		
		System.out.println("");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("Certo "+ nome + " :)... agora para iniciarmos bem animados o jogo por favor digite: \"Eu amo as segundas-feiras\"");
		
		amoSegundaFeira = leitor.nextLine();
		
		while (!amoSegundaFeira.equalsIgnoreCase("Eu amo as segundas-feiras")) {
			TimeUnit.SECONDS.sleep(1);
			System.out.println("Ahhh Vamos lá :( Você ama as segundas feiras, digita certo... \"Eu amo as segundas-feiras\"");
			amoSegundaFeira = leitor.nextLine();
		}			
			began();
		
		System.out.println("*Celular desperta, são 05:30 de uma segunda-feira");
		System.out.println("Bom dia " + nome + "! Espero que você esteja preparado para ir ao trabalho!");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("Vamos iniciar essa segunda-feira descobrindo onde você mora");
		System.out.println("");
		TimeUnit.SECONDS.sleep(2);
			
		while (regiaoResidencia ==0 || regiaoResidencia >4 )  {
			
			System.out.println("");
			
			System.out.println("Por favor, utilize as opções abaixo: ");
			TimeUnit.SECONDS.sleep(1);
			
			reg();
			regiaoResidencia = leitor.nextInt();
		
		switch(regiaoResidencia) {
		case 1:
			zs();
			break;
		case 2:
			zn();
			break;
		case 3:
			zo();
		case 4:
			zl();
			break;
	
		}
		
		}
		
		hora = "05:45";
		
		System.out.println("");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("Perfeito, sabemos que você irá trabalhar na " + localTrabalho + " e o seu horário de entrada é às 08:00 porém agora já são " + hora);
		
		System.out.println(" Sabendo como São Paulo funciona, devemos escolher o seu meio de transporte.");
		TimeUnit.SECONDS.sleep(2);
		while (menuTransporte ==0 || menuTransporte >3 ) {
			
			System.out.println("");
			TimeUnit.SECONDS.sleep(1);
			
			transporte();
			menuTransporte = leitor.nextInt();
		
		switch (menuTransporte) {
		case 1:
			meioTransporte = "Ônibus";
			break;
		case 2:
			meioTransporte = "Metrô";
		case 3:
			meioTransporte = "Carro";
		
		}
					
		}
	
	for(int i=0;i==0;)  {
				
	if(meioTransporte.equals("Ônibus")) {
							
		while(menuSolucao == 0 || menuSolucao > 2) {
			System.out.println("");
			TimeUnit.SECONDS.sleep(1);
			System.out.println("Você já está dentro do "+ meioTransporte + " porém infelizmente o ônibus quebrou");
			
			System.out.println("Por favor escolha uma ação abaixo para prosseguir com o jogo: ");
			
			System.out.println("");
			TimeUnit.SECONDS.sleep(1);
			System.out.println("1 - Arguardar ");
			System.out.println("2 - Escolher outro meio de transporte");
			menuSolucao = leitor.nextInt();
			
			switch(menuSolucao) {
			case 1:
			    solucao = "Aguardar";
			    menuSolucao = 1;
			    i = 1;
			case 2:
				menuSolucao = 2;
				menuTransporte = 0;
				i = 0;
				while (menuTransporte ==0 || menuTransporte > 2 ) {
					
					System.out.println("");
					TimeUnit.SECONDS.sleep(1);
					System.out.println("Por favor, selecione algum transporte abaixo: ");
					
					System.out.println("1 - Metrô");
					System.out.println("2 - Carro");
					
					menuTransporte = leitor.nextInt();
				
				switch (menuTransporte) {
				
				case 1:
					meioTransporte = "Metrô";
					menuTransporte = 1;
					break;
				case 2:
					meioTransporte = "Carro";
					menuTransporte = 2;
					break;
					}
				}
				break;
		}
		
	
	}
		
	}
	
	else if (meioTransporte.equals("Metrô")) {
		
		while(menuSolucao == 0 || menuSolucao > 2) {
			System.out.println("");
			System.out.println("Você já está dentro do "+ meioTransporte + " porém infelizmente há um objeto na linha.");
			TimeUnit.SECONDS.sleep(1);
			System.out.println("As portas do vagão do trem foram abertas e você precisará tomar alguma ação para prosseguir");
			
			System.out.println("Por favor escolha uma ação abaixo para prosseguir com o jogo: ");
			
			System.out.println("");
			TimeUnit.SECONDS.sleep(1);
			System.out.println("1 - Arguardar o metrô voltar a funcionar");
			System.out.println("2 - Desembarcar do trem e mudar o meio de transporte");
			menuSolucao = leitor.nextInt();
			
			switch(menuSolucao) {
			case 1:
			    solucao = "Aguardar";
			    menuSolucao = 1;
			case 2:
				menuSolucao = 2;
				menuTransporte = 0;
				while (menuTransporte ==0 || menuTransporte > 2 ) {
					
					System.out.println("");
					TimeUnit.SECONDS.sleep(1);
					System.out.println("Por favor, selecione algum transporte abaixo: ");
					
					System.out.println("1 - Ônibus");
					System.out.println("2 - Carro");
					
					menuTransporte = leitor.nextInt();
				
				switch (menuTransporte) {
				
				case 1:
					meioTransporte = "Ônibus";
					menuTransporte = 1;
					break;
				case 2:
					meioTransporte = "Carro";
					menuTransporte = 2;
					break;
					}
				}
				break;
			}
		
	
	}
		
	}
	else if (meioTransporte.equals("Carro")) {
		
		while(menuSolucao == 0 || menuSolucao > 2) {
			System.out.println("");
			TimeUnit.SECONDS.sleep(1);
			System.out.println("Você já está dentro do "+ meioTransporte + " só que infelizmente há um protesto, o pneu furou");
			System.out.println("e todas as vias estão engarrafadas devido a um acidente envolvendo um motoqueiro");
			
			TimeUnit.SECONDS.sleep(1);
			System.out.println("Por favor, escolha uma ação abaixo para prosseguir com o jogo: ");
			
			System.out.println("");
			TimeUnit.SECONDS.sleep(1);
			System.out.println("1 - Arrumar o pneu, aguardar o liberarem o transito e esperar protesto terminar");
			System.out.println("2 - Abandonar o carro e escolher um novo meio de transporte");
			menuSolucao = leitor.nextInt();
			
			switch(menuSolucao) {
			case 1:
			    solucao = "Aguardar";
			    menuSolucao = 1;
			case 2:
				menuSolucao = 2;
				menuTransporte = 0;
				while (menuTransporte ==0 || menuTransporte > 2 ) {
					
					System.out.println("");
					TimeUnit.SECONDS.sleep(1);
					System.out.println("Por favor, selecione algum transporte abaixo: ");
					
					System.out.println("1 - Ônibus");
					System.out.println("2 - Metrô");
					
					menuTransporte = leitor.nextInt();
				
				switch (menuTransporte) {
				
				case 1:
					meioTransporte = "Ônibus";
					menuTransporte = 1;
					break;
				case 2:
					meioTransporte = "Metrô";
					menuTransporte = 2;
					break;
					}
				}
				break;
			}
		
	
	}
		
	}
	}
	
	System.out.println("Você escolheu \"aguardar\", uma hora o caos vai passar...");
	System.out.println("");
	
	System.out.println(" (  )   (   )  ) ");
	TimeUnit.SECONDS.sleep(1);
	System.out.println("     ) (   )  (  ( ");
	TimeUnit.SECONDS.sleep(1);
	System.out.println("     ( )  (    ) ) ");
	TimeUnit.SECONDS.sleep(1);
	System.out.println("     _____________");
	TimeUnit.SECONDS.sleep(1);
	System.out.println("    <_____________> ___");
	TimeUnit.SECONDS.sleep(1);
	System.out.println("    |             |/ _ \'");
	TimeUnit.SECONDS.sleep(1);
	System.out.println("    |               | | |");
	TimeUnit.SECONDS.sleep(1);
	System.out.println("    |               |_| |");
	TimeUnit.SECONDS.sleep(1);
	System.out.println(" ___|             |\'___/");
	TimeUnit.SECONDS.sleep(1);
	System.out.println("/    \'___________/    \'");
	TimeUnit.SECONDS.sleep(1);
	System.out.println("\'_____________________/");
	
	System.out.println("");
	
	TimeUnit.SECONDS.sleep(2);
	
	System.out.println("*O telefone começa a tocar*");
	System.out.println("");
	System.out.println("*Você olha para o celular e percebe que é o seu chefe ligando e atende a chamada");
	TimeUnit.SECONDS.sleep(1);
	System.out.println("");
	System.out.println("Seu chefe te faz uma série de perguntas extremamente bravo, e uma dessas perguntas é a:");
	System.out.println("");
	TimeUnit.SECONDS.sleep(1);
	System.out.println("Porque raios, você está demorando tanto para chegar ao trabalho?");
	TimeUnit.SECONDS.sleep(1);
	System.out.println("Você pensa e responde: ");
	
	while (menuDesculpa ==0 || menuDesculpa >4) {
		System.out.println("");
		
		System.out.println("Por favor, selecione a desculpa esfarrapada que dará ao seu chefe");
		
		System.out.println("1 - O ônibus parou, estou a mais de duas horas esperando ele ser consertado");
		System.out.println("2 - Alguém derrubou alguma coisa no trilho do trem e por isso estou atrasado");
		System.out.println("3 - Os índios estão fazendo protesto na paulista, o peneu do carro furou e um motoqueiro caiu na marginal");
		System.out.println("4 - Precisei levar minha vó na aula de Jiu-Jitsu, hoje era o exame de faixa dela");
		
		menuDesculpa = leitor.nextInt();
		
		switch(menuDesculpa) {
		case 1:
			menuDesculpa = 1;
			System.out.println("Chefe - Você deveria ter se antecipado, você sabe como SP funciona, assim que chegar passe no RH");
			TimeUnit.SECONDS.sleep(2);
			System.out.println("");
			System.out.println("Você foi demitido");
		break;
		case 2:
			menuDesculpa = 2;
			System.out.println("Chefe - Não tem um dia que o metrô não pare de funcionar, você deveria saber disso. Assim que chegar passe no RH");
			TimeUnit.SECONDS.sleep(2);
			System.out.println("");
			System.out.println("Você foi demitido");
		break;
		case 3:
			menuDesculpa = 3;
			TimeUnit.SECONDS.sleep(1);
			System.out.println("Chefe - Sabendo onde você mora, você deveria ter saído de casa a pelo menos 2 dias para chegar aqui hoje");
			TimeUnit.SECONDS.sleep(1);
			System.out.println("");
			System.out.println("Chefe - Todo dia um motoboy cai na marginal");
			System.out.println("");
			TimeUnit.SECONDS.sleep(1);
			System.out.println("Chefe - Todo dia tem protesto na Paulista");
			System.out.println("");
			TimeUnit.SECONDS.sleep(1);
			System.out.println("Chefe - Se o pneu furou a culpa é sua também");
			System.out.println("");
			TimeUnit.SECONDS.sleep(1);
			System.out.println("Assim que chegar passe no RH");
			System.out.println("");
			TimeUnit.SECONDS.sleep(2);
			System.out.println("Você foi demitido");
			break;
		case 4:
			menuDesculpa = 4;
			TimeUnit.SECONDS.sleep(1);
			System.out.println("Chefe - Entendo bem,"+ nome + "minha vó também luta jiu-jitsu");
			System.out.println("");
			TimeUnit.SECONDS.sleep(1);
			System.out.println("Chefe - Sei que esses exames de faixa demoram");
			System.out.println("");
			TimeUnit.SECONDS.sleep(1);
			System.out.println("Chefe - Leve o tempo que precisar para chegar aqui ao trabalho");
			TimeUnit.SECONDS.sleep(1);
			System.out.println("Chefe - E quando chegar me avise. Eu pago seu almoço!");
			TimeUnit.SECONDS.sleep(1);
			System.out.println("Você ganhou moral com o chefe!! Parabéns");
		}
		
	}
	
	System.out.println("┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼");
	TimeUnit.SECONDS.sleep(1);
	System.out.println("███▀▀▀██┼███▀▀▀███┼███▀█▄█▀███┼██▀▀▀");
	TimeUnit.SECONDS.sleep(1);
	System.out.println("██┼┼┼┼██┼██┼┼┼┼┼██┼██┼┼┼█┼┼┼██┼██┼┼┼");
	TimeUnit.SECONDS.sleep(1);
	System.out.println("██┼┼┼▄▄▄┼██▄▄▄▄▄██┼██┼┼┼▀┼┼┼██┼██▀▀▀");
	TimeUnit.SECONDS.sleep(1);
	System.out.println("██┼┼┼┼██┼██┼┼┼┼┼██┼██┼┼┼┼┼┼┼██┼██┼┼┼");
	TimeUnit.SECONDS.sleep(1);
	System.out.println("███▄▄▄██┼██┼┼┼┼┼██┼██┼┼┼┼┼┼┼██┼██▄▄▄");
	TimeUnit.SECONDS.sleep(1);
	System.out.println("┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼");
	TimeUnit.SECONDS.sleep(1);
	System.out.println("███▀▀▀███┼▀███┼┼██▀┼██▀▀▀┼██▀▀▀▀██▄┼");
	TimeUnit.SECONDS.sleep(1);
	System.out.println("██┼┼┼┼┼██┼┼┼██┼┼██┼┼██┼┼┼┼██┼┼┼┼┼██┼");
	TimeUnit.SECONDS.sleep(1);
	System.out.println("██┼┼┼┼┼██┼┼┼██┼┼██┼┼██▀▀▀┼██▄▄▄▄▄▀▀┼");
	TimeUnit.SECONDS.sleep(1);
	System.out.println("██┼┼┼┼┼██┼┼┼██┼┼█▀┼┼██┼┼┼┼██┼┼┼┼┼██┼");
	TimeUnit.SECONDS.sleep(1);
	System.out.println("███▄▄▄███┼┼┼─▀█▀┼┼─┼██▄▄▄┼██┼┼┼┼┼██▄");
	TimeUnit.SECONDS.sleep(1);
	System.out.println("┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼");
	
	leitor.close();
	
}
}
