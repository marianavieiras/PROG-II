package principal;

public class Time2 {
	private int hora;
	private int minuto;
	private int segundo;

	public Time2() {
		this.hora = 0;
		this.minuto = 0;
		this.segundo = 0;
	}

	public Time2(int hora) {
		this.hora = hora;
		this.minuto = 0;
		this.segundo = 0;
	}

	public Time2(int hora, int minuto) {
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = 0;
	}

	public Time2(int hora, int minuto, int segundo) {
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}

	public void setHora(int hora) {
		if (hora >= 0 && hora < 24) {
			this.hora = hora;
		}
	}

	public void setMinuto(int minuto) {
		if (minuto >= 0 && minuto < 60) {
			this.minuto = minuto;
		}
	}

	public void setSegundo(int segundo) {
		if (segundo >= 0 && segundo < 60) {
			this.segundo = segundo;
		}
	}

	public int getHora() {
		return this.hora;
	}

	public int getMinuto() {
		return this.minuto;
	}

	public int getSegundo() {
		return this.segundo;
	}

	public Time2(Time2 time) {
		this.hora = time.getHora();
		this.minuto = time.getMinuto();
		this.segundo = time.getSegundo();
	}

	public String toUniversalString() {
		return String.format("%02d:%02d:%02d", getHora(), getMinuto(), getSegundo());
	}

	public String toString() {
		return String.format("%d:%02d:%02d %s", ((getHora() == 0 || getHora() == 12) ? 12 : getHora() % 12),
				getMinuto(), getSegundo(), (getHora() < 12 ? "AM" : "PM"));
	}

	public void tick() {
		segundo++;
		if (segundo >= 60) {
			segundo = 0;
			incrementaMinuto();
		}
	}

	public void incrementaMinuto() {
		minuto++;
		if (minuto >= 60) {
			minuto = 0;
			incrementaHora();
		}
	}

	public void incrementaHora() {
		hora++;
		if (hora >= 24) {
			hora = 0;
		}
	}

}
