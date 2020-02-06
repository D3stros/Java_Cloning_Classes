public class Store {
	
	private String name; //Name of shop
	private Warehouse warehouse; //Storage of warehouse
	private CashRegister cashRegister; //CashRegister of shop
	
	public Store(String name, Warehouse warehouse, CashRegister cashRegister) {
		this.name = name;
		this.warehouse = warehouse;
		this.cashRegister = cashRegister;
	}
	
	//Copy-Constructor
	public Store(Store otherStore) {
		this.name = otherStore.getName();
		
		Warehouse warehouse = new Warehouse(otherStore.getWarehouse().getAreaInSquareMeters());
		this.warehouse = warehouse;
		
		CashRegister cashRegister = new CashRegister(otherStore.getCashRegister().getMoney());
		this.cashRegister = cashRegister;
		
		
	}
	
	@Override
	public String toString() {
		return "Name of shop: " + this.name + ", Storage space "
				+ this.warehouse.getAreaInSquareMeters() + ", Money in cash register: "
				+ this.cashRegister.getMoney();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Warehouse getWarehouse() {
		return warehouse;
	}

	public void setWarehouse(Warehouse warehouse) {
		this.warehouse = warehouse;
	}

	public CashRegister getCashRegister() {
		return cashRegister;
	}

	public void setCashRegister(CashRegister cashRegister) {
		this.cashRegister = cashRegister;
	}
	
	
	
}
