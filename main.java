import java.util.*;

public class main
{
    public static void main()
    {

        Random generator = new Random();
        System.out.println("kkk");
        for(int i=0; i<100;i++)
        {
            System.out.println(""+((int)(Math.random() * ((2017-1950)+1)) + 1950)); // działa na przedziały np od 1950 do 2017
        }

        
        String[] imiona = {"Dawid","Antek","Janek","Patryk","Tomek","Andrzej","IsamUxPompa","Maciek","Michał"};
        String[] drugie_imiona={"Dawid","Antek","Janek","Patryk","Tomek","Andrzej","IsamUxPompa","Maciek","Michał"};
        String[] nazwiska ={"Kowalski","Mikołajczyk"};
        for(int i=0; i<100;i++)
        {
            int index_imie = generator.nextInt(imiona.length);
            System.out.println("Imie: "+imiona[index_imie]);
            int index_drugie_imie = generator.nextInt(drugie_imiona.length);
            if(index_imie != index_drugie_imie)
            {
               
            }
            else
            {
                while(index_imie == index_drugie_imie)
                {
                    index_drugie_imie = generator.nextInt(drugie_imiona.length);
                }
            }
            
            System.out.println("Drugie imie: "+drugie_imiona[index_drugie_imie]);
            System.out.println("Nazwiska: "+nazwiska[generator.nextInt(nazwiska.length)]); 
            System.out.println("========================================");
        }

    }
}
//dorob tablice miast min 20 miast,roszerszyc 1 imiona 2 imiona do 20 pozycji i dodaj losowanie wieku 