package sistema ;
import java.io.*;
public class Arquivo{
  public static void salvar(DataStore ds) {
        try(ObjectOutputStream oos =
            new ObjectOutputStream(
                new FileOutputStream("dados_escola.dat"))) {

            oos.writeObject(ds);

        } catch (Exception e) {
            System.out.println("Erro ao salvar");
        }
    }

    public static DataStore carregar() {
        try(ObjectInputStream ois =
            new ObjectInputStream(
                new FileInputStream("dados_escola.dat"))) {

            return (DataStore) ois.readObject();

        } catch (Exception e) {
            return new DataStore();
        }
    }
}