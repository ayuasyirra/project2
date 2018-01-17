
import java.util.Scanner;
class inputsoalan1
{
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
System.out.print("Masukkan Nama Kelas : ");
String namakelas=input.next();
System.out.print("Masukkan Bilangan Pelajar : ");
String bilanganpelajar=input.next();
System.out.print("Masukkan Nama Guru Kelas : ");
String namagurukelas=input.next();

System.out.println("\nNama Kelas:"+namakelas);
System.out.println("\nBilangan pelajar:"+bilanganpelajar);
System.out.println("\nNama Guru Kelas: "+namagurukelas);
}
}