package net.instituto.desa;

public class Jugador {
	int y, x;

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	
	public void movimientoDerecha() {
		setX(getX() + 1);
	}
	
	public void movimientoIzquierda() {
		setX(getX() - 1);
	}
	
	public void movimientoArriba() {
		setY(getY() - 1);
	}
	
	public void movimientoAbajo() {
		setY(getY() - 1);
	}

}
