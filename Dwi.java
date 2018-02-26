package dwi;
import java.util.Scanner;
public class Dwi{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        Data[] data = new Data[2];
        
        System.out.println("input data1");
        System.out.print("nama:");
        String nama1 = input.nextLine();
        System.out.print("ipk:");
        double ipk1 = input.nextDouble();
        
        input.nextLine();
        
        System.out.println("input data2");
        System.out.print("nama:");
        String nama2 = input.nextLine();
        System.out.print("ipk:");
        double ipk2 = input.nextDouble();
        
        Data data1 = new Data(nama1, ipk1);
        System.out.println("tampil data-1");
        data1.Tampil();
        
        Data data2 = new Data(nama2, ipk2);
        System.out.println("tampil data-2");
        data2.Tampil();
    }
}
class Data {
    private String nama;
    private double ipk;
    public Data (String nama, double ipk){
        this.nama=nama;
        this.ipk=ipk;
    }
    public void Tampil(){
        System.out.println("nama:"+this.nama);
        System.out.println("ipk:"+this.ipk);
    }
}