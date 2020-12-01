
public class GridCollection implements Collection{
	String[][] trinome;
	
	public GridCollection(){
		trinome= new String[][] {
			{"Aya", "Sebti", "21"},
			{"Mohammed", "Rhaouti", "21"},
			{"El Hassan", "Chokraallah", "21"}
		};
	}
	
	@Override
	public Iterator getIterator() {
		// TODO Auto-generated method stub
		
		return new GridIterator();
	}
	public class GridIterator implements Iterator{
		int i=0, j=0;
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			
			return !(i==trinome.length-1 && j==trinome[i].length);
		}

		@Override
		public Object getMore() {
			// TODO Auto-generated method stub
			if (this.hasNext()){
				if (j==trinome[i].length && i<=trinome.length-1) {
					j=0;
					i++;
				}
	            return trinome[i][j++];
	         }
			return null;
		}
			}

}
