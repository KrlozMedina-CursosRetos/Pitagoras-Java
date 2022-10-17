package pitagoras;
import javax.swing.*;

public class Pitagoras {


    public static void main(String[] args) {
        
        String x,y,cajas,opc;
        int a,b,c,d,t,ca,m=0,n=0,u=0,v=0,o;
        JOptionPane.showMessageDialog(null,"Hallar el cuadrante y la magnitud de un punto en coordenada cartesiana");
        //Begin
        opc=JOptionPane.showInputDialog("Si desea ingresar datos de coordenadas cartesianas escriba 1\nSi desea salir oprima 2");
        o=Integer.parseInt(opc);
        if(o==1){
        cajas=JOptionPane.showInputDialog("¿Cuantas coordenadas desea ingresar?");
        ca=Integer.parseInt(cajas);
        if(ca<=0){JOptionPane.showMessageDialog(null,"Ha ingresa un valor negativo o nulo\nel programa finalizara");}else{
        for(int k=1;k<=ca;k++){
            x=JOptionPane.showInputDialog("Ingresar coordenada x");
            y=JOptionPane.showInputDialog("Ingresar coordenada y");
            a=Integer.parseInt(x);
            b=Integer.parseInt(y);
            if(a<=0)
            {
                if(b<=0)
                {
                    JOptionPane.showMessageDialog(null,"Esta en el cuadrante 3");
                    System.out.println("Coordenadas "+a+" y "+b+" y esta en el cuadrante 3");
                    m=m+1;
                }else{JOptionPane.showMessageDialog(null,"Esta en el cuadrante 2");
                System.out.println("Coordenadas "+a+" y "+b+" y esta en el cuadrante 2");
                n=n+1;}
            }else
            {
                if(b<=0)
                {
                    JOptionPane.showMessageDialog(null,"Esta en el cuadrante 4");
                    System.out.println("coordenadas "+a+" y "+b+" y esta en el cuadrante 4");
                    u=u+1;
                }else{JOptionPane.showMessageDialog(null,"Esta en el cuadrante 1");
                System.out.println("coordenadas "+a+" y "+b+" y esta en el cuadrante 1");
                v=v+1;}        
            }
            c=a*a;
            d=b*b;
            t=c+d;
            JOptionPane.showMessageDialog(null,"La magnitud de la coordenadas dadas es\n"+Math.sqrt(t));
            System.out.println("La magnitud de la coordenadas dadas es "+(Math.sqrt(t)));}
            JOptionPane.showMessageDialog(null,"Puntos en el cuadrante 1: "+v+"\nPuntos en el cuadrante 2: "+n+"\nPuntos en el cuadrante 3: "+m+"\nPuntos en el cuadrante 4: "+u);
            System.out.println("\nPuntos en el cuadrante 1: "+v+"\nPuntos en el cuadrante 2: "+n+"\nPuntos en el cuadrante 3: "+m+"\nPuntos en el cuadrante 4: "+u);}}
            JOptionPane.showMessageDialog(null,"Hecho por K-rloz Medina, exiga legalidad\n\n:D");
        
        }
    //return opc;
}
