
public class ListCollection implements Collection{
	
	String[] citiesname;
	
	public ListCollection() {
		citiesname = new String[]{"Fes", "El Jadida", "Casablanca", "Khrouribga", "Tanger", "Rabat"};
	}

	@Override
	public Iterator getIterator() {
		// TODO Auto-generated method stub
			
		return new ListIterator();
	}

	public class ListIterator implements Iterator{
		
		int index=0;
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return index<citiesname.length;
		}
	
		@Override
		public String getMore() {
			// TODO Auto-generated method stub

	         if(this.hasNext()){
	            return citiesname[index++];
	         }
			return null;
		}
	
	}

}
