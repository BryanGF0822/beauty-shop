package ui;

import model.*;

import java.util.Scanner;

public class Main{

	//Relations

	private BeautyShop control;

	//Constructor


	public Main(){
		init();
	
	}

			public static void main(String[] args) {
				Main program = new Main();
				program.menu();

	}

	public void menu(){

		Scanner entrada = new Scanner(System.in);


		



			System.out. println("------------------------------------------------------------------------------");

			System.out. println(".                          BIENVENIDOS A BEAUTY-SHOP");

			System.out. println("------------------------------------------------------------------------------");

			System.out.println(" ");




		Scanner sn = new Scanner(System.in);

		boolean salir = false;

		int opcion;

		while (salir == false){

			System.out.println(" ");

			System.out.println("MENU");

			System.out.println("1. Registrar un servicio.");

			System.out.println("2. Calcular el promedio de ingreso por servicio de los empleados.");

			System.out.println("3. Consultar la ganacia que obtuvo al prestar servicios de un tipo especifico.");

			System.out.println("4. Generar un reporte por cada empleado.");

			System.out.println("5. Salir del menu");



			System.out.println(" ");

			System.out.println("Selecciona la opcion que deseas realizar:");

			opcion = sn.nextInt();


				switch(opcion){

					case 1:

						System.out.println("Seleccione el tipo de servicio: ");

						System.out.println("1. " + Service.CORTE_DE_CABELLO);
						System.out.println("2. " + Service.MANICURE);
						System.out.println("3. " + Service.PERDICURE);
						int serviceOption = sn.nextInt();

						System.out.println("Seleciones el empleado: ");

						System.out.println("1. " + control.getEmplo1().getName());
						System.out.println("2. " + control.getEmplo2().getName());
						int employeeOption = sn.nextInt();

						System.out.println("Ingrese la cantidad de veces que se realizo el servicio: ");
						int amountTimesService= sn.nextInt();

						control.registerService(serviceOption, employeeOption, amountTimesService);


						break;

					case 2:

						System.out.println();
						break;

					case 3:

						System.out.println();
						break;

					case 4:

						System.out.println();
						break;

					case 5:

					salir = true;
					System.out.println("Menu Cerrado");




				}
			

			
		}

	}

	public void init(){

		Service s3 = new Service ("Pedicure", 0, 0, 0);

		Service s2 = new Service ("Manicure", 0, 0, 0);

		Service s1 = new Service ("Corte de cabello", 0, 0, 0);

		Employee emplo2 = new Employee ("Alexandra", 6701722, "empleada", 2017, s1, s2, s3);

		Employee emplo1 = new Employee ("Natalia", 1143756934, "empleada", 2015,s1, s2, s3);

		control = new BeautyShop (emplo1, emplo2);
	
	}


}