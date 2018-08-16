package convertvocal2angka;
import java.util.Scanner;
public class convertvocal2angka {
    public static void tampilJudul(String identitas) {
        System.out.println("Identitas : "+ identitas);
        
        System.out.println("\nConvert Kalimat Alay Angka (Vokal Ke Angka)\n");
        
    }
    public static String tampilInput() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukkan kalimat: ");
        String kalimat = scanner.nextLine();
        System.out.println("Kalimat Asli : " + kalimat);
        
        return kalimat;
    }
    private static void tampilPerkata(String kalimat, String convert) {
        String[] arrKal = kalimat.split(" ");
        String[] arrCon = convert.split(" ");
        
        for(int i=0;i<arrKal.length;i++)
            System.out.println(arrKal[i]+" => "+ arrCon[i]);
    }
    private static void tampilHasil(String convert)
    {
        System.out.println("Kalimat Alay Angka: "+ convert);
    }
    
}
