package RevCode6;
public class codigo6 {

    public static void main(String[] args) {
        
    
        // I added a word "new" before int[20]
        int[] n = new int[20];

        // Add + in the incremental variable and .out. in the print 
	    for (int i = 0; i < 20; i++) {
	      n[i] = (int)(Math.random() * 381) + 20;
	      System.out.print(n[i] + " ");
	    }
	    //Add "n" word in the end of the print sentence
	    System.out.println("\n¿Qué números quiere resaltar? ");
	    System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
	    int opcion = Integer.parseInt(System.console().readLine());

	    int multiplo = (opcion == 1) ? 5 : 7;

        //foreach was changed to for
	    for(int e : n) {
            
	      if (e % multiplo == 0) {
	        System.out.print("[" + e + "] ");
          }else {
	        System.out.print(e + " ");
	      }
	    
       }
    
 }
}