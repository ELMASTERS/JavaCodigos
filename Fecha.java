public class Fecha {

    private int ano;
    private int mes;
    private int dia;

    public void setAno(int a) {
        ano = a;
        normalizar();
    }

    public int getAno() {
        return ano;
    }

    public void setMes(int m) {
        mes = m;
        normalizar();
    }

    public int getMes() {
        return mes;
    }

    public void setDia(int d) {
        dia = d;
        normalizar();
    }

    public int getDia() {
        return dia;
    }

    public void reiniciar(int d, int m, int a) {
		dia = 1;
        mes = 1;
        ano = 1900; 
        normalizar();
    }

    public void adelantar(int d, int m, int a) {
        dia += d;
        mes += m;
        ano += a;
        normalizar();
    }

    public void normalizar() {
        if (ano < 1) {
            ano = 1;
        }
        if (mes < 1) {
            mes = 1;
        } else if (mes > 12) {
            mes = 12;
        }

        int maxDias = diasDelMes(mes);
        if (dia < 1) {
            dia = 1;
        } else if (dia > maxDias) {
            dia = maxDias;
        }
    }

    public void imprimir() {
        System.out.println("Fecha: " + dia + "/" + mes + "/" + ano);
    }

    private int diasDelMes(int mes) {
        switch (mes) {
            case 2:
                return esBisiesto() ? 29 : 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 31;
        }
    }

    private boolean esBisiesto() {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    public static void main(String args[]) {
        
        Fecha fecha = new Fecha();
	
		System.out.println("fecha reiniciada & normalizada");
        fecha.reiniciar(1, 1, 2022);
		fecha.imprimir();
		System.out.println("fecha adelantada & normalizada");
		fecha.adelantar(1, 1, 2022);
        fecha.imprimir();
    }
}
