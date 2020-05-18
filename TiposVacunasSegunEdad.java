import java.util.Scanner;

class TiposVacunasSegunEdad{
static Scanner teclado=new Scanner(System.in);
//algoritmo para vacunas segun edad y sexo
//creado por Jhobany Ticona 
public static void TiposVacunasSegunEdadJTG(){
  String sexo, tipoVacuna;
  int edad;
  //datos de entrada
  System.out.println("Ingrese la edad de la persona");
  edad=teclado.nextInt();
  System.out.println("Ingrese el sexo de a persona");
  sexo=teclado.next();
  //proceso
  if(edad<16){
    tipoVacuna="aplicar vacuna tipo A";
  }else if(edad>=16 && edad<=69){
    if(sexo.equals("M")){
      tipoVacuna="aplicar vacuna tipo B";
    }else{
      tipoVacuna="aplicar vacuna tipo A";
    }
  }else{
    tipoVacuna="aplicar vacuna tipo C";
  }
  //DATOS DE SALIDA
  System.out.println(tipoVacuna);
}


public static void main(String[] arg){
   System.out.println("Holas");
   TiposVacunasSegunEdadJTG();
}
}