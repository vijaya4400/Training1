package Task;

public class MainPack {
	public static void main(String[] args)
	{
		Espncricinfo es = new Espncricinfo();
		System.out.println(es.addBatman(1,"dhoni",10000,20,50,120,24,32));
		System.out.println(es.addBatman(3,"virat",11000,30,60,160,45,50));
		System.out.println(es.addBatman(4,"warner",10050,50,55,108,50,48));
		System.out.println(es.addBatman(6,"rashid",9000,10,25,110,15,20));
		es.getAllDetails();
	    es.getDetails(es.updateBatsmanStats(6,10000,35,45,76,23,576));
	    es.getDetails(es.getBatsman(1));
	    es.getAllDetails();
	}

}
