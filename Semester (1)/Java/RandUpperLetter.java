public class RandUpperLetter{
	public static void main(String args[]){
		int rndLetterNumber = 65 + (int)(Math.random()*26);
		System.out.println((char)rndLetterNumber);
		}
}