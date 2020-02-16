package com.cursoJava.cliente;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Generar el contenedor de beans indicando el archivo xml
        ApplicationContext contenedor =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Saludo objSaludo1 = contenedor.getBean("beanSaludo1", Saludo.class);
        Saludo objSaludo2 = contenedor.getBean("beanSaludo1", Saludo.class);
        
        System.out.println("Bean declarado como singleton");

        System.out.println("Son iguales los objetos? " + objSaludo1.equals(objSaludo2));
        System.out.println("Es el mismo objeto? " + (objSaludo1 == objSaludo2));

        System.out.println("---------------------------------------------------");

        Saludo objSaludo3 = contenedor.getBean("beanSaludo2", Saludo.class);
        Saludo objSaludo4 = contenedor.getBean("beanSaludo2", Saludo.class);

        System.out.println("Bean declarado como prototype");

        System.out.println("Son iguales los objetos? " + objSaludo3.equals(objSaludo4));
        System.out.println("Es el mismo objeto? " + (objSaludo3 == objSaludo4));
    }

}
