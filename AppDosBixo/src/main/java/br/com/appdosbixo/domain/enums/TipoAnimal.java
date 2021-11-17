package br.com.appdosbixo.domain.enums;

public enum TipoAnimal {

	Bovino(1),
	Suino(2),
	Ovino(3);
	
	private int code;
	
	private TipoAnimal(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
	
	public static TipoAnimal valueOf(int code) {
		for (TipoAnimal value : TipoAnimal.values()) {
			if (value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid OrderStatus code");
	}
	
}
