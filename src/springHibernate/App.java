/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package springHibernate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springHibernate.service.MahasiswaService;
import springHibernate.view.MahasiswaView;

/**
 *
 * @author nazwaseptyasalsabilla
 */
public class App {
    private static ApplicationContext applicationContext;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        applicationContext = new ClassPathXmlApplicationContext("classpath:spring-Configuration.xml");
            new MahasiswaView().setVisible(true);
        }
        public static MahasiswaService getMahasiswaService(){
            return(MahasiswaService) applicationContext.getBean("Mahasiswa");
            }
        }
