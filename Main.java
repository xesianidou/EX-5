import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner (System.in);

		Singer frank = new Singer ("Frank Sinatra");
		Singer wham = new Singer ("Wham!");
		Singer mariah = new Singer ("Mariah Carey");
		Singer chris = new Singer ("Chris Rea");
		Singer sia = new Singer ("Sia");

		Song song1 = new Song ("All I Want for Christmas Is You",mariah,"https://www.youtube.com/watch?v=yXQViqx6GMY" );
		Song song2 = new Song ("White Christmas",frank, "https://www.youtube.com/watch?v=q_XzZNCDWCA" );
		Song song3 = new Song ("Last Christmas",wham, "https://www.youtube.com/watch?v=E8gmARGvPlI" );
		Song song4 = new Song ("Driving home for christmas",chris, "https://www.youtube.com/watch?v=EvDxSW8mzvU");
		Song song5 = new Song ("Santa's Coming For Us",sia, "https://www.youtube.com/watch?v=V3EYjVPRClU" );
		Song song6 = new Song ("Let It Snow!Let It Snow!Let It Snow!",frank, "https://www.youtube.com/watch?v=vGRC2LYmHfU");


		while (true){
			System.out.println("\n------ Welcome to our DMST Christmas Music Application ------");
			System.out.println("Type 1 to display singers' list ");
			System.out.println("Type 2 to display Franks' Synatra available songs ");

			int choice = scanner.nextInt();

			if (choice == 1){
				System.out.println("\nList of Singers: ");
				   for (int i=0;i<Singer.singers.length;i++){
					  if (Singer.singers[i]!= null)
						System.out.println(Singer.singers[i].toString());

				}
			}
			else if (choice == 2 ){
					int singercounter=0;
					for(int y=0; y<Song.songs.length; y++){
					  if(Song.songs[y]!= null){
						if (frank.equals(Song.songs[y].getSinger())){
						  singercounter++;
						}
					}
				}
					System.out.println("\n"+singercounter+" songs were found");
					   for(int y=0; y<Song.songs.length; y++){
						 if(Song.songs[y]!= null){
						    if (frank.equals(Song.songs[y].getSinger())){
						     System.out.println("song: "+Song.songs[y].getTitle()+ " ,url to listen "+ Song.songs[y].getUrl());

							}
						}
					}
			}
			 else  {
		    System.out.println("wrong input");

		}
	}
}
}
