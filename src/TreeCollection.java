

public class TreeCollection implements Collection{
	String[][][][] trinome;
	public TreeCollection() {
		
	}

	@Override
	public Iterator getIterator() {
		// TODO Auto-generated method stub
		
		return new TreeIterator();
	}
	public class TreeIterator implements Iterator{

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			
			return false;
		}

		@Override
		public Object getMore() {
			// TODO Auto-generated method stub
			
			return null;
		}

	}

}
