import java.util.Scanner;
public class waktu{
	
	public static void main(String[] args){
		String jam, menit, detik;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input jam : ");
			jam=input.nextLine();
		System.out.print("Input menit : ");
			menit=input.nextLine();
		System.out.print("Input detik : ");
			detik=input.nextLine();
		
		
		System.out.println("\nHasil :\nWaktu");
		System.out.println("jam 		: "+(jam));
		System.out.println("menit		: "+(menit));
		System.out.println("detik 	: "+(detik));
		
	}

} 
