package com.calata;

/**
 * Created by jcala on 15/02/2017.
 */
public class Divisor{

    public static int dividirRecursivo(int dividendo, int divisor){
        int resto = dividendo-divisor;
        if(resto < 0){
            return 0;
        }else{
            return 1 + dividirRecursivo(resto,divisor);
        }
    }

    public static int dividirIterativo(int dividendo,int divisor){
        int resto = dividendo - divisor;
        int endo = dividendo;
        int isor = divisor;
        int cocciente = 0;
        while(endo-isor >= 0){
            cocciente++;
            resto = endo - isor;
            endo = resto;
        }
        return cocciente;
    }
}
