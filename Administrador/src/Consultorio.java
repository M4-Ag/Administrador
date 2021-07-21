//Mario Alejandro Aguirre | 2944585

import javax.print.Doc;
import java.util.Scanner;

//CLASES
class AltaDoc
{
    //Scanner scanD = new Scanner(System.in);
    String NombreDoc;
    String Especialidad;
    int idDoc;
}

class AltaPac
{
    //Scanner scanD = new Scanner(System.in);
    String NombrePac;
    int idPac;
}

class CrearCita
{
    String Doctor_Asig;
    String Paciente_Asig;
    String Razon;
    String Fecha;
    String Hora;
    int idCita;
}
//////////////////////////////////////////////////////////////////////////
public class Consultorio  {
    //Funciones
    /////////////////////

    /*MAIN*/
    public static void main(String[] args)
    {
        //Variables
        Scanner scan = new Scanner(System.in);
        int op=99;
        int ContD=0;
        int ContP=0;
        int ContC=0;
        int size = 10;
        AltaDoc objDoc[] = new AltaDoc[size];
        AltaPac objPac[] = new AltaPac[size];
        CrearCita objCita[] = new CrearCita[size];
        do
        {
            System.out.println("\n1. Alta de Doctor");
            System.out.println("2. Alta de Paciente");
            System.out.println("3. Crear cita");
            System.out.println("4. Ver citas agendadas");
            System.out.println("0. Salir");
            System.out.println("\nSelecciona opcion:");
            op=scan.nextInt();
            scan.nextLine();

            switch (op)
            {
                case 1:
                    objDoc[ContD]= new AltaDoc();

                    System.out.println("Alta de Doctor");
                    System.out.println("Nombre del doctor:");
                    objDoc[ContD].NombreDoc=scan.nextLine();
                    System.out.println("Especialidad:");
                    objDoc[ContD].Especialidad=scan.nextLine();
                    //System.out.println("Numero de ID:");
                    objDoc[ContD].idDoc=ContD+1;

                    System.out.println("Doctor "+objDoc[ContD].NombreDoc+" dado de alta");
                    ContD++;
                    break;
                case 2:
                    objPac[ContP]= new AltaPac();

                    System.out.println("Alta de Paciente");
                    System.out.println("Nombre del paciente:");
                    objPac[ContP].NombrePac=scan.nextLine();
                    //System.out.println("Numero de ID:");
                    objPac[ContP].idPac=ContP+1;

                    System.out.println("Paciente "+objPac[ContP].NombrePac+" dado de alta");
                    ContP++;
                    break;
                case 3:
                    objCita[ContC]= new CrearCita();

                    System.out.println("\nCrear cita");
                    System.out.println("**Lista de doctores:");
                    try {
                        for (int i = 0; i < objDoc.length; i++) {
                            System.out.println("-" + objDoc[i].NombreDoc);
                        }
                    } catch (Exception e)
                    {}
                    try {
                        System.out.println("**Lista de pacientes:");
                        for (int j = 0; j < objPac.length; j++) {
                            System.out.println("-" + objPac[j].NombrePac);
                        }
                    } catch (Exception e)
                    {}

                    System.out.println("\nDoctor asignado:");
                    objCita[ContC].Doctor_Asig= scan.nextLine();
                    System.out.println("Paciente asignado:");
                    objCita[ContC].Paciente_Asig= scan.nextLine();
                    System.out.println("Razon medica:");
                    objCita[ContC].Razon= scan.nextLine();
                    System.out.println("Fecha [dd/mm/aaaa]");
                    objCita[ContC].Fecha= scan.nextLine();
                    System.out.println("Hora [hh:mm]");
                    objCita[ContC].Hora= scan.nextLine();
                    objCita[ContC].idCita=ContC+1;

                    System.out.println("\nCita generada");
                    ContC++;
                    break;
                case 4:
                    System.out.println("\nCitas agendadas");
                    for (int k=0;k<objCita.length;k++)
                    {
                        try {
                            System.out.println("\nFecha: " + objCita[k].Fecha + "| Hora: " + objCita[k].Hora);
                            System.out.println("Doctor: " + objCita[k].Doctor_Asig);
                            System.out.println("Paciente: " + objCita[k].Paciente_Asig);
                            System.out.println("Motivo: " + objCita[k].Razon);
                        } catch (Exception e) {
                        }
                    }
                    break;
            }
        }while (op!=0);
    }
}
