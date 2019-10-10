/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg173211automatafinal;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Jorge Julian Sanchez
 */
public class Automata173211 extends javax.swing.JFrame {
    //void hola (int hola) { instrucciones; }
    //void hola (int hola) { instrucciones };
    
    // float datahs (float val1, float val2){ instrucciones; return lol; }
    // float datahs (float val1, float val2) { instrucciones; return lol; }
    String validarsegundodevoid;
    String[] separarsplit2;
    String nameparRetur;
    String ultimallave;
    String entero = "int";
    String booleano = "boolean";
    String floatt = "float";
    String letra = "String";
    String voidd = "void";
    String instrucciones ="instrucciones";
    String retorno ="return";
    // DatosReservados
    int contador; //contador global
    int contadorVoid; // contador parami void xd
    int contpos;
    // Contadores
    String val_variablespace;
    String nameVariable;
    String validarFinalVariable;
    String aceptarvariable;
    
    String datos123; // dato general de todo en valueOf
    String[] datosdelvoid; // lo ocupo en mi funcion validando
    String[] separadordeultimoq; // para el ultimosplitsperando {
    
    String cacha;
    String cachaconespacio;
    String datoreservado;
    String tipodato;
    String typeVariable;
    String val_variable;
    JLabel label;
    JButton boton;
    JTextField textooo;
    JTextArea area;
    JLabel mensaje;
    String validandotipodatodentrodeparentesis12; //entero
    String validandotipodatodentrodeparentesis1;//esteesparavoid
    char datosnuevos[] ;
    //Valor donde esta mi cadena original
   String aczino;
   String aczinoconespacio;
   
     // STRING, FLOAT , INT
   public void inicio() {
        contador = 0;
        contpos = 0;
        contadorVoid = 0;
        q0();
    }   
   public void q0(){
        this.jLabel1.setText("q0-------->");
        
        this.jLabel2.setText(null);
        this.jLabel2.setIcon(null);
        this.jLabel3.setText(null);
        this.jLabel3.setIcon(null);
        this.jLabel4.setText(null);
        this.jLabel4.setIcon(null);
        this.jLabel5.setText(null);
        this.jLabel5.setIcon(null);
        this.jLabel6.setText(null);
        this.jLabel6.setIcon(null);
        this.jLabel7.setText(null);
        this.jLabel7.setIcon(null);
        this.jLabel8.setText(null);
        this.jLabel8.setIcon(null);
        this.jLabel9.setText(null);
        this.jLabel9.setIcon(null);
        this.jLabel10.setText(null);
        this.jLabel10.setIcon(null);
        this.jLabel11.setText(null);
        this.jLabel11.setIcon(null);
        this.jLabel12.setText(null);
        this.jLabel12.setIcon(null);
        this.jLabel13.setText(null);
        this.jLabel13.setIcon(null);
        this.jLabel14.setText(null);
        this.jLabel14.setIcon(null);
        this.jLabel15.setText(null);
        this.jLabel15.setIcon(null);
        this.jLabel16.setText(null);
        this.jLabel16.setIcon(null);
        this.jLabel17.setText(null);
        this.jLabel17.setIcon(null);
        this.jLabel18.setText(null);
        this.jLabel18.setIcon(null);
        this.jLabel19.setText(null);
        this.jLabel19.setIcon(null);
        this.jLabel33.setText(null);
        this.jLabel33.setIcon(null);
        this.jLabel34.setText(null);
        this.jLabel34.setIcon(null);
        this.jLabel35.setText(null);
        this.jLabel35.setIcon(null);
        this.jLabel36.setText(null);
        this.jLabel36.setIcon(null);
        this.jLabel37.setText(null);
        this.jLabel37.setIcon(null);
        this.jLabel38.setText(null);
        this.jLabel38.setIcon(null);
        this.jLabel39.setText(null);
        this.jLabel39.setIcon(null);
        this.jLabel40.setText(null);
        this.jLabel40.setIcon(null);
        this.jLabel41.setText(null);
        this.jLabel41.setIcon(null);
        this.jLabel42.setText(null);
        this.jLabel42.setIcon(null);
        this.jLabel43.setText(null);
        this.jLabel43.setIcon(null);
        this.jLabel44.setText(null);
        this.jLabel44.setIcon(null);
        this.jLabel45.setIcon(null);
        this.jLabel20.setText(null);
        this.jLabel20.setIcon(null);
        
        
        
        
        
        
        
        System.out.println("q0");
        for (contador = 0; contador < datosnuevos.length; contador++) {           
            datos123 = String.valueOf(datosnuevos);
            String[] validardatoreservado = datos123.split(" ");
            datoreservado = validardatoreservado[0];
            contador++;
            if (datoreservado.equals(letra) || datoreservado.equals(entero) || datoreservado.equals(booleano) || datoreservado.equals(floatt)) {
                System.out.println(datoreservado);
                q1();
                
            } else {
                if (datoreservado.equals(voidd)) {
                    
                    contadorVoid++;
                    System.out.println(datoreservado);
                    q19();
                                                   } else {
                                                     this.jLabel1.setText("MAL");
                                                             }

                    }
                                                                       }
    }  
   public void q1(){
       this.jLabel2.setText("q1");
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg173211automatafinal/ciruclopequeño.png")));
        System.out.println("q1");
        
        
        int validarespacioparaq1 = datoreservado.length();
        
        try {
            if (datosnuevos[validarespacioparaq1] == ' ') {
                q2();
            }
        }catch (Exception e){
            
        }
        
        
    }
   public void q2(){
    
                   this.jLabel3.setText("q2");
                   jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg173211automatafinal/ciruclopequeño.png")));
                   datos123 = String.valueOf(datosnuevos);
                   String[] valiidandonombrereservando = datos123.split(" ");
                   tipodato = valiidandonombrereservando[1];
               for (int wos = 0; wos < tipodato.length(); wos++) {
                   
                   char caracter = tipodato.toUpperCase().charAt(wos);
                   int valorASCII = (int)caracter;
                            if (valorASCII != 165 && (valorASCII < 65 || valorASCII >90 )){
                                    try {
                            System.out.println("No son letras");
                            System.out.println(tipodato);
                            System.out.println(valorASCII);
                            System.out.println("q2");
                            this.jLabel3.setText("Cadena invalida");
                            jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg173211automatafinal/ciruclopequeño.png")));
                                     break;
                                
                                    } 
                                    catch (Exception e){} break;
                                    } 
                            
                            
                            else {
                                if (tipodato.equals(voidd) || tipodato.equals(instrucciones)|| tipodato.equals(letra) || tipodato.equals(entero)|| tipodato.equals(booleano)|| tipodato.equals(floatt)){
                                         System.out.println("q2");
                                         this.jLabel3.setText("Cadena invalida");
                                } else {
                                    q3();
                                }
                            } 
                    }
   }
   public void q3(){
       this.jLabel4.setText("q3");
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg173211automatafinal/ciruclopequeño.png")));
       System.out.println("q3");
       
       
       int validarespacioparaq1 = datoreservado.length() + tipodato.length() + 1;
       for (int jaze = validarespacioparaq1; jaze < datosnuevos.length; jaze++) {

            if (datosnuevos[jaze] == ' ') {
                q4();
            }
        }
       
//       for (int e =contador; e < datosnuevos.length; e++) {
//
//            if (datosnuevos[e] == ' ') {
//                contador++;
//                System.out.println(datosnuevos[e]);
//                
//                q4();
//            }
//            if (datosnuevos[e] == '(') { 
//                contador++;
//                System.out.println(datosnuevos[e]);
//                this.jLabel4.setText("q3");
//        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg173211automatafinal/ciruclopequeño.png")));
//       System.out.println("q3");
//                q5();
//            }
//            break;
//        }
   }
   public void q4(){
       System.out.println("q4");
       this.jLabel5.setText("q4");
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg173211automatafinal/ciruclopequeño.png")));
        
         int espaciodos = datoreservado.length() + tipodato.length() + 1;
        
        
      for (int jaze = espaciodos; jaze < datosnuevos.length; jaze++) {

            if (datosnuevos [jaze] == '(') {
                q5();
            }
            
        }
   }
   public void q5(){
        this.jLabel6.setText("q5");
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg173211automatafinal/ciruclopequeño.png")));
        System.out.println("q5");
        
        int espacioq5 = datoreservado.length() + tipodato.length() + 3;
        int espacioq5v1 = datoreservado.length() + tipodato.length() + 4;
        String parentesis1 = ")";
        try {
            if (datosnuevos[espacioq5] == ')' || datosnuevos[espacioq5v1] == ')')
            {
                q10();
            }else {
                    datos123 = String.valueOf(datosnuevos);
                    String[] parte3q5 = datos123.split("\\(");
                    aczinoconespacio  = parte3q5[1];
                    String[] parte4q5 = aczinoconespacio.split(" ");
                    aczino = parte4q5[0];
                    
                    if (aczino.equals(letra) || aczino.equals(voidd) || aczino.equals(entero)|| aczino.equals(booleano)|| aczino.equals(floatt) || aczino.equals(retorno) || aczino.equals(instrucciones)) {                       
                        if (datoreservado.equals(aczino)) {
                        System.out.println(aczino);
                            q6();
                        } else {
                             this.jLabel6.setText("Cadena invalida");
                             jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg173211automatafinal/ciruclopequeño.png")));
                            System.out.println(aczino);
                        }
                        } 
            }
            
        }catch (Exception e){
            
        }
       
     
   }
   public void q6(){
       System.out.println("q6");
       this.jLabel7.setText("q6");
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg173211automatafinal/ciruclopequeño.png")));
        contador++;
        for (int zz = contador; zz < datosnuevos.length; zz++) {
            contador++;
            if (datosnuevos[zz] == ' ') {
                System.out.println(datosnuevos[zz]);
                q7();
            }
        }
   }
   public void q7(){
       System.out.println("q7");
       
       this.jLabel8.setText("q7");
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg173211automatafinal/ciruclopequeño.png")));
       contador++;
        datos123 = String.valueOf(datosnuevos);
        String[] validandosplitdentrodeparentesis22 = datos123.split("\\(");
        validandotipodatodentrodeparentesis12 = validandosplitdentrodeparentesis22[1];

        String[] validandotipodatodentrodeparentesisreal22 = validandotipodatodentrodeparentesis12.split(" ");
        String palabrareservadalistadeentero = validandotipodatodentrodeparentesisreal22[1];

        String[] voidlisto = palabrareservadalistadeentero.split("\\)");
        String aceptarvariableotros = voidlisto[0];

        if (aceptarvariableotros.equals(letra) || aceptarvariableotros.equals(voidd) || aceptarvariableotros.equals(entero)|| aceptarvariableotros.equals(booleano)|| aceptarvariableotros.equals(floatt) || aceptarvariableotros.equals(instrucciones)|| aceptarvariableotros.equals(retorno)) {
                System.out.println(aceptarvariableotros);
         System.out.println("Error de cadena");
         System.exit(0);

        } else {
            System.out.print(aceptarvariableotros);
            q8();
        }
   }
   public void q8(){
       System.out.println("q8");
       this.jLabel9.setText("q8");
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg173211automatafinal/ciruclopequeño.png")));
        contador++;
        for (int entent = contador; entent < datosnuevos.length; entent++)     {
            contador++;
            if (datosnuevos[entent] == ',' & datosnuevos[entent] != ')') {
                System.out.println(datosnuevos[entent]);
                q9();
                                                                }
            if (datosnuevos[entent] == ')') {
                System.out.println(datosnuevos[entent]);
                q10();
                                                                }
                                                                    }
   }
   public void q9(){
       this.jLabel10.setText("q9");
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg173211automatafinal/ciruclopequeño.png")));
       System.out.println("q9");
        for (int uu = contador; uu < datosnuevos.length; uu++) {
            contador++;
            if (datosnuevos[uu] != ')') {
                System.out.println(datosnuevos[uu]);
                contador--;
                    for(int a = contador; a<datosnuevos.length; a++){
                        contador++;
                        datos123 = String.valueOf(datosnuevos);
                        String[] part3 = datos123.split("\\(");
                        val_variablespace = part3[1];
                        String[] part4 = val_variablespace.split(" ");
                        val_variable = part4[0];
                        if (val_variable.equals(letra) || val_variable.equals(voidd) || val_variable.equals(entero)|| val_variable.equals(booleano)|| val_variable.equals(floatt)) {                       
                         q6();
                        } 
                 }
            }
        }
   }
   public void q10(){
       this.jLabel11.setText("q10");
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg173211automatafinal/ciruclopequeño.png")));
       System.out.println("q10");
        for (int qten = 0; qten < datosnuevos.length; qten++) {
            if (datosnuevos[qten] == '{') {
                contador++;
                q11();
            } else {
                
            }
        }
   }
   public void q11(){
       System.out.println("q11");
this.jLabel12.setText("q11");
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg173211automatafinal/ciruclopequeño.png")));
        datos123 = String.valueOf(datosnuevos);
        String[] separarsplit = datos123.split("\\{");
        String saparadorlisto = separarsplit[1];
        
        
        
        
        String[] orden1 = saparadorlisto.split(" ");
        String validandootravez = orden1[1];
       
        String[] orden234 = validandootravez.split(";");
        String instruccionsincoma = orden234[0];
                
        
       
       
        System.out.println(validandootravez);
         if (instruccionsincoma.equals(instrucciones)) {
            q12();
        } else {
             System.out.println("q11");
             System.out.println("q11");
this.jLabel12.setText("q11");
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg173211automatafinal/ciruclopequeño.png")));
         }
         
   }
   public void q12(){
       System.out.println("q12");
       this.jLabel13.setText("q12");
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg173211automatafinal/ciruclopequeño.png")));
        for (int coma = 0;coma<datosnuevos.length; coma++) {
            if (datosnuevos[coma] == ';') { 
                System.out.println(datosnuevos[coma]);
                q13();
            }
        }
   }
   public void q13(){
       
     System.out.println("q13");
       this.jLabel14.setText("q13");
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg173211automatafinal/ciruclopequeño.png")));
       datos123 = String.valueOf(datosnuevos);
        separarsplit2 = datos123.split("\\{");
        String saparadorlisto2 = separarsplit2[1];
        String[] orden12 = saparadorlisto2.split(" ");
        String validandootravez2 = orden12[2];
        
         
        
         if (validandootravez2.equals(retorno)) {
            q14();
            System.out.println(validandootravez2);
        } else {
             
             System.out.println("q14");
            System.out.println("q14");
       this.jLabel15.setText("q14");
         }
   }
   public void q14(){
       System.out.println("q14");
       this.jLabel15.setText("q14");
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg173211automatafinal/ciruclopequeño.png")));
       for (int espacio =0; espacio<datosnuevos.length;  espacio++) {
            if (datosnuevos[espacio] == ' ') {
                q15();
            }
        }
       
       
   }
   public void q15 (){
       this.jLabel16.setText("q15");
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg173211automatafinal/ciruclopequeño.png")));
       try {
       System.out.println("q15");
        datos123 = String.valueOf(datosnuevos);
        String[] retornandoxd = datos123.split(retorno);
        String sacarlaultimavariabledelretorno = retornandoxd[1];

        String[] parRetur = sacarlaultimavariabledelretorno.split(" ");
        nameparRetur = parRetur[1];
        
        String[] nuevonameparReturn  = nameparRetur.split(";");
        String nameparnuevolisto = nuevonameparReturn[0];
        System.out.println(nameparnuevolisto);
        if (!nameparnuevolisto.equals(letra) || !nameparnuevolisto.equals(voidd) || !nameparnuevolisto.equals(entero)|| !nameparnuevolisto.equals(booleano)|| !nameparnuevolisto.equals(floatt) || !nameparnuevolisto.equals(instrucciones) || !nameparnuevolisto.equals(retorno)) {                             
            q16();
            
            
        } else {
            System.out.println("Se quedo en q15");
           
            
        }
       } catch (Exception e){
           System.out.println("Cadena invalida");
       }
   }
   public void q16(){
        System.out.println("q16");
      
        this.jLabel17.setText("q16");
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg173211automatafinal/ciruclopequeño.png")));
        char [] nameparReturnn = nameparRetur.toCharArray();
         for (int comdadeultimavariables =0; comdadeultimavariables<nameparReturnn.length;  comdadeultimavariables++) {
            if (nameparReturnn[comdadeultimavariables] == ';') {
                
                  System.out.println(nameparReturnn);
                q17();
            }
        }
        
        
        
       
   } 
   public void q17(){
       this.jLabel18.setText("q17");
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg173211automatafinal/ciruclopequeño.png")));
       System.out.println("q17");
          datos123 = String.valueOf(datosnuevos);
        String[] holasoyjorgito =datos123.split("\\{");
                  
        String holasoyjorgito2 = holasoyjorgito[1];
        
        String[] orden12345u = holasoyjorgito2.split(" ");
        String validandootravez2fuckingultimavez = orden12345u[4];
        
        System.out.println(validandootravez2fuckingultimavez);
        
        if ( validandootravez2fuckingultimavez.equals("}")){
            q18();
        }
   }
   //VOID
   public void q19() {
         this.jLabel45.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jorge Julian Sanchez\\Desktop\\sasdadsa.png"));
        this.jLabel33.setText("q19");
        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg173211automatafinal/ciruclopequeño.png")));
        System.out.println("q19");
        
        int klan = datoreservado.length();
        try {
            if (datosnuevos[klan] == ' ') {
                q20();
            }
        } catch (Exception e) {
        }
               
    }
   public void q20 (){
       
       this.jLabel34.setText("q20");
        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg173211automatafinal/ciruclopequeño.png")));
         System.out.println("q20");
            datos123 = String.valueOf(datosnuevos);
            String[] nombrevoid = datos123.split(" ");
             validarsegundodevoid = nombrevoid[1];
            
            
        for (int vallest = 0; vallest < validarsegundodevoid.length(); vallest++) {
            
          char caracteer = validarsegundodevoid.toUpperCase().charAt(vallest);
          int valorASCII = (int)caracteer;
            if (valorASCII != 165 && (valorASCII < 65 || valorASCII >90 )){
                                    try {
                            System.out.println("No son letras");
                            System.out.println(tipodato);
                            System.out.println(valorASCII);
                            System.out.println("q20");
                            this.jLabel3.setText("Cadena invalida");
                            jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg173211automatafinal/ciruclopequeño.png")));
                                     break;
                                
                                    } catch (Exception e){}
                                    break;
                                    
            }else {
                 if (validarsegundodevoid.equals(letra) || validarsegundodevoid.equals(voidd) || validarsegundodevoid.equals(entero)|| validarsegundodevoid.equals(booleano) || validarsegundodevoid.equals(floatt) || validarsegundodevoid.equals(instrucciones) || validarsegundodevoid.equals(retorno)) {  
                System.out.println("q20");
                 this.jLabel34.setText("Cadena invalida");
        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg173211automatafinal/ciruclopequeño.png")));      
            } else {
                q21();
            }
            }
            
            
            //d
           
        }
        
        
        
       
   }
   public void q21() {
       this.jLabel35.setText("21");
        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg173211automatafinal/ciruclopequeño.png")));
        System.out.println("q21");
        int espacioq21 = datoreservado.length() + validarsegundodevoid.length() + 1;
        for (int papo = espacioq21; papo < datosnuevos.length; papo++) { 
            contadorVoid++;
            if (datosnuevos[papo] == ' ') {
                q22();
            }
            
                                                                }
    }
   public void q22(){
       this.jLabel36.setText("q22");
        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg173211automatafinal/ciruclopequeño.png")));
        System.out.println("q22");
        int parentesisparaq22 = datoreservado.length() + validarsegundodevoid.length() + 1;
        for (int j = parentesisparaq22; j < datosnuevos.length; j++) {
            
            if (datosnuevos[j] == '(') {
                q23();
                                       }
                                                                 }
   }
   public void q23() {
        this.jLabel37.setText("q23");
        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg173211automatafinal/ciruclopequeño.png")));
        System.out.println("q23");
        
        int espacioparaq23 = datoreservado.length() + validarsegundodevoid.length() + 3;
        
        int espacioparaq23v = datoreservado.length() + validarsegundodevoid.length() + 4;
        
        try{
            if (datosnuevos[espacioparaq23] == ')' || datosnuevos[espacioparaq23v] == ')') {
                q28();
            } else {
                    datos123 = String.valueOf(datosnuevos);
                    String[] parte3q23 = datos123.split("\\(");
                    cachaconespacio  = parte3q23[1];
                    String[] parte4q23 = cachaconespacio.split(" ");
                    cacha = parte4q23[0];
                    
                    if (cacha.equals(letra) || cacha.equals(voidd) || cacha.equals(entero)|| cacha.equals(booleano)|| cacha.equals(floatt) || cacha.equals(retorno) || cacha.equals(instrucciones)) {                       
                     
                        System.out.println(cacha);
                            q24();
                    }else {
                             this.jLabel37.setText("Cadena invalida");
                             jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg173211automatafinal/ciruclopequeño.png")));
                            System.out.println(cacha);
                        }
                          
            }
            
            
        }catch (Exception e){
            
        }
     
    }
   public void q24() {
        this.jLabel38.setText("q24");
        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg173211automatafinal/ciruclopequeño.png")));
        System.out.println("q24");
        int espacioq24 =  datoreservado.length() + validarsegundodevoid.length() + cacha.length() + 3;
        contadorVoid++;
        try {
            if (datosnuevos[espacioq24] == ' ') {
                q25();
            }
        } catch (Exception e) {
        }
        
        
        
    }
   public void q25(){
       this.jLabel38.setText("q25");
        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg173211automatafinal/ciruclopequeño.png")));
    System.out.println("q25");
        contadorVoid++;
        
        datos123 = String.valueOf(datosnuevos);
        String[] validandosplitdentrodeparentesis = datos123.split("\\(");
        validandotipodatodentrodeparentesis1 = validandosplitdentrodeparentesis[1];

        String[] validandotipodatodentrodeparentesisreal = validandotipodatodentrodeparentesis1.split(" ");
        String palabrareservadalista = validandotipodatodentrodeparentesisreal[1];

        String[] voidlisto = palabrareservadalista.split("\\)");
        aceptarvariable = voidlisto[0];

        if (aceptarvariable.equals(letra) || aceptarvariable.equals(voidd) || aceptarvariable.equals(entero)|| aceptarvariable.equals(booleano)|| aceptarvariable.equals(floatt) || aceptarvariable.equals(instrucciones)|| aceptarvariable.equals(retorno)) {
                
        this.jLabel38.setText("Cadena Invalida");
        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg173211automatafinal/ciruclopequeño.png")));
        System.out.println("q25");

        } else {
            q26();
        }
}    
   public void q26(){
       this.jLabel39.setText("q26");
        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg173211automatafinal/ciruclopequeño.png")));
        System.out.println("q26");
        contadorVoid++;
        
        int zain = validarsegundodevoid.length() + datoreservado.length() + aceptarvariable.length() + cacha.length() + 3;
        int zainav = validarsegundodevoid.length() + datoreservado.length() + aceptarvariable.length() + cacha.length() + 4;
        
       
       
        if (datosnuevos[zain] == ',') {
            System.out.println(datosnuevos[zain]);
            
            
         
            q27();
        }

        
        
        if (datosnuevos[zainav] == ')') {
            q28();
        }
    }   
   
   public void verifico(){
       datos123 = String.valueOf(datosnuevos);
       String [] dtokevsarkano = datos123.split("\\,");
       
       String lñl = dtokevsarkano[1];
       
       System.out.println(lñl);
   }
   
   public void q27(){
       this.jLabel40.setText("q27");
        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg173211automatafinal/ciruclopequeño.png")));
         System.out.println("q27");
         
        for (int u = 0; u < datosnuevos.length; u++) {
            contadorVoid++;
            if (datosnuevos[u] != ')') {
                System.out.println(datosnuevos[u]);
                
            }
        }
    }  
   public void q28(){
       this.jLabel41.setText("q28");
        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg173211automatafinal/ciruclopequeño.png")));
       System.out.println("q28");
        for (int i = 0; i < datosnuevos.length; i++) {
            contpos++;
            if (datosnuevos[i] == '{') {  
                System.out.println(datosnuevos[i]);
                q29();
                                     }
        }
    }  
   public void q29(){
       
       this.jLabel42.setText("q29");
        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg173211automatafinal/ciruclopequeño.png")));
        System.out.println("q29");

        datos123 = String.valueOf(datosnuevos);
        separadordeultimoq = datos123.split("\\{");
        String ultimosep = separadordeultimoq[1];
        
        
        
        String[] validarfinal = ultimosep.split(" ");
        String listo = validarfinal[1];
        System.out.println(listo);
        
        String [] validandolasinstruccionesxd = listo.split(";");
        String vaciandoesto = validandolasinstruccionesxd[0];
        System.out.println(vaciandoesto);
                
        if (vaciandoesto.equals(instrucciones)) {
            q30();
            
        }

        if (vaciandoesto.equals(letra) || vaciandoesto.equals(voidd) || vaciandoesto.equals(entero)|| vaciandoesto.equals(booleano)|| vaciandoesto.equals(floatt)) {
                this.jLabel42.setText("MAL");
                

        }
   }   
   public void q30(){
        this.jLabel44.setText("q30");
        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg173211automatafinal/ciruclopequeño.png")));
              for (int comaFINAL = 0;comaFINAL<datosnuevos.length; comaFINAL++) {
            if (datosnuevos[comaFINAL] == ';') { 
                System.out.println(datosnuevos[comaFINAL]);
                q31();
            }
            else {
                  this.jLabel44.setText("q30");
                   jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg173211automatafinal/ciruclopequeño.png")));
                
            }
        }

   }
   
   public void q31 (){
        this.jLabel20.setText("q31");
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg173211automatafinal/ciruclopequeño.png")));
        
        datos123 = String.valueOf(datosnuevos);
        String [] cierredelmetodo = datos123.split(";");
        String arkano = cierredelmetodo[1];
        System.out.println(arkano); 
        
        String [] dtoke = arkano.split(" ");
        String stigma = dtoke[1];
        
        String cierre = "}";
              System.out.println(stigma);     
        
        if (stigma.equals(cierre))
        {
            q18();
        }
        else {
        this.jLabel20.setText("q31");
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg173211automatafinal/ciruclopequeño.png")));
        }
   }
   
   
   
   public void q18(){
       
        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg173211automatafinal/ciruclopequeño.png")));
      this.jLabel19.setText("q18");
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg173211automatafinal/ciruclopequeño.png")));
       System.out.println("q18");
       System.out.println("FINAL");
       
       
       
   }
   public void validar2(){
                    contador--;
                    for(int a = contador; a<datosnuevos.length; a++){
                        contador++;
                        datos123 = String.valueOf(datosnuevos);
                        String[] part3 = datos123.split("\\(");
                        val_variablespace = part3[1];
                        String[] part4 = val_variablespace.split(" ");
                        val_variable = part4[0];
                        if (val_variable.equals(letra) || val_variable.equals(voidd) || val_variable.equals(entero)|| val_variable.equals(booleano)|| val_variable.equals(floatt)) {                       
                         q6();
                        } 
                 }
   }
   public void validar() {
        contadorVoid--;
        for (int o = contadorVoid; o<datosnuevos.length; o++) {
            contadorVoid++;
            datos123 = String.valueOf(datosnuevos);
            datosdelvoid= datos123.split("\\(");
            String validarVariable = datosdelvoid[1];
            String[] logic = validarVariable.split(" ");
            validarFinalVariable = logic[0];
            if (validarFinalVariable.equals(letra) || validarFinalVariable.equals(voidd) || validarFinalVariable.equals(entero)|| validarFinalVariable.equals(booleano)|| validarFinalVariable.equals(floatt) || !validarFinalVariable.equals(instrucciones) || !validarFinalVariable.equals(retorno)) {                                        
                q24();
                
                System.out.println(validarFinalVariable);
            }
        }
    }
    public Automata173211() {
        
        
        initComponents();
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.WHITE);
        setTitle("Automata Finito");
        
       
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel20 = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg173211automatafinal/ciruclopequeño.png"))); // NOI18N
        jLabel1.setText("Entrada");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg173211automatafinal/ciruclopequeño.png"))); // NOI18N
        jLabel3.setText("q2-------->");

        jLabel4.setText("q3-------->");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg173211automatafinal/ciruclopequeño.png"))); // NOI18N
        jLabel2.setText("q1-------->");

        jLabel12.setText("q11");

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg173211automatafinal/ciruclopequeño.png"))); // NOI18N
        jLabel13.setText("q12");

        jLabel14.setText("q13");

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg173211automatafinal/ciruclopequeño.png"))); // NOI18N
        jLabel15.setText("q14");

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg173211automatafinal/ciruclopequeño.png"))); // NOI18N
        jLabel16.setText("-------->q15");

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg173211automatafinal/ciruclopequeño.png"))); // NOI18N
        jLabel17.setText("-------->q16");

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg173211automatafinal/ciruclopequeño.png"))); // NOI18N
        jLabel18.setText("-------->q17");

        jLabel19.setText("q18");

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg173211automatafinal/ciruclopequeño.png"))); // NOI18N
        jLabel34.setText("q20");

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg173211automatafinal/ciruclopequeño.png"))); // NOI18N
        jLabel35.setText("q21");

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg173211automatafinal/ciruclopequeño.png"))); // NOI18N
        jLabel36.setText("q22");

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg173211automatafinal/ciruclopequeño.png"))); // NOI18N
        jLabel37.setText("q23");

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg173211automatafinal/ciruclopequeño.png"))); // NOI18N
        jLabel38.setText("q24");

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg173211automatafinal/ciruclopequeño.png"))); // NOI18N
        jLabel39.setText("q25");

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg173211automatafinal/ciruclopequeño.png"))); // NOI18N
        jLabel40.setText("q26");

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg173211automatafinal/ciruclopequeño.png"))); // NOI18N
        jLabel41.setText("q27");

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg173211automatafinal/ciruclopequeño.png"))); // NOI18N
        jLabel42.setText("q28");

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg173211automatafinal/ciruclopequeño.png"))); // NOI18N
        jLabel33.setText("q19");

        jLabel45.setText("jLabel45");

        jLabel6.setText("q5-------->");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg173211automatafinal/ciruclopequeño.png"))); // NOI18N
        jLabel5.setText("q4-------->");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg173211automatafinal/ciruclopequeño.png"))); // NOI18N
        jLabel7.setText("q6-------->");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg173211automatafinal/ciruclopequeño.png"))); // NOI18N
        jLabel8.setText("q7-------->");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg173211automatafinal/ciruclopequeño.png"))); // NOI18N
        jLabel9.setText("q8");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg173211automatafinal/ciruclopequeño.png"))); // NOI18N
        jLabel10.setText("q9");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg173211automatafinal/ciruclopequeño.png"))); // NOI18N
        jLabel11.setText("q10");

        jLabel28.setText("|");

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg173211automatafinal/ciruclopequeño.png"))); // NOI18N
        jLabel43.setText("q29");

        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg173211automatafinal/ciruclopequeño.png"))); // NOI18N
        jLabel44.setText("q30");

        jToggleButton1.setText("VALIDAR");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg173211automatafinal/ciruclopequeño.png"))); // NOI18N
        jLabel20.setText("q31");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98)
                .addComponent(jToggleButton1)
                .addGap(279, 279, 279))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel38)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(142, 142, 142)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel39))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel40)
                                        .addGap(90, 90, 90)
                                        .addComponent(jLabel41)
                                        .addGap(68, 68, 68)
                                        .addComponent(jLabel42))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel3)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel4)))
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel7)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1170, Short.MAX_VALUE)
                                        .addComponent(jLabel8))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel33)
                                            .addComponent(jLabel36)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel35)
                                                            .addComponent(jLabel34))
                                                        .addGap(391, 391, 391)
                                                        .addComponent(jLabel18)
                                                        .addGap(38, 38, 38)
                                                        .addComponent(jLabel17))
                                                    .addComponent(jLabel37))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel16)
                                                        .addGap(84, 84, 84)
                                                        .addComponent(jLabel15)
                                                        .addGap(64, 64, 64)
                                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel43)
                                                        .addGap(61, 61, 61)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel20)
                                                            .addComponent(jLabel44)))))
                                            .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(226, 226, 226))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap(144, Short.MAX_VALUE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 1610, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 87, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(jLabel10)
                        .addGap(64, 64, 64)
                        .addComponent(jLabel11)
                        .addGap(175, 175, 175)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel12))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(jLabel45)
                                .addGap(32, 32, 32)
                                .addComponent(jLabel33)
                                .addGap(101, 101, 101)
                                .addComponent(jLabel35)
                                .addGap(61, 61, 61)
                                .addComponent(jLabel34)))
                        .addGap(54, 54, 54)
                        .addComponent(jLabel36)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel37)
                        .addGap(81, 81, 81))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel19)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel20)
                        .addGap(59, 59, 59)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(jLabel39)
                    .addComponent(jLabel40)
                    .addComponent(jLabel41)
                    .addComponent(jLabel42)
                    .addComponent(jLabel43)
                    .addComponent(jLabel44))
                .addContainerGap(285, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap(1095, Short.MAX_VALUE)
                    .addComponent(jLabel28)
                    .addGap(0, 127, Short.MAX_VALUE)))
        );

        jScrollPane2.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        
        
        
        String leer = jTextArea1.getText();
        datosnuevos = leer.toCharArray();
        inicio();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

   
    public static void main(String args[]) {
       
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Automata173211.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Automata173211.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Automata173211.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Automata173211.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Automata173211().setVisible(true);
            }
        });
    }
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
