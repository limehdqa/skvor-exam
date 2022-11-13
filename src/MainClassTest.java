import org.junit.Test;

public class MainClassTest extends MainClass {

    MainClass Number = new MainClass();
    int b = Number.getLocalNumber();

    @Test
    public void testGetLocalNumber () {

    if (b == 14) {
        System.out.println("Успех! Метод равен 14");
    } else {
        System.out.println("пока-пока! Метод не равен 14");
    }
    }



}
