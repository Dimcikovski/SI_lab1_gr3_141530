class Item {
	int id;
	String name;
	double price;
	//TODO add variable.
	char ddv_tip;
	//TODO constructor
	public Item(id,name,price,ddv_tip){
		this.id = id;
		this.name = name;
		this.price = price;
		this.ddv_tip = ddv_tip;
	}
	//TODO setters and getters
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id = id;
	}

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	public double getPrice(){
		return price;
	}

	public void setPrice(double price){
		this.price = price;
	}

	public char getDDVTip(){
		return ddv_tip;
	}

	public void setDDVTip(char ddv_tip){
		this.ddv_tip = ddv_tip;
	}


	double taxReturn () {
		//TODO
		double priceWithVAT = price * ( 1 + (ddv_tip/100) );
		double priceWithoutVAT = priceWithVAT / ( 1.15 );
		return priceWithoutVAT;
	}
}