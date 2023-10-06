package Array;

public class array {
    public static void main(String[] args) {
       //Pelatihan Array
       String[][] absensi = {{"Resha Yuana Putri Endrianto","2255201014"}, {"Achmad Muzaki","2255201023"}, {"Malmedira Fisyara","2255201024"}, {"Achmad Alvi Yudanuari","2255201034"}, {"Alifatus Safa'ah","2255201050"}, {"Ady Alzhava Nuary","2255201053"}};
       
        for (int i=0; i<absensi.length; i++){
            System.out.println("Nama    : " + absensi[i][0]);
            System.out.println("NIM     : " + absensi[i][1]);
            System.out.println("------------------------");
        }
    }
    }
