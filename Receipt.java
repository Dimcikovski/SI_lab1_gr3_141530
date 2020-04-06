class Receipt {
	int id;
	List<Item> items = new LinkedList<items>();

	public Receipt(id,items){
		this.id = UUID.getID();
		this.name = items;
	}
	//TODO setters and getters
	public int getId(){
		return id;
	}

	public boolean addItem(Item item){
		items.Add(item);
	}

	public boolean removeItem(Item item){
		items.remove(item);
	}

	double calculatePrice () {

		double totalPrice = 0;
	
		for(Item item : items){
			price += item.price;
		}
	}
}