class File{
    String Name;
    int Size;
    String Date;
    int Amount;

    File(String name, int size, String date,int amount){
        this.Name = name;
        this.Size = size;
        this.Date = date;
        this.Amount = amount;
    }
}
public class Main {
    public static void main(String[] args){
        File[] files = {
                new File("Horizon Zero Dawn",5000,"11/12/2005", 11),
                new File("RDR 2", 7000, "21/01/2001", 21),
                new File("Преступление Наказание", 9000,"22/02/2002", 15)
        };
        System.out.println("список файлов, размер которых превышает заданный: ");
        for (int i = 0; i < files.length; i++) {
            if (files[i].Size > 6000 ) {
                System.out.println(files[i].Name);
            }
        }
        System.out.println("список файлов, число обращений к которым превышает заданное: ");
        for (int i = 0; i < files.length; i++){
            if ( files[i].Amount > 15 ){
                System.out.println(files[i].Name);
            }
        }
    }
}