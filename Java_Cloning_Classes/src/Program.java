public class Program {

	public static void main(String[] args) {
		
		Warehouse warehouse1 = new Warehouse(400);
		CashRegister cashRegister1 = new CashRegister(1000);
		
		Store store1 = new Store("Rewe Cologne", warehouse1, cashRegister1);
		Store store2 = new Store(store1);
		
		store2.setName("Rewe Berlin");
		store2.getWarehouse().setAreaInSquareMeters(2000);
		store2.getCashRegister().setMoney(3000);
		
		System.out.println(store1);
		System.out.println(store2);

	}

}
