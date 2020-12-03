public class Main
{
	public static void main(String[] args) {
		
        TreeCollection treeN = new TreeCollection();
        for(Iterator iter = treeN.getIterator(); iter.hasNext();){
            int num = (int)iter.getMore();
            System.out.println(num);
        }
	}
}