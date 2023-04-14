package presentation;
import dao.DaoImpl;
import dao.IDao;
import ext.DaoImpl2;
import metier.MetierImpl;

public class Presentation {
    public static void main(String[] args){
        /*
        Injection des dependances par
        instanciation statique => new
         */
        DaoImpl2 dao=new DaoImpl2();
        MetierImpl metier=new MetierImpl();
        metier.setDao(dao);
        System.out.println("resultat="+metier.calcul());
    }
}
