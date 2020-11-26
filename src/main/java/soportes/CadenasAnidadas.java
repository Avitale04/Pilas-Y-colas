package soportes;

public class CadenasAnidadas {

    public String S;
    public char x [];
    int anidado = 0;
    boolean noAnidado = false;
    int comparacion =0;

    public CadenasAnidadas(String S){

        this.S = S;
    }

    public int revisarAnidacion(){

        //escribir la cadena
        System.out.println(S);

        //se descompone el String en un array
        String stringSinEspacios = S.replaceAll(" ", "");
        x = stringSinEspacios.toCharArray();

        // se recorre el nuevo array
       for(int i = 0; i<= x.length -1; i++){System.out.print(x[i] + ", ");}
        System.out.println("");

       if(x.length == 0){

           anidado = 1;

       }else{

           //Se revisan los elementos internos del array
           for(int y = 0; y<= x.length -1; y++){

               if(y <= (x.length -1) /2){

                   System.out.println(x[y]+" "+x[(x.length -1)-y]);
                   System.out.println(Character.compare(x[y],x[(x.length -1)-y]));

                   int comparacionAnterior = comparacion;

                   comparacion = Character.compare(x[y],x[(x.length -1)-y]);

                   if(comparacionAnterior >0 && comparacion >0){

                       anidado = 0;noAnidado = true;
                   }

                   if(comparacion < 3 && comparacion > -3 && comparacion !=0 && !noAnidado){

                       if(x.length == 2 && comparacion >=1 || y==0 && comparacion >=1)
                       {anidado = 0;noAnidado = true;}
                       else{anidado = 1;}

                   }else{

                       anidado = 0;
                       noAnidado = true;

                   }
               }
           }
       }
        System.out.println("El resultade de la anidacion es = " + anidado);
        return anidado;
    }
}
